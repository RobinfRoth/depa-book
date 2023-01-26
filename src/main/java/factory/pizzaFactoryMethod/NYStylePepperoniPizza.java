package factory.pizzaFactoryMethod;

public class NYStylePepperoniPizza extends Pizza {
    public NYStylePepperoniPizza() {
        super("Pizza nach New Yorker Art", "Teig für dünnen Boden", "Marinara-Sauce");
        addTopping("Reibkäse");
        addTopping("Salami");
    }
}
