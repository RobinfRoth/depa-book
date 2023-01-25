package command.remote;

// Concrete Command

public class LightOffCommand implements Command {

    private final Light light; // receiver

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off(); // action
    }

    @Override
    public void undo() {
        light.on(); // reverse action from execute
    }
}
