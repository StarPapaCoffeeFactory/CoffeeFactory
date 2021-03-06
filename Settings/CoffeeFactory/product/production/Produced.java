package Settings.CoffeeFactory.product.production;

import Settings.CoffeeFactory.product.Product;

/**
 * @author LouTianyu
 * @description Produced
 */
public class Produced extends ProductionStage{
    @Override
    public void nextState(Product product) {
        product.setStage(new Packaging());
        System.out.println("The product has been produced,and will be packaged.");
    }

    @Override
    public String toString() {
        return "Produced";
    }
}
