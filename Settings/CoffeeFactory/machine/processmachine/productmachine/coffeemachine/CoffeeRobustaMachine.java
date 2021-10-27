package Settings.CoffeeFactory.machine.processmachine.productmachine.coffeemachine;

import Settings.CoffeeFactory.product.originalcoffee.Arabica;
/**
 * @author YSX
 * @description class of the machine that produces Robusta
 * @date 2021/10/27 21:19
 */
public class CoffeeRobustaMachine extends CoffeeBasicMachine{
    public CoffeeRobustaMachine() {
        this.setID("002");
    }

    public CoffeeRobustaMachine(String number) {
        super(number);
    }
/*
 *
 * @return void
 * @author YSX
 * @description make different coffee with different coffee bean
 * @date 2021/10/27 21:54
 */
    @Override
    public void useCoffeeBean() {
        coffee=new Arabica();
        System.out.println("Successfully produce Robusta coffee or coffee product!\n");
    }
}
