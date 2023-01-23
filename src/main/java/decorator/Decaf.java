package decorator;

// concrete component

public class Decaf extends Beverage {
    public Decaf() {
        super("Decaf");
    }

    public double cost() {
        return 1.05;
    }
}
