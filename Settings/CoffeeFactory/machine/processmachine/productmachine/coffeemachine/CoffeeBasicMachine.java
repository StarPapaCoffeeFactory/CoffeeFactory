package Settings.CoffeeFactory.machine.processmachine.productmachine.coffeemachine;

import Settings.CoffeeFactory.machine.processmachine.productmachine.BasicProductMachine;
import Settings.CoffeeFactory.product.Product;
import Settings.CoffeeFactory.product.originalcoffeebean.Coffee;

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

    public abstract void useCoffeeBean();


    public String toString() {
        return "class CoffeeBasicMachine";
    }
}
