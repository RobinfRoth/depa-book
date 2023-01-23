package decorator;

// component

public abstract class Beverage {
    String description = "Unbekanntes Getränk";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
