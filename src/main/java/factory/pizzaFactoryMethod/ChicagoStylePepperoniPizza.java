package factory.pizzaFactoryMethod;

public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza() {
        super("Pizza nach Chicago-Art", "Teig für extradicken Boden", "Datteltomatensauce");
        addTopping("Reibkäse");
        addTopping("Salami");
    }
}
