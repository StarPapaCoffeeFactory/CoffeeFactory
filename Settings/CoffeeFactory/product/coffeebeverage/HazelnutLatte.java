package Settings.CoffeeFactory.product.coffeebeverage;

import Settings.CoffeeFactory.product.Product;
import Settings.CoffeeFactory.material.foodmaterial.*;

/**
 * @author Kaiyu Huang
 * @project CoffeeFactory
 * @classname Beverage
 * @description HazelnutLatte Beverage; Imitate Nestle
 * @date 2021/10/11 21:45
 */

public class HazelnutLatte extends Product {
    // constructor
    public HazelnutLatte() {
        super("HazelnutLatte", 10, 268);
        this.initIngredientList();
    }
    // methods
    // initialize the ingredient list of HazelnutLatte
    @Override
    protected void initIngredientList() {
        super.ingredientList.add(new CocoaBean());
        super.ingredientList.add(new Water());
        super.ingredientList.add(new Milk());
        super.ingredientList.add(new Hazelnut());
    }
    // override the getProductName method
    @Override
    public String getProductName() {
        return "HazelnutLatte";
    }
}
