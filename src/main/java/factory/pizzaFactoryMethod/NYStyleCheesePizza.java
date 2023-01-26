package factory.pizzaFactoryMethod;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        super("Pizza nach New Yorker Art", "Teig für dünnen Boden", "Marinara-Sauce");
        addTopping("Geriebener Reggianokäse");
    }
}
