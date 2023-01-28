package factory.pizzaAbstractFactory;

public class Spinach implements Veggie {
    private final String name;

    public Spinach() {
        this.name = "Spinach";
    }

    @Override
    public String getName() {
        return name;
    }
}

