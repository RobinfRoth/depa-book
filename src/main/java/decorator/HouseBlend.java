package decorator;

// concrete component

public class HouseBlend extends Beverage {

    public HouseBlend() {
        super("House Blend");
    }

    public double cost() {
        return .89;
    }
}
