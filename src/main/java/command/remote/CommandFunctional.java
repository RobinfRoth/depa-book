package command.remote;

// Command Interface (functional)
// does include undo feature, since it would no longer be a FunctionalInterface

@FunctionalInterface
public interface CommandFunctional {
    public void execute();
}
