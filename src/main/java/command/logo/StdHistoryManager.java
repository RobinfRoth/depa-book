package command.logo;

import command.logo.commands.turtle.TurtleCommand;

import java.util.*;

public class StdHistoryManager implements HistoryManager {
	private final LogoInterpreter interpreter;
	private final Deque<TurtleCommand> history;
	private final Deque<TurtleCommand> undone;

	public StdHistoryManager(LogoInterpreter interpreter) {
		this.interpreter = interpreter;
		history = new ArrayDeque<>();
		undone = new ArrayDeque<>();
	}

	/**
	 * Adds a command to the history. The invoker of the add method is responsible
	 * to execute the command, method add only registers the command in the
	 * history for a subsequent undo/redo call.
	 */
	@Override
	public void addCommand(TurtleCommand command) {
		history.add(command);
		undone.clear();
	}

	/**
	 * Clears the history.
	 */
	@Override
	public void clear() {
		history.clear();
	}

	/**
	 * Performs an undo operation with the effect, that method getCommand returns
	 * a list which does not contain the latest operation. If an undo is not
	 * possible as the list of commands is empty, a message should be printed on
	 * the console. Method undo is also responsible to actualize the window by
	 * invoking interpreter.repaint().
	 */
	@Override
	public void undo() {
		try {
			undone.push(history.removeLast());
		} catch (NoSuchElementException nse) {
			System.err.println("No Commands in history. Unable to undo last action!\n Error: " + nse);
		}

		interpreter.repaint();
	}

	/**
	 * Restores the least recently undone operation. If a redo is not possible as
	 * no pending undone commands are available, a message should be printed on
	 * the console. Method redo is also responsible to actualize the window by
	 * executing the command to redo.
	 */
	@Override
	public void redo() {
		try {
			history.add(undone.pop());
		} catch (NoSuchElementException nse) {
			System.err.println("No undone commands available. Unable to redo!\n Error:" + nse);
		}

		interpreter.repaint();
	}

	/**
	 * Returns all commands which have been registered. This method is used by
	 * method LogoInterpreter.repaint().
	 */
	@Override
	public Iterable<TurtleCommand> getCommands() {
		return history;
	}
}
