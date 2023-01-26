package command.logo.commands.control;

import command.logo.LogoInterpreter;

public class ExitCommand implements ControlCommand {
	private final LogoInterpreter interpreter;

	public ExitCommand(LogoInterpreter interpreter) {
		this.interpreter = interpreter;
	}

	@Override
	public void execute() {
		interpreter.stop();
	}

	@Override
	public String toString() {
		return "Exiting.";
	}

}
