package command.logo.commands.turtle;

import command.logo.Turtles;

public class PenUpCommand implements TurtleCommand {
	private final Turtles turtles;

	public PenUpCommand(Turtles turtles) {
		this.turtles = turtles;
	}

	@Override
	public void execute() {
		turtles.up();
	}

	@Override
	public String toString() {
		return "Lifting pen up.";
	}

}
