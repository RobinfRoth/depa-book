package factory.pizzaAbstractFactory;

public class SlicedPepperoni implements Pepperoni {
    private final String name;

    public SlicedPepperoni() {
        this.name = "Sliced Pepperoni";
    }

    @Override
    public String getName() {
        return name;
    }
}

