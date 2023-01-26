package command.logo.commands.control;

import command.logo.LogoInterpreter;

public class ClearScreenCommand implements ControlCommand {
	private final LogoInterpreter interpreter;

	public ClearScreenCommand(LogoInterpreter interpreter) {
		this.interpreter = interpreter;
	}

	@Override
	public void execute() {
		interpreter.resetTurtle();
		interpreter.getHistoryManager().clear();
	}

	@Override
	public String toString() {
		return "Resetting graphics.";
	}

}
