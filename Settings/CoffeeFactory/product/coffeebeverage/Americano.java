package Settings.CoffeeFactory.product.coffeebeverage;

import Settings.CoffeeFactory.product.Product;
import Settings.CoffeeFactory.material.foodmaterial.*;

/**
 * @author Kaiyu Huang
 * @project CoffeeFactory
 * @classname Americano
 * @description Americano Beverage; Imitate Starbucks
 * @date 2021/10/11 21:45
 */

public class Americano extends Product {
    // constructor
    public Americano() {
        super("Americano", 9, 228);
        this.initIngredientList();
    }
    // methods
    // initialize the ingredient list of Americano
    @Override
    protected void initIngredientList() {
        super.ingredientList.add(new CoffeeBean());
        super.ingredientList.add(new Water());
    }
    // override the getProductName method
    @Override
    public String getProductName() {
        return "Americano";
    }
}
