package Settings.CoffeeFactory.product.production;

import Settings.CoffeeFactory.product.Product;

/**
 * @author LouTianyu
 * @description ProductionStage is meant for the design pattern State
 */
public abstract class ProductionStage {
    public abstract void nextState(Product product);
}
