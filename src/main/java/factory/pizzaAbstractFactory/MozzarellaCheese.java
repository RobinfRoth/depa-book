package factory.pizzaAbstractFactory;

public class MozzarellaCheese implements Cheese {
    private final String name;

    public MozzarellaCheese() {
        this.name = "Mozzarella Cheese";
    }

    @Override
    public String getName() {
        return name;
    }
}

