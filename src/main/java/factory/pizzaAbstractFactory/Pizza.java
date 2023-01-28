package factory.pizzaAbstractFactory;

public abstract class Pizza {
    private String name;

    private Dough dough;
    private Sauce sauce;
    private Veggie[] veggies;
    private Cheese cheese;
    private Pepperoni pepperoni;
    private Clam clam;

    // Prepare Method to be implemented by the concrete pizza types
    abstract void prepare();

    public Pizza(String name) {
        this.name = name;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public void setVeggies(Veggie... veggies) {
        this.veggies = veggies;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    public void setPepperoni(Pepperoni pepperoni) {
        this.pepperoni = pepperoni;
    }

    public void setClam(Clam clam) {
        this.clam = clam;
    }
}
