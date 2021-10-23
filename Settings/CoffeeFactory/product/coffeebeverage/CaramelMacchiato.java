package Settings.CoffeeFactory.product.coffeebeverage;

import Settings.CoffeeFactory.material.Food.CoffeeBean;
import Settings.CoffeeFactory.material.Food.*;
import Settings.CoffeeFactory.product.Product;

/**
 * @author Kaiyu Huang
 * @project CoffeeFactory
 * @classname Beverage
 * @description CaramelMacchiato Beverage; Imitate Starbucks
 * @date 2021/10/11 21:45
 */

public class CaramelMacchiato extends Product {
    protected int quantity;
    // constructor
    public CaramelMacchiato(int quantity) {
        super("CaramelMacchiato", 9, 228 * quantity);
        this.quantity = quantity;
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
