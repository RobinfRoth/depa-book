package factory.pizzaAbstractFactory;

public class ThickCrustDough implements Dough {
    private final String name;

    public ThickCrustDough() {
        this.name = "Thick Crust Dough";
    }

    @Override
    public String getName() {
        return name;
    }
}
