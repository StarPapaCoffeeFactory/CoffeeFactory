package Settings.CoffeeFactory.product.coffeebeverage;

import Settings.CoffeeFactory.product.Product;
import Settings.CoffeeFactory.material.Food.*;

/**
 * @ program: CoffeeFactory.iml
 * @ description: HazelnutLatte Beverage; Imitate Nestle
 * @ author: Kaiyu Huang
 * @ date: 2021-10-27 08:31:25
 */

public class HazelnutLatte extends Product {
    protected int quantity;
    public HazelnutLatte(int quantity) {
        /*
         * @param quantity(product quantity)
         * @return
         * @author Kaiyu Huang
         * @description constructor for HazelnutLatte
         * @date 2021/10/27 8:55
         */
        super("HazelnutLatte", 10, 268 * quantity);
        this.quantity = quantity;
        this.initIngredientList();
    }
    @Override
    protected void initIngredientList() {
        /*
         * @param
         * @return void
         * @author Kaiyu Huang
         * @description initialize the ingredient list of HazelnutLatte
         * @date 2021/10/27 8:56
         */
        super.ingredientList.add(new CoffeeBean());
        super.ingredientList.add(new Water());
        super.ingredientList.add(new Milk());
        super.ingredientList.add(new Hazelnut());
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
        return "HazelnutLatte";
    }
}
