package Settings.CoffeeFactory.product.originalcoffee;

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

    //constructor
    public Robusta() {
        super("Robusta", 24, 10, 0.9);
    }

    //constructor
    public Robusta(BlendedCoffee blended) {
        super("Robusta", 24, 10, 0.9, blended);
        this.robustaContent = 0.9;
        this.initIngredientList();
    }

    public double getRobustaContent() {
        return this.robustaContent;
    }

    @Override
    protected void initIngredientList() {
        super.ingredientList.add(new CoffeeBean());
        super.ingredientList.add(new Sugar());
        super.ingredientList.add(new Water());
    }

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

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
