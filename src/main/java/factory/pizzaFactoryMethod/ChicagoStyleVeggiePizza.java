package factory.pizzaFactoryMethod;

public class ChicagoStyleVeggiePizza extends Pizza {
    public ChicagoStyleVeggiePizza() {
        super("Pizza nach New Yorker Art", "Teig für dünnen Boden", "Marinara-Sauce");
        addTopping("Reibkäse");
        addTopping("Brokkoli");
        addTopping("Cannabis");
    }
}
