package command.remote;

// Command Interface

public interface Command {
    public void execute();
    public void undo();
}
