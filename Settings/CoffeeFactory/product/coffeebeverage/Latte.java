package Settings.CoffeeFactory.product.coffeebeverage;

import Settings.CoffeeFactory.product.Product;
import Settings.CoffeeFactory.material.foodmaterial.*;

/**
 * @author Kaiyu Huang
 * @project CoffeeFactory
 * @classname Beverage
 * @description Latte Beverage; Imitate COSTA
 * @date 2021/10/11 21:45
 */

public class Latte extends Product {
    protected int quantity;
    // constructor
    public Latte(int quantity) {
        super("Latte", 10, 300 * quantity);
        this.quantity = quantity;
        this.initIngredientList();
    }
    // methods
    // initialize the ingredient list of Latte
    @Override
    protected void initIngredientList() {
        super.ingredientList.add(new CoffeeBean());
        super.ingredientList.add(new Water());
        super.ingredientList.add(new Milk());
    }
    // override the getProductName method
    @Override
    public String getProductName() {
        return "Latte";
    }
}
