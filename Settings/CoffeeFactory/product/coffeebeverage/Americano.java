package Settings.CoffeeFactory.product.coffeebeverage;

import Settings.CoffeeFactory.product.Product;
import Settings.CoffeeFactory.material.Food.*;

/**
 * @ program: CoffeeFactory.iml
 * @ description: Americano Beverage; Imitate Starbucks
 * @ author: Kaiyu Huang
 * @ date: 2021-10-27 08:31:25
 */

public class Americano extends Product {
    protected int quantity;
    public Americano(int quantity) {
        /*
         * @param quantity(product quantity)
         * @return
         * @author Kaiyu Huang
         * @description constructor for Americano
         * @date 2021/10/27 8:55
         */
        super("Americano", 9, 228 * quantity);
        this.quantity = quantity;
        this.initIngredientList();
    }
    @Override
    protected void initIngredientList() {
        /*
         * @param
         * @return void
         * @author Kaiyu Huang
         * @description initialize the ingredient list of Americano
         * @date 2021/10/27 8:56
         */
        super.ingredientList.add(new CoffeeBean());
        super.ingredientList.add(new Water());
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
        return "Americano";
    }
}
