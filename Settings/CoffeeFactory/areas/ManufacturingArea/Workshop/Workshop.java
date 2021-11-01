package Settings.CoffeeFactory.areas.ManufacturingArea.Workshop;

import Settings.CoffeeFactory.areas.Visitor.Visitor;
import Settings.CoffeeFactory.machine.processmachine.productmachine.ProductMachine;
import Settings.CoffeeFactory.areas.ManufacturingArea.ManufacturingArea;

/**
 * @author ZJX
 * @description Production workshop
 */
public abstract class Workshop extends ManufacturingArea {
    public ProductMachine productMachine;

    public Workshop() {
    }

    /**
     * @return String
     * @author ZJX
     * @description Return area name
     */
    @Override
    public abstract String toString();

    /***
     * @param v
     * @author ZJX
     * @description The basic function of visitor design model
     */
    public abstract void accept(Visitor v);

    /***
     * @return void
     * @author ZJX
     * @description produce arabica coffee product
     */
    public abstract void produceArabicaProduct();

    /***
     * @return void
     * @author ZJX
     * @description produce Robusta coffee product
     */
    public abstract void produceRobustaProduct();
}
