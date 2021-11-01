package Settings.CoffeeFactory.product.originalcoffee;

import Settings.CoffeeFactory.material.food.*;
import Settings.CoffeeFactory.product.blendedcoffee.BlendedCoffee;

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

    /*
     * @return void
     * @description Initiate the ingredient list for Arabica coffee
     */
    @Override
    protected void initIngredientList() {
        super.ingredientList.add(new ArabicaCoffeeBean());
        super.ingredientList.add(new Water());
    }

    /*
     * @return void
     * @description Display the name of Arabica Coffee
     */
    @Override
    public void display() {
        System.out.println("This is Arabica :)");
    }

    /*
     * @return java.lang.String
     * @description Retrieve the name of the coffee bean within a blended coffee
     */
    @Override
    public String getBlendedCoffeeName(){return blended.getBlended()+ " Arabica Coffee";}

    /*
     * @return
     * @description Display class information
     */
    @Override
    public String toString() {
        return "subclass : Arabica";
    }


}
