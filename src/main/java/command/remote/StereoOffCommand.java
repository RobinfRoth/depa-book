package command.remote;

// Concrete Command

public class StereoOffCommand implements Command {

    private final Stereo stereo; // receiver

    public StereoOffCommand(Stereo s) {
        stereo = s;
    }

    @Override
    public void execute() {
        stereo.off(); // action
    }

    @Override
    public void undo() {
        stereo.on();
    }
}
