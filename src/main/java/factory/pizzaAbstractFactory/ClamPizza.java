package factory.pizzaAbstractFactory;

public class ClamPizza extends Pizza {

    private final PizzaIngredientsFactory ingredientsFactory;

    public ClamPizza(PizzaIngredientsFactory ingredientsFactory) {
        super("Clam Pizza");
        this.ingredientsFactory = ingredientsFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Vorbereitung für " + getName());
        setDough(ingredientsFactory.createDough());
        setSauce(ingredientsFactory.createSauce());
        setCheese(ingredientsFactory.createCheese());
        setClam(ingredientsFactory.createClam());
    }
}
