package decorator;

// abstract decorator

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage; // wrapped object (composition)
    public abstract String getDescription();
}
