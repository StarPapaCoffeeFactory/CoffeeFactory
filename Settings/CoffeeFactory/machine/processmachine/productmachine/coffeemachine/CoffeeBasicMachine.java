package Settings.CoffeeFactory.machine.processmachine.productmachine.coffeemachine;

import Settings.CoffeeFactory.machine.processmachine.productmachine.BasicProductMachine;
import Settings.CoffeeFactory.product.originalcoffee.Coffee;
/**
 * @author YSX
 * @description The abstract class of machine which producing coffee
 * @date 2021/10/27 21:18
 */
public abstract class CoffeeBasicMachine extends BasicProductMachine {
    protected Coffee coffee;

    public CoffeeBasicMachine() {
        super("CoffeeMachine", "000");
//        coffee = new Coffee();
    }

    public CoffeeBasicMachine(String number) {
        super("CoffeeMachine", number);
//        coffee = new Coffee();
    }

    public Coffee getCoffee() {
        return coffee;
    }
    /*
     *
     * @return void
     * @author YSX
     * @description make different coffee with different coffee bean
     * @date 2021/10/27 21:54
     */
    public abstract void useCoffeeBean();


    public String toString() {
        return "class CoffeeBasicMachine";
    }
}
