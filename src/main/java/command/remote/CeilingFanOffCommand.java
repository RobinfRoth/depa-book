package command.remote;

// Concrete Command

public class CeilingFanOffCommand implements Command {

    private CeilingFan ceilingFan; // Receiver
    private CeilingFan.Level prevSpeed; // previous State

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.off();
    }

    @Override
    public void undo() {
        switch (prevSpeed) {
            case HIGH   -> ceilingFan.high();
            case MEDIUM -> ceilingFan.medium();
            case LOW    -> ceilingFan.low();
            default     -> ceilingFan.off();
        }
    }

}
