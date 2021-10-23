package Settings.CoffeeFactory.areas.ManufacturingArea.AssemblyLine;

import Settings.CoffeeFactory.product.originalcoffee.Coffee;

public class CoffeeAssemblyLine extends AssemblyLine {
    @Override
    public Coffee getCoffee() {
        return new Coffee();
    }
}
