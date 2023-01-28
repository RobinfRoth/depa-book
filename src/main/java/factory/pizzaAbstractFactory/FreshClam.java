package factory.pizzaAbstractFactory;

public class FreshClam implements Clam {
    private final String name;

    public FreshClam() {
        this.name = "Fresh Clam";
    }

    @Override
    public String getName() {
        return name;
    }
}
