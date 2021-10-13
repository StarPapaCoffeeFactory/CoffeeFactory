package Settings.CoffeeFactory.product.OriginalCoffeeBean;

import Settings.CoffeeFactory.product.Product;
import Settings.CoffeeFactory.product.coffeebeverage.Americano;
import Settings.CoffeeFactory.product.coffeebeverage.Beverage;

public abstract class Coffee extends Product {
    public double content;
    protected Beverage beverage;

    protected Coffee(String name, int shelfLife, int weight, double content, Beverage beverage) {
        super(name, shelfLife, weight);
        this.content = content;
        this.beverage = beverage;
    }

    protected Coffee(String name, int shelfLife, int weight, double content) {
        super(name, shelfLife, weight);
        this.content = content;
        this.beverage = new Americano();
    }

    public abstract void dispaly();

    public abstract String getBlended();
}




