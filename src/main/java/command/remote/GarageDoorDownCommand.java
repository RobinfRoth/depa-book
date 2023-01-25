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

}
