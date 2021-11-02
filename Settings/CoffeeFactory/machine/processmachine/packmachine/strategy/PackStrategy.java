package Settings.CoffeeFactory.machine.processmachine.packmachine.strategy;

import Settings.CoffeeFactory.product.Product;

/**
 * @author ShenBo
 * @description The abstract class of the pack strategy
 */
public abstract class PackStrategy {

    /*
     * @param product
     * @return void
     * @author ShenBo
     * @description the abstract function to pack the product
     */
    public abstract void packaging(Product product);
}
