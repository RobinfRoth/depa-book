package command.logo;

import command.logo.commands.Command;
import command.logo.commands.control.NotFoundCommand;
import command.logo.commands.turtle.CompositeCommand;
import command.logo.commands.turtle.TurtleCommand;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class StdMacroManager implements MacroManager {
	private final LogoInterpreter interpreter;

	private boolean isRecording;

	private String currentMacroName;

	private CompositeCommand currentMacroCommands;

	private final Map<String, CompositeCommand> macros;

	public StdMacroManager(LogoInterpreter interpreter) {
		this.interpreter = interpreter;
		isRecording = false;
		macros = new HashMap<>();
	}

	/**
	 * Indicates whether a macro is currently being recorded.
	 */
	@Override
	public boolean isRecordingMacro() {
		return isRecording;
	}

	/**
	 * Adds a command to the current macro. If this method is invoked while no
	 * macro is being recorded, then a NullPointerException should be thrown.
	 */
	@Override
	public void addCommand(TurtleCommand command) {
		if (! isRecording) {
			throw new NullPointerException();
		}

		interpreter.setColor(Color.red);
		command.execute();
		currentMacroCommands.add(command);
	}

	/**
	 * Starts the recording of a new macro.
	 */
	@Override
	public void startMacro(String name) {
		if (isRecording) {
			return;
		}

		isRecording = true;
		currentMacroCommands = new CompositeCommand(name);
		currentMacroName = name;
	}

	/**
	 * Closes the recording of the current macro and registers the macro under its
	 * name.
	 */
	@Override
	public void endMacro() {
		if (! isRecording) {
			return;
		}

		isRecording = false;
		interpreter.repaint();
		macros.put(currentMacroName, currentMacroCommands);
		currentMacroName = "";
	}

	/**
	 * Returns the macro command with a given name. If no macro can be found with
	 * this name, then a NotFoundCommand is returned.
	 */
	@Override
	public Command getCommand(String name) {
		var commandsOfMacro = macros.get(name);

		if (commandsOfMacro == null) {
			return new NotFoundCommand(name);
		}

		return commandsOfMacro;
	}
}
