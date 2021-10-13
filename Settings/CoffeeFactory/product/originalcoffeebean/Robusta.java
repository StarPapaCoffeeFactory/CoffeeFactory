package Settings.CoffeeFactory.product.originalcoffeebean;

import Settings.CoffeeFactory.product.blendedcoffeebean.BlendedCoffee;

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

    /**
     * @return milk's content
     */
    public double getRobustaContent() {
        return this.robustaContent;
    }

    /**
     * initialize the ingredient list of the milk coffee
     */
    @Override
    protected void initIngredientList() {
        super.ingredientList.add(new CoffeeBean());
        super.ingredientList.add(new Sugar());
        super.ingredientList.add(new Water());
    }

    /**
     * return the coffee's name with the sandwich it contains
     * @return
     */
    public String getBlendedCoffeeName() {
        return blended.getBlended() + " Robusta";
    }

    /**
     * override the toString method
     *
     * @return
     */
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
