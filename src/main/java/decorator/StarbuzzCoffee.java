package decorator;

import static java.lang.System.out;

// Client

public class StarbuzzCoffee {

    public static void main(String[] args) {
        // just a an espresso
        Beverage beverage = new Espresso();
        out.println(beverage.getDescription() + " $" + beverage.cost());

        // "decorated" Dark Roast
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2); // wrap with mocha
        beverage2 = new Mocha(beverage2);
        beverage2 = new Soy(beverage2);
        beverage2 = new Whip(beverage2);
        out.println(beverage2.getDescription() + " $" + beverage2.cost());

        // fancy "decorated" House Blend
        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
