package Settings.CoffeeFactory.product.originalcoffee;

import Settings.CoffeeFactory.material.Food.*;
import Settings.CoffeeFactory.product.blendedcoffee.BlendedCoffee;

/**
 * @author LouTianyu
 * @description Bourbon coffee
 */
public class Bourbon extends Coffee{
    protected double bourbonPortion;

    public Bourbon(){super("Bourbon",24,10,0.95);}

    public Bourbon(BlendedCoffee blended){
        super("Bourbon",24,10,0.95,blended);
        this.bourbonPortion = 0.95;
        this.initIngredientList();
    }

    public double getBourbonPortion() {
        return bourbonPortion;
    }

    @Override
    protected void initIngredientList(){
        super.ingredientList.add(new BourbonCoffeeBean());
        super.ingredientList.add(new Water());
    }

    @Override
    public void display() {
        System.out.println("This is Bourbon :)");
    }

    @Override
    public String getBlendedCoffeeName(){return blended.getBlended();}
}
