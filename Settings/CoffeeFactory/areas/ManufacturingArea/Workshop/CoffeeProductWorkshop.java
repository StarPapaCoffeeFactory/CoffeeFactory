package Settings.CoffeeFactory.areas.ManufacturingArea.Workshop;

import Settings.CoffeeFactory.areas.AreaName;
import Settings.CoffeeFactory.areas.Visitor.Visitor;
import Settings.CoffeeFactory.machine.processmachine.productmachine.coffeemachine.CoffeeArabicaMachine;
import Settings.CoffeeFactory.machine.processmachine.productmachine.coffeemachine.CoffeeRobustaMachine;

public class CoffeeProductWorkshop extends Workshop {
    CoffeeArabicaMachine arabicaMachine=new CoffeeArabicaMachine();
    CoffeeRobustaMachine robustaMachine=new CoffeeRobustaMachine();
    public CoffeeProductWorkshop() {

    }

    //生产coffee
    @Override
    public void produceArabicaProduct() {
        System.out.println("Producing Arabica coffee products...");
        arabicaMachine.useCoffeeBean();
    }

    @Override
    public void produceRobustaProduct(){
        System.out.println("Producing Robusta coffee products...");
        robustaMachine.useCoffeeBean();
    }

    //返回区域名字
    @Override
    public String toString() {
        return AreaName.WORKSHOP;
    }

    //Visitor
    public void accept(Visitor v){
        v.visit(this);
    }
}
