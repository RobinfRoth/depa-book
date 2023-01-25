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

}
