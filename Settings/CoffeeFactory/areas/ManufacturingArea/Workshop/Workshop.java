package Settings.CoffeeFactory.areas.ManufacturingArea.Workshop;

import Settings.CoffeeFactory.areas.Visitor.Visitor;
import Settings.CoffeeFactory.machine.processmachine.productmachine.ProductMachine;
import Settings.CoffeeFactory.areas.ManufacturingArea.ManufacturingArea;

//产品生产车间
public abstract class Workshop extends ManufacturingArea {
    public ProductMachine productMachine;

    public Workshop() {
    }

    //返回区域名字
    @Override
    public abstract String toString();

    //Visitor
    public abstract void accept(Visitor v);

    //生产coffee
    public abstract void produceCoffee();


}
