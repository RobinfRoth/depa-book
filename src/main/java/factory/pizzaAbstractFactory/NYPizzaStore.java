package factory.pizzaAbstractFactory;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientsFactory NYIngredientsFactory = new NYPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(NYIngredientsFactory);
            pizza.setName("Chicagoer Käsepizza");
        } else if (type.equals("pepperoni")) {
            pizza = new ClamPizza(NYIngredientsFactory);
            pizza.setName("Chicagoer Pepperoni Pizza");
        } else if (type.equals("clam")) {
            pizza = new VeggiePizza(NYIngredientsFactory);
            pizza.setName("Chicagoer Clam Pizza");
        } else if (type.equals("veggie")) {
            pizza = new PepperoniPizza(NYIngredientsFactory);
            pizza.setName("Chicagoer Veggie Pizza");
        }

        return pizza;
    }

}
