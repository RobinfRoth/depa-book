package factory.pizzaFactoryMethod;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) return new NYStyleCheesePizza();
        if (type.equals("pepperoni")) return new NYStylePepperoniPizza();
        if (type.equals("clam")) return new NYStyleVeggiePizza();
        if (type.equals("veggie")) return new NYStyleVeggiePizza();

        return null;
    }

}
