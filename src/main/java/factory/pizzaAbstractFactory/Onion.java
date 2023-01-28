package factory.pizzaAbstractFactory;

public class Onion implements Veggie {
    private final String name;

    public Onion() {
        this.name = "Onion";
    }

    @Override
    public String getName() {
        return name;
    }
}

