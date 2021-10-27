package Settings.CoffeeFactory.machine.processmachine.productmachine.coffeemachine;

import Settings.CoffeeFactory.product.originalcoffee.Arabica;
/**
 * @author YSX
 * @description class of the machine that produces Robusta
 * @date 2021/10/27 21:20
 */
public class CoffeeArabicaMachine extends CoffeeBasicMachine{
    public CoffeeArabicaMachine() {
        this.setID("001");
    }

    public CoffeeArabicaMachine(String number) {
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
        System.out.println("Successfully produce Arabica coffee or coffee product!\n");
    }
}
