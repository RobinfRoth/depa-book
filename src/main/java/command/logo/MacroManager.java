package command.logo;


import command.logo.commands.Command;
import command.logo.commands.turtle.TurtleCommand;

public interface MacroManager{
	boolean isRecordingMacro();
	void addCommand(TurtleCommand command);
	void startMacro(String name);
	Command getCommand(String name);
	void endMacro();
}

