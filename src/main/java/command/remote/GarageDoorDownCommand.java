package command.remote;

// concrete command

public class GarageDoorDownCommand implements Command {
    private GarageDoor garageDoor; // receiver

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down(); // action
    }

    @Override
    public void undo() {
        garageDoor.up(); // revert action
    }

}
