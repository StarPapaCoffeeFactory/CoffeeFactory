package Settings.CoffeeFactory.areas.ManufacturingArea.AssemblyLine;

import Settings.CoffeeFactory.product.originalcoffee.Coffee;
import Settings.CoffeeFactory.product.originalcoffee.Robusta;

public class CoffeeAssemblyLine extends AssemblyLine {
    @Override
    public Coffee getCoffee() {
        return new Robusta();
    }
    public String toString(){return "Robusta";};
}
