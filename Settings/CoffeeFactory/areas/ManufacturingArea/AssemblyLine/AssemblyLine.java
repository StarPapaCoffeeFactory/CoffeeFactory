package Settings.CoffeeFactory.areas.ManufacturingArea.AssemblyLine;

import Settings.CoffeeFactory.areas.ManufacturingArea.ManufacturingArea;

//抽象coffee工厂流水线
public abstract class AssemblyLine extends ManufacturingArea {

    //返回相应的机装产品
    public abstract Coffee getCoffee();
}
