package command.remote;

// Concrete Command

public class LightOnCommand implements Command {

    private final Light light; // receiver

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on(); // action
    }
}
