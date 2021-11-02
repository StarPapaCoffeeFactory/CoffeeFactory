package Settings.CoffeeFactory.areas.manufacturingarea.AssemblyLine;

import Settings.CoffeeFactory.areas.visitors.Visitor;
import Settings.CoffeeFactory.product.originalcoffee.Arabica;
import Settings.CoffeeFactory.product.originalcoffee.Coffee;

/**
 * @author lc
 * @description Arabica coffee assembly line
 */
public class ArabicaCoffeeAssemblyLine extends AssemblyLine{
    /***
     * @return Coffee
     * @author lc
     * @description return coffee object
     */
    @Override
    public Coffee getCoffee() {
        return new Arabica();
    }
    /***
     * @return String
     * @author lc
     * @description return coffee name
     */
    public String toString(){return "Arabica";};

    /***
     * @param v
     * @author lc
     * @description The basic function of visitor design model (this class doesn't use this function)
     */
    @Override
    public void accept(Visitor v) {
        System.out.println("This not use");
    }
}
