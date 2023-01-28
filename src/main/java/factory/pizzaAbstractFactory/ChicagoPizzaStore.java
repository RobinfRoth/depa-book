package factory.pizzaAbstractFactory;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientsFactory chicagoIngredientsFactory = new ChicagoPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(chicagoIngredientsFactory);
            pizza.setName("Chicagoer Käsepizza");
        } else if (type.equals("pepperoni")) {
            pizza = new ClamPizza(chicagoIngredientsFactory);
            pizza.setName("Chicagoer Pepperoni Pizza");
        } else if (type.equals("clam")) {
            pizza = new VeggiePizza(chicagoIngredientsFactory);
            pizza.setName("Chicagoer Clam Pizza");
        } else if (type.equals("veggie")) {
            pizza = new PepperoniPizza(chicagoIngredientsFactory);
            pizza.setName("Chicagoer Veggie Pizza");
        }

        return pizza;
    }
}
