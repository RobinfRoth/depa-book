package decorator;

// concrete component

public class DarkRoast extends Beverage {
    public DarkRoast() {
        super("Dark Roast");
    }

    public double cost() {
        return .99;
    }
}
