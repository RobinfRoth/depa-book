package command.remote;

// Receiver (3rd party library)

public class Stereo {

    private final String location;
    private String currentCD;
    private String currentDVD;
    private String currentRadio;
    private int volume;

    public Stereo(String l) {
        location = l;
        currentCD = null;
        currentDVD = null;
        currentRadio = null;
        volume = 10;
    }

    public void on() {
        System.out.println(location + ": Stereo ist an.");
    }

    public void off() {
        System.out.println(location + ": Stereo ist aus.");
    }

    public void setCd(String cd) {
        currentCD = cd;
        System.out.printf("%s: CD %s eingelegt.\n", location, currentCD);
    }

    public void setDvd(String dvd) {
        currentDVD = dvd;
        System.out.printf("%s: CD %s eingelegt.\n", location, currentDVD);
    }

    public void setRadio(String radio) {
        currentRadio = radio;
        System.out.printf("%s: Momentan hören Sie: %s.\n", location, currentRadio);
    }

    public void setVolume(int newVolume) {
        volume = newVolume;
        System.out.printf("%s: Lautstärke auf %d gesetzt.\n", location, volume);
    }

}
