package factory.pizzaAbstractFactory;

public class ThinCrustDough implements Dough {
    private final String name;

    public ThinCrustDough() {
        this.name = "Thin Crust Dough";
    }

    @Override
    public String getName() {
        return name;
    }
}
