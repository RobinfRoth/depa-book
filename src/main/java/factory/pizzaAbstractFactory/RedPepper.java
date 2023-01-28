package factory.pizzaAbstractFactory;

public class RedPepper implements Veggie {
    private final String name;

    public RedPepper() {
        this.name = "Red Pepper";
    }

    @Override
    public String getName() {
        return name;
    }
}

