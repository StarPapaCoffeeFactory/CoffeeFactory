package Settings.CoffeeFactory.areas.ManufacturingArea.AssemblyLine;

import Settings.CoffeeFactory.areas.Visitor.Visitor;
import Settings.CoffeeFactory.product.originalcoffee.Coffee;
import Settings.CoffeeFactory.product.originalcoffee.Robusta;

/***
 * @author ZJX
 * @description coffee assembly line
 */
public class CoffeeAssemblyLine extends AssemblyLine {
    /***
     * @return Coffee
     * @author ZJX
     * @description return coffee object
     */
    @Override
    public Coffee getCoffee() {
        return new Robusta();
    }
    /***
     * @return String
     * @author ZJX
     * @description return coffee name
     */
    public String toString(){return "Robusta";};

    /***
     * @param v
     * @author ZJX
     * @description The basic function of visitor design model (this class doesn't use this function)
     */
    @Override
    public void accept(Visitor v) {
        System.out.println("This not use");
    }
}
