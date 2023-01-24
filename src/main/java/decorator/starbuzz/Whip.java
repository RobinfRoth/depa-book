package decorator.starbuzz;

// concrete decorator

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        this.beverage = beverage;
        setSize(beverage.getSize());
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        var extraCharge = getSize().ordinal() * 0.05;
        return beverage.cost() + .10 + extraCharge;
    }
}
