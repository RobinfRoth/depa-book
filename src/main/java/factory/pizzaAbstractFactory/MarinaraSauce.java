package factory.pizzaAbstractFactory;

public class MarinaraSauce implements Sauce {
    private final String name;

    public MarinaraSauce() {
        this.name = "Marinara Sauce";
    }

    @Override
    public String getName() {
        return name;
    }
}
