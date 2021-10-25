package Settings.CoffeeFactory.machine.processmachine.productmachine.coffeemachine;

import Settings.CoffeeFactory.product.originalcoffee.Arabica;

public class CoffeeArabicaMachine extends CoffeeBasicMachine{
    public CoffeeArabicaMachine() {
        this.setID("001");
    }

    public CoffeeArabicaMachine(String number) {
        super(number);
    }

    @Override
    public void useCoffeeBean() {
        coffee=new Arabica();
        System.out.println("Successfully produce Arabica coffee or coffee product!\n");
    }
}
