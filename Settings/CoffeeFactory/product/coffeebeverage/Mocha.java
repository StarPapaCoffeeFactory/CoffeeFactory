package Settings.CoffeeFactory.product.coffeebeverage;

import Settings.CoffeeFactory.product.Product;
import Settings.CoffeeFactory.material.foodmaterial.*;

/**
 * @author Kaiyu Huang
 * @project CoffeeFactory
 * @classname Beverage
 * @description Mocha Beverage; Imitate Nestle
 * @date 2021/10/11 21:45
 */

public class Mocha extends Product {
    // constructor
    public Mocha() {
        super("Mocha", 10, 268);
        this.initIngredientList();
    }
    // methods
    // initialize the ingredient list of Mocha
    @Override
    protected void initIngredientList() {
        super.ingredientList.add(new CoffeeBean());
        super.ingredientList.add(new Water());
        super.ingredientList.add(new Milk());
        super.ingredientList.add(new Cream());
        super.ingredientList.add(new Chocolate());
    }
    // override the getProductName method
    @Override
    public String getProductName() {
        return "Mocha";
    }
}