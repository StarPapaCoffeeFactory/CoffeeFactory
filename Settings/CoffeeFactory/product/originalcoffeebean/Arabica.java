package Settings.CoffeeFactory.product.originalcoffeebean;

import Settings.CoffeeFactory.product.blendedcoffeebean.BlendedCoffee;

/**
 * @author LouTianyu
 * @description Arabica coffee
 */
public class Arabica extends Coffee{
    public Arabica(){super("Arabica",24,10,1.00);}

    public Arabica(String name, int shelfLife, int weight, double content, BlendedCoffee blended) {
        super("Arabica", 24, 10, 1.00, blended);
        this.initIngredientList();
    }

    @Override
    protected void initIngredientList() {
        super.ingredientList.add(new CoffeeBean());
        super.ingredientList.add(new Water());
    }

    @Override
    public void display() {
        System.out.println("This is Arabica :)");
    }

    @Override
    public String getBlendedCoffeeName(){return blended.getBlended()+ " Arabica Coffee";}

    @Override
    public String toString() {
        return "subclass : Arabica";
    }


}
