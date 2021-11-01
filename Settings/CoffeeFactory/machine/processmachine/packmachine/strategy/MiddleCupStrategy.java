package Settings.CoffeeFactory.machine.processmachine.packmachine.strategy;

import Settings.CoffeeFactory.material.packages.MiddleCup;
import Settings.CoffeeFactory.product.Product;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ShenBo
 * @description the strategy to pack coffee product with middle cup
 */
public class MiddleCupStrategy extends PackStrategy {

    /*
     * @param product
     * @return void
     * @author ShenBo
     * @description pack the coffee product with middle cup
     */
    @Override
    public void packaging(Product product) {

        System.out.println("Start packaging " + product.getProductName() + " with a middle cup...");
        product.setPackage(new MiddleCup());
        product.nextStage();
        System.out.println("Complete packaging.");
        product.nextStage();

        Date day = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        product.setProductionDate(df.format(day));
    }
}
