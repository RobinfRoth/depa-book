package command.remote;

// Receiver (3rd party library)

public class Light {

    private String location;

    public Light(String l) {
        location = l;
    }

    public void on() {
        System.out.printf("%s: Licht is an\n", location);
    }

    public void off() {
        System.out.printf("%s: Licht is aus\n", location);
    }
}
