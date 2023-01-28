package factory.pizzaAbstractFactory;

public class FrozenClam implements Clam {
    private final String name;

    public FrozenClam() {
        this.name = "Frozen Clam";
    }

    @Override
    public String getName() {
        return name;
    }
}

