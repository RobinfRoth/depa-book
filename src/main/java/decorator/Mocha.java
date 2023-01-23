package decorator;

// concrete decorator

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", mocha";
    }

    public double cost() {
        return beverage.cost() + .2;
    }

}
