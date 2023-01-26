package factory.pizzaFactoryMethod;

public class ChicagoStyleClamPizza extends Pizza {
    public ChicagoStyleClamPizza() {
        super("Pizza nach Chicago-Art", "Teig für extradicken Boden", "Datteltomatensauce");
        addTopping("Reibkäse");
        addTopping("Muschel");
    }
}
