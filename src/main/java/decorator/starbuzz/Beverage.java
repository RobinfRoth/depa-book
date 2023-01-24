package decorator.starbuzz;

// component

public abstract class Beverage {
    public enum Size { TALL, GRANDE, VENTI }
    private Size size;
    private String description;

    public Beverage() {
        description = "Unbekanntes Getränk";
        size = Size.TALL;
    }

    public Beverage(String description, Size size) {
        this.description = description;
        this.size = size;
    }

    public String getDescription() {
        return size.name() + " " + description;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public abstract double cost();
}
