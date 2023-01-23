package decorator;

// concrete component

public class Espresso extends Beverage {

    public Espresso(Size size) {
        super("Espresso", size);
    }

    public double cost() {
        return 1.99;
    }
}
