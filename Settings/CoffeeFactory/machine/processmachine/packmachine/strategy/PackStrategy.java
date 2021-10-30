package Settings.CoffeeFactory.machine.processmachine.packmachine.strategy;

import Settings.CoffeeFactory.product.Product;

/**
 * @author ShenBo
 * @description The abstract class of the pack strategy
 */
public abstract class PackStrategy {

    public abstract void packaging(Product product);
}
