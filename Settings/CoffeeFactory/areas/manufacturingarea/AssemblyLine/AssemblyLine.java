package Settings.CoffeeFactory.areas.manufacturingarea.AssemblyLine;

import Settings.CoffeeFactory.areas.manufacturingarea.ManufacturingArea;
import Settings.CoffeeFactory.product.originalcoffee.Coffee;

/***
 * @author ZJX
 * @description Abstract coffee factory assembly line
 *
 */
public abstract class AssemblyLine extends ManufacturingArea {
    /***
     * @return Coffee
     * @author ZJX
     * @description Returns the corresponding coffee product
     */
    public abstract Coffee getCoffee();

}
