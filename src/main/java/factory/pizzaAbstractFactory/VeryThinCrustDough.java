package factory.pizzaAbstractFactory;

public class VeryThinCrustDough implements Dough {
    private final String name;

    public VeryThinCrustDough() {
        this.name = "Very Thin Crust Dough";
    }

    @Override
    public String getName() {
        return name;
    }
}
