package command.logo.commands.control;

import command.logo.HistoryManager;

public abstract class AbstractHistoryCommand implements ControlCommand {
	private final HistoryManager historyManager;

	public AbstractHistoryCommand(HistoryManager historyManager) {
		this.historyManager = historyManager;
	}

	public final HistoryManager getHistoryManager() { 
		return historyManager;
	}

}
