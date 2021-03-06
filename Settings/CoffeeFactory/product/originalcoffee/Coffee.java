package Settings.CoffeeFactory.product.originalcoffee;

import Settings.CoffeeFactory.product.Product;
import Settings.CoffeeFactory.product.blendedcoffee.AutumnBlend;
import Settings.CoffeeFactory.product.blendedcoffee.BlendedCoffee;

/**
 * @author LouTianyu
 * @description The basic abstract class for Coffee.
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

    public abstract void display(); //Abstract method to display class information

    public abstract String getBlendedCoffeeName(); //Abstract method to get blended coffee name
}




