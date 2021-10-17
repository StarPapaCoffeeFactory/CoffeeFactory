package Settings.CoffeeFactory.product.coffeebeverage;

import Settings.CoffeeFactory.product.Product;
import Settings.CoffeeFactory.material.foodmaterial.*;

/**
 * @author Kaiyu Huang
 * @project CoffeeFactory
 * @classname Beverage
 * @description CaramelMacchiato Beverage; Imitate Starbucks
 * @date 2021/10/11 21:45
 */

public class CaramelMacchiato extends Product {
    // constructor
    public CaramelMacchiato() {
        super("CaramelMacchiato", 9, 228);
        this.initIngredientList();
    }
    // methods
    // initialize the ingredient list of CaramelMacchiato
    @Override
    protected void initIngredientList() {
        super.ingredientList.add(new CoffeeBean());
        super.ingredientList.add(new Water());
        super.ingredientList.add(new Milk());
        super.ingredientList.add(new Syrup());
        super.ingredientList.add(new Sugar());
    }
    // override the getProductName method
    @Override
    public String getProductName() {
        return "CaramelMacchiato";
    }
}
