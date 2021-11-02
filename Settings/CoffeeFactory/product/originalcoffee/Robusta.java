package Settings.CoffeeFactory.product.originalcoffee;

import Settings.CoffeeFactory.material.food.*;
import Settings.CoffeeFactory.product.blendedcoffee.BlendedCoffee;

/**
 * @author LouTianyu
 * @description Robusta coffee
 */
public class Robusta extends Coffee{
    protected double robustaContent;
    private double coffeeBean = 100;
    private double sugar = 5;
    private double water = 0.5;

    public Robusta() {
        super("Robusta", 24, 10, 0.9);
    }

    public Robusta(BlendedCoffee blended) {
        super("Robusta", 24, 10, 0.9, blended);
        this.robustaContent = 0.9;
        this.initIngredientList();
    }

    public double getRobustaContent() {
        return this.robustaContent;
    }

    /*
     * @return void
     * @description Initiate the ingredient list for Robusta Coffee
     */
    @Override
    protected void initIngredientList() {
        super.ingredientList.add(new RobustaCoffeeBean());
        super.ingredientList.add(new Sugar());
        super.ingredientList.add(new Water());
    }

    /*
     * @return
     * @description Retrieve the name of the coffee bean within a blended coffee
     */
    public String getBlendedCoffeeName() {
        return blended.getBlended() + " Robusta";
    }

    @Override
    public String toString() {
        return "subclass : Robusta";
    }


    @Override
    public void display() {
        System.out.println("This is Robusta :)");
    }

    /*
     * @return java.lang.Object
     * @description Clone an object
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
