package command.remote;

// Concrete Command

public class CeilingFanMediumCommand implements Command {

    private CeilingFan ceilingFan; // Receiver
    private CeilingFan.Level prevSpeed; // previous State

    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.medium();
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
