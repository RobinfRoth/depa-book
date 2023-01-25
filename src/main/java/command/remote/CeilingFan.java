package command.remote;

public class CeilingFan {

    private String location;

    enum Level {OFF, LOW, MEDIUM, HIGH}
    Level level;


    public CeilingFan(String location) {
        this.location = location;
    }

    public void high() {
        // turns the ceiling fan on to high
        level = Level.HIGH;
        System.out.println(location + " ceiling fan is on high");

    }

    public void medium() {
        // turns the ceiling fan on to medium
        level = Level.MEDIUM;
        System.out.println(location + " ceiling fan is on medium");
    }

    public void low() {
        // turns the ceiling fan on to low
        level = Level.HIGH;
        System.out.println(location + " ceiling fan is on low");
    }

    public void off() {
        // turns the ceiling fan off
        level = Level.OFF;
        System.out.println(location + " ceiling fan is off");
    }

    public Level getSpeed() {
        return level;
    }
}

