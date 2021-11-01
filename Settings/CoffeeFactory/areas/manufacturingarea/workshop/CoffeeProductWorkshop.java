package Settings.CoffeeFactory.areas.manufacturingarea.workshop;

import Settings.CoffeeFactory.areas.AreaName;
import Settings.CoffeeFactory.areas.visitor.Visitor;
import Settings.CoffeeFactory.machine.processmachine.productmachine.coffeemachine.CoffeeArabicaMachine;
import Settings.CoffeeFactory.machine.processmachine.productmachine.coffeemachine.CoffeeRobustaMachine;

/***
 * @author ZJX
 * @description This area produce coffee product
 */
public class CoffeeProductWorkshop extends Workshop {
    CoffeeArabicaMachine arabicaMachine=new CoffeeArabicaMachine();
    CoffeeRobustaMachine robustaMachine=new CoffeeRobustaMachine();
    public CoffeeProductWorkshop() {

    }

    /***
     * @return void
     * @author ZJX
     * @description produce arabica coffee product
     */
    @Override
    public void produceArabicaProduct() {
        System.out.println("Producing Arabica coffee products...");
        arabicaMachine.useCoffeeBean();
    }

    /***
     * @return void
     * @author ZJX
     * @description produce Robusta coffee product
     */
    @Override
    public void produceRobustaProduct(){
        System.out.println("Producing Robusta coffee products...");
        robustaMachine.useCoffeeBean();
    }

    /**
     * @return String
     * @author ZJX
     * @description Return area name
     */
    @Override
    public String toString() {
        return AreaName.WORKSHOP;
    }

    /***
     * @param v
     * @author ZJX
     * @description The basic function of visitor design model
     */
    public void accept(Visitor v){
        v.visit(this);
    }
}
