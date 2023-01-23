package decorator;

// concrete component

public class Decaf extends Beverage {
    public Decaf(Size size) {
        super("Decaf", size);
    }

    public double cost() {
        return 1.05;
    }
}
