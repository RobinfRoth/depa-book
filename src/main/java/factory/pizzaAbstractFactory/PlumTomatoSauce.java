package factory.pizzaAbstractFactory;

public class PlumTomatoSauce implements Sauce {
    private final String name;

    public PlumTomatoSauce() {
        this.name = "Plum Tomato Sauce";
    }

    @Override
    public String getName() {
        return name;
    }
}
