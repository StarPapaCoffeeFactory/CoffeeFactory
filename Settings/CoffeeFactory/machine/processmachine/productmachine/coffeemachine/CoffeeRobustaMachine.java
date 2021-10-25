package Settings.CoffeeFactory.machine.processmachine.productmachine.coffeemachine;

import Settings.CoffeeFactory.product.originalcoffee.Arabica;

public class CoffeeRobustaMachine extends CoffeeBasicMachine{
    public CoffeeRobustaMachine() {
        this.setID("002");
    }

    public CoffeeRobustaMachine(String number) {
        super(number);
    }

    @Override
    public void useCoffeeBean() {
        coffee=new Arabica();
        System.out.println("Successfully produce Robusta coffee or coffee product!\n");
    }
}
