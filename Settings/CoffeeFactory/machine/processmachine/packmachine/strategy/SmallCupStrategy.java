package Settings.CoffeeFactory.machine.processmachine.packmachine.strategy;

import Settings.CoffeeFactory.material.packages.SmallCup;
import Settings.CoffeeFactory.product.Product;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ShenBo
 * @description the strategy to pack coffee product with small cup
 */
public class SmallCupStrategy extends PackStrategy {

    /*
     * @param product
     * @return void
     * @author ShenBo
     * @description pack the coffee product with small cup
     */
    @Override
    public void packaging(Product product) {

        System.out.println("Start packaging " + product.getProductName() + " with a small cup...");
        product.setPackage(new SmallCup());
        product.nextStage();
        System.out.println("Complete packaging.");
        product.nextStage();

        Date day = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        product.setProductionDate(df.format(day));
    }


}
