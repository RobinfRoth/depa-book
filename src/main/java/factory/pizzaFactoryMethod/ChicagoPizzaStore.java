package factory.pizzaFactoryMethod;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) return new ChicagoStyleCheesePizza();
        if (type.equals("pepperoni")) return new ChicagoStyleClamPizza();
        if (type.equals("clam")) return new ChicagoStyleVeggiePizza();
        if (type.equals("veggie")) return new ChicagoStylePepperoniPizza();

        return null;
    }
}
