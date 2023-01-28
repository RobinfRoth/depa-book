package factory.pizzaAbstractFactory;

public class VeggiePizza extends Pizza {

    private final PizzaIngredientsFactory ingredientsFactory;

    public VeggiePizza(PizzaIngredientsFactory ingredientsFactory) {
        super("Veggie Pizza");
        this.ingredientsFactory = ingredientsFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Vorbereitung für" + getName());
        setDough(ingredientsFactory.createDough());
        setSauce(ingredientsFactory.createSauce());
        setCheese(ingredientsFactory.createCheese());
        setVeggies(ingredientsFactory.createVeggies());
    }
}
