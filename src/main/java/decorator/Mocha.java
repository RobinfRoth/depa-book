package decorator;

// concrete decorator

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
        setSize(beverage.getSize());
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        var extraCharge = getSize().ordinal() * 0.05;
        return beverage.cost() + .2 + extraCharge;
    }

}
