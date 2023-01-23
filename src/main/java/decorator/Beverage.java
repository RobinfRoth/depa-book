package decorator;

// component

public abstract class Beverage {
    private String description = "Unbekanntes Getränk";

    public Beverage(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
