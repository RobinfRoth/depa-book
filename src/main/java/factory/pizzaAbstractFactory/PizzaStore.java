package factory.pizzaAbstractFactory;

public abstract class PizzaStore {

    public final Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    // abstract Factory Method
    protected abstract Pizza createPizza(String type);
}
