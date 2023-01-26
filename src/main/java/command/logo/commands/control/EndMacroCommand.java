package command.logo.commands.control;

import command.logo.MacroManager;

public class EndMacroCommand extends AbstractMacroCommand {

	public EndMacroCommand(MacroManager macroManager) {
		super(macroManager);
	}

	@Override
	public void execute() {
		getMacroManager().endMacro();
	}

	@Override
	public String toString() {
		return "Ending macro recording.";
	}
}
