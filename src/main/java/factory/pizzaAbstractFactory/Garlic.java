package factory.pizzaAbstractFactory;

public class Garlic implements Veggie {
    private final String name;

    public Garlic() {
        this.name = "Garlic";
    }

    @Override
    public String getName() {
        return name;
    }
}

