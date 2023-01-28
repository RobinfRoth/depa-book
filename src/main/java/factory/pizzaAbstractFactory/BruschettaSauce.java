package factory.pizzaAbstractFactory;

public class BruschettaSauce implements Sauce {
    private final String name;

    public BruschettaSauce() {
        this.name = "Bruschetta Sauce";
    }

    @Override
    public String getName() {
        return name;
    }
}
