package Settings.CoffeeFactory.personnel.visitor;

import Settings.CoffeeFactory.personnel.Personnel;
import Settings.CoffeeFactory.product.Product;

import java.util.HashMap;

/**
 * @ program: coffeefactory
 * @ description: 顾客
 * @ author: YXJ
 * @ date: 2021-10-12 21:15:35
 */
public class Customer extends Visitor{

    HashMap<Product , Integer> shoppingcart;//购物车？

    public Customer(String name, int age, Personnel.Gender gender, String Phone_num, int visitCode)
    {

        super(name, age, gender, Phone_num , visitCode);
        identity = "Customer";

    }

    public void addcart(Product product)
    {
        System.out.println(" this is a test");
    }


}
