package command.logo.commands.turtle;

import command.logo.Turtles;

public class PenDownCommand implements TurtleCommand {
	private final Turtles turtles;

	public PenDownCommand(Turtles turtles) {
		this.turtles = turtles;
	}

	@Override
	public void execute() {
		turtles.down();
	}

	@Override
	public String toString() {
		return "Putting pen down.";
	}

}
