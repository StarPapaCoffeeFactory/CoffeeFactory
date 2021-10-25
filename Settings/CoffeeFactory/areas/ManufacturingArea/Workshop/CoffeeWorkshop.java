package Settings.CoffeeFactory.areas.ManufacturingArea.Workshop;

import Settings.CoffeeFactory.areas.AreaName;
import Settings.CoffeeFactory.areas.Visitor.Visitor;
import Settings.CoffeeFactory.machine.processmachine.productmachine.coffeemachine.CoffeeArabicaMachine;
import Settings.CoffeeFactory.machine.processmachine.productmachine.coffeemachine.CoffeeRobustaMachine;

//这个车间生产coffee
public class CoffeeWorkshop extends Workshop{
    CoffeeArabicaMachine arabicaMachine=new CoffeeArabicaMachine();
    CoffeeRobustaMachine robustaMachine=new CoffeeRobustaMachine();
    public CoffeeWorkshop() {

    }

    //生产coffee
    @Override
    public void produceArabicaProduct() {
        System.out.println("Producing Arabica coffee...");
        arabicaMachine.useCoffeeBean();
    }

    @Override
    public void produceRobustaProduct() {
        System.out.println("Producing Robusta coffee...");
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
