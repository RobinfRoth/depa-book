package command.remote;

// Concrete Command

public class StereoOnWithCdCommand implements Command {

    private final Stereo stereo; // receiver

    public StereoOnWithCdCommand(Stereo s) {
        stereo = s;
    }

    @Override
    public void execute() {
        // action: turn on stereo, insert cd and set volume > combined to one OnWithCd command
        stereo.on();
        stereo.setCd("The Wall [Remastered]");
        stereo.setVolume(42);
    }

    @Override
    public void undo() {}
}
