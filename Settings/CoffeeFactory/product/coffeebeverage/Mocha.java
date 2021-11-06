package Settings.CoffeeFactory.product.coffeebeverage;

import Settings.CoffeeFactory.product.Product;
import Settings.CoffeeFactory.material.food.*;

/**
 * @author Kaiyu Huang
 * @classname Beverage
 * @description Mocha Beverage; Imitate Nestle
 * @date 2021/10/11 21:45
 */

public class Mocha extends Product {
    protected int quantity;
    public Mocha(int quantity) {
        /*
         * @param quantity(product quantity)
         * @return
         * @author Kaiyu Huang
         * @description constructor for Mocha
         * @date 2021/10/27 8:55
         */
        super("Mocha", 10, 268 * quantity);
        this.quantity = quantity;
        this.initIngredientList();
    }
    @Override
    protected void initIngredientList() {
        /*
         * @param
         * @return void
         * @author Kaiyu Huang
         * @description initialize the ingredient list of Mocha
         * @date 2021/10/27 8:56
         */
        super.ingredientList.add(new CoffeeBean());
        super.ingredientList.add(new Water());
        super.ingredientList.add(new Milk());
        super.ingredientList.add(new Cream());
        super.ingredientList.add(new Chocolate());
    }
    @Override
    public String getProductName() {
        /*
         * @param
         * @return java.lang.String
         * @author Kaiyu Huang
         * @description override the getProductName method
         * @date 2021/10/27 8:56
         */
        return "Mocha";
    }
}