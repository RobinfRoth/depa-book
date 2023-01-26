package factory.pizzaFactoryMethod;

public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        super("Pizza nach Chicago-Art", "Teig für extradicken Boden", "Datteltomatensauce");
        addTopping("Grob geriebener Mozzerellakäse");
    }

    // Special Behaviour for preparing this pizza subtype
    @Override
    public void cut() {
        System.out.println("Schneide Pizza in quadratische Stücke");
    }

}
