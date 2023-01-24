package decorator.starbuzz;

// concrete decorator

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        this.beverage =  beverage;
        setSize(beverage.getSize());
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        var extraCharge = getSize().ordinal() * 0.05;
        return beverage.cost() + .15 + extraCharge;
    }
}
