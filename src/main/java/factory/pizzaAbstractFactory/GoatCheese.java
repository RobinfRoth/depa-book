package factory.pizzaAbstractFactory;

public class GoatCheese implements Cheese {
    private final String name;

    public GoatCheese() {
        this.name = "Goat Cheese";
    }

    @Override
    public String getName() {
        return name;
    }
}

