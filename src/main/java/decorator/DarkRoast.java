package decorator;

// concrete component

public class DarkRoast extends Beverage {
    public DarkRoast(Size size) {
        super("Dark Roast", size);
    }

    public double cost() {
        return .99;
    }
}
