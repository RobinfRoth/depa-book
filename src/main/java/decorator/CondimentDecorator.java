package decorator;

// abstract decorator

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage; // wrapped object
    public abstract String getDescription();
}
