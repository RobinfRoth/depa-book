package factory.pizzaAbstractFactory;

public class PepperoniPizza extends Pizza {

    private final PizzaIngredientsFactory ingredientsFactory;

    public PepperoniPizza(PizzaIngredientsFactory ingredientsFactory) {
        super("Pepperoni Pizza");
        this.ingredientsFactory = ingredientsFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Vorbereitung für" + getName());
        setDough(ingredientsFactory.createDough());
        setSauce(ingredientsFactory.createSauce());
        setCheese(ingredientsFactory.createCheese());
        setPepperoni(ingredientsFactory.createPepperoni());
    }
}
