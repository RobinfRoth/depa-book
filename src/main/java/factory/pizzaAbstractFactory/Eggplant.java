package factory.pizzaAbstractFactory;

public class Eggplant implements Veggie {
    private final String name;

    public Eggplant() {
        this.name = "Eggplant";
    }

    @Override
    public String getName() {
        return name;
    }
}

