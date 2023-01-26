package factory.pizzaFactoryMethod;

public class NYStyleVeggiePizza extends Pizza {
    public NYStyleVeggiePizza() {
        super("Pizza nach New Yorker Art", "Teig für dünnen Boden", "Marinara-Sauce");
        addTopping("Reibkäse");
        addTopping("Brokkoli");
        addTopping("Cannabis");
    }
}
