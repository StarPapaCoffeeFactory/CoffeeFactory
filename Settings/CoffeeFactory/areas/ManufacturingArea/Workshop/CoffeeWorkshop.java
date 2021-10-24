package Settings.CoffeeFactory.areas.ManufacturingArea.Workshop;

import Settings.CoffeeFactory.areas.AreaName;
import Settings.CoffeeFactory.areas.Visitor.Visitor;

//这个车间生产coffee
public class CoffeeWorkshop extends Workshop{
    public CoffeeWorkshop() {

    }

    //生产coffee
    @Override
    public void produceCoffee() {
        System.out.println("this function used to produce coffee!");
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
