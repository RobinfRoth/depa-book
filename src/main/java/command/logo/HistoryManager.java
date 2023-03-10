package command.logo;

import command.logo.commands.turtle.TurtleCommand;

public interface HistoryManager {
	void addCommand(TurtleCommand command);
	void clear();
	void undo();
	void redo();
	Iterable<TurtleCommand> getCommands();
}
