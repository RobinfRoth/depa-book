package command.remote;

// concrete command

public class GarageDoorUpCommand implements Command {
    private GarageDoor garageDoor; // receiver

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up(); // action
    }

    @Override
    public void undo() {
        garageDoor.down(); // revert action
    }

}
