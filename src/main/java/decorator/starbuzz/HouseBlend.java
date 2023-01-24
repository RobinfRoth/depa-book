package decorator.starbuzz;

// concrete component

public class HouseBlend extends Beverage {

    public HouseBlend(Size size) {
        super("House Blend", size);
    }

    public double cost() {
        return .89;
    }
}
