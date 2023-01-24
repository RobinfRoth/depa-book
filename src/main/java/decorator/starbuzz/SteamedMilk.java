package decorator.starbuzz;

// concrete decorator

public class SteamedMilk extends CondimentDecorator {
    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
        setSize(beverage.getSize());
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Steamed Milk";
    }

    @Override
    public double cost() {
        var extraCharge = getSize().ordinal() * 0.05;
        return beverage.cost() + 0.1 + extraCharge;
    }
}
