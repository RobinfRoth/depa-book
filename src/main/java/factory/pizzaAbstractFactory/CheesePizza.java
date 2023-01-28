package factory.pizzaAbstractFactory;

public class CheesePizza extends Pizza {

    private final PizzaIngredientsFactory ingredientsFactory;

    public CheesePizza(PizzaIngredientsFactory ingredientsFactory) {
        super("Cheese Pizza");
        this.ingredientsFactory = ingredientsFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Vorbereitung für " + getName());
        setDough(ingredientsFactory.createDough());
        setCheese(ingredientsFactory.createCheese());
        setSauce(ingredientsFactory.createSauce());

    }

}
