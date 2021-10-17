package Settings.CoffeeFactory.product.originalcoffeebean;

import Settings.CoffeeFactory.product.Product;
import Settings.CoffeeFactory.product.blendedcoffeebean.AutumnBlend;
import Settings.CoffeeFactory.product.blendedcoffeebean.BlendedCoffee;

/**
 * @author LouTianyu
 * @description The basic abstract for Coffee.
 */
public abstract class Coffee extends Product {
    public double content;
    protected BlendedCoffee blended;

    protected Coffee(String name, int shelfLife, int weight, double content, BlendedCoffee blended) {
        super(name, shelfLife, weight);
        this.content = content;
        this.blended = blended;
    }

    protected Coffee(String name, int shelfLife, int weight, double content) {
        super(name, shelfLife, weight);
        this.content = content;
        this.blended = new AutumnBlend();
    }

    public abstract void display();

    public abstract String getBlendedCoffeeName();
}




