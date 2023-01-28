package factory.pizzaAbstractFactory;

public class Mushroom implements Veggie {
    private final String name;

    public Mushroom() {
        this.name = "Mushroom";
    }

    @Override
    public String getName() {
        return name;
    }
}

