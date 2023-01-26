package factory.pizzaFactoryMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    private String name;
    private String dough;
    private String sauce;
    private final List<String> toppings = new ArrayList<>();

    public Pizza(String name, String dough, String sauce) {
        this.name = name;
        this.dough = dough;
        this.sauce = sauce;
    }

    public void prepare() {
        System.out.println("Vorbereitung für " + name);
        System.out.println("Knete Teig...");
        System.out.println("Füge Sauce hinzu...");
        System.out.println("Füge Beläge hinzu: ");
        for (String topping : toppings) {
            System.out.print(topping + "\t");
        }
        System.out.println("\n");
    }

    // default implementation

    public void bake() {
        System.out.println("Backe für 25 Minuten bei 350 Grad.");
    }

    public void cut() {
        System.out.println("Schneide Pizza diagonal in Stücke");
    }

    public void box() {
        System.out.println("Lege Pizza in offiziellen PizzaStore-Karton");
    }

    public String getName() {
        return name;
    }

    public void addTopping(String topping) {
        toppings.add(topping);
    }
}
