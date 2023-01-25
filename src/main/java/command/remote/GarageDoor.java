package command.remote;

// Receiver (3rd party library)

public class GarageDoor {

    private final String location;

    public GarageDoor(String l) {
        location = l;
    }

    public void up() {
        System.out.println(location + ": Garagentür ist auf.");
    }

    public void down() {
        System.out.println(location + ": Garagentür ist zu.");
    }

    public void stop() {
        System.out.println(location + ": Garagentür ist gestoppt.");
    }

    public void lightOn() {
        System.out.println(location + ": Garagentür Licht ist an.");
    }

    public void lightOff() {
        System.out.println(location + ": Garagentür Licht ist aus.");
    }


}
