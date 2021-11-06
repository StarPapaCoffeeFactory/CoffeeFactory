package Settings.CoffeeFactory.product.coffeebeverage;

import Settings.CoffeeFactory.material.food.CoffeeBean;
import Settings.CoffeeFactory.material.food.*;
import Settings.CoffeeFactory.product.Product;

/**
 * @description: CaramelMacchiato Beverage; Imitate Starbucks
 * @author: Kaiyu Huang
 * @date: 2021-10-27 08:31:25
 */

public class CaramelMacchiato extends Product {
    protected int quantity;
    public CaramelMacchiato(int quantity) {
        /*
         * @param quantity(product quantity)
         * @return
         * @author Kaiyu Huang
         * @description constructor for CaramelMacchiato
         * @date 2021/10/27 8:55
         */
        super("CaramelMacchiato", 9, 228 * quantity);
        this.quantity = quantity;
        this.initIngredientList();
    }
    @Override
    protected void initIngredientList() {
        /*
         * @param
         * @return void
         * @author Kaiyu Huang
         * @description initialize the ingredient list of CaramelMacchiato
         * @date 2021/10/27 8:56
         */
        super.ingredientList.add(new CoffeeBean());
        super.ingredientList.add(new Water());
        super.ingredientList.add(new Milk());
        super.ingredientList.add(new Syrup());
        super.ingredientList.add(new Sugar());
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
        return "CaramelMacchiato";
    }
}
