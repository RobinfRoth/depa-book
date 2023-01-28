package factory.pizzaAbstractFactory;

public class ReggianoCheese implements Cheese {
    private final String name;

    public ReggianoCheese() {
        this.name = "Reggiano Cheese";
    }

    @Override
    public String getName() {
        return name;
    }
}

