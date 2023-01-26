package factory.pizzaFactoryMethod;

public class NYStyleClamPizza extends Pizza {
    public NYStyleClamPizza() {
        super("Pizza nach New Yorker Art", "Teig für dünnen Boden", "Marinara-Sauce");
        addTopping("Reibkäse");
        addTopping("Muschel");
    }
}
