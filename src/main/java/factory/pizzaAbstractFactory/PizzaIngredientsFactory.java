package factory.pizzaAbstractFactory;

public interface PizzaIngredientsFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggie[] createVeggies();
    Pepperoni createPepperoni();
    Clam createClam();
}
