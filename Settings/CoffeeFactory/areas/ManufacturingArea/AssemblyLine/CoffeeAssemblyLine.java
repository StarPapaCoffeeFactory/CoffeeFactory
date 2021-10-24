package Settings.CoffeeFactory.areas.ManufacturingArea.AssemblyLine;

import Settings.CoffeeFactory.areas.Visitor.Visitor;
import Settings.CoffeeFactory.product.originalcoffee.Coffee;
import Settings.CoffeeFactory.product.originalcoffee.Robusta;

public class CoffeeAssemblyLine extends AssemblyLine {
    @Override
    public Coffee getCoffee() {
        return new Robusta();
    }
    public String toString(){return "Robusta";};

    @Override
    public void accept(Visitor v) {
        System.out.println("This not use");
    }
}
