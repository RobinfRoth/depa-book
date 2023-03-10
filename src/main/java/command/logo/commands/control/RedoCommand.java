package command.logo.commands.control;

import command.logo.HistoryManager;

public class RedoCommand extends AbstractHistoryCommand {

	public RedoCommand(HistoryManager historyManager) {
		super(historyManager);
	}

	@Override
	public void execute() {
		getHistoryManager().redo();
	}

	@Override
	public String toString() {
		return "Redoing command...";
	}
}
