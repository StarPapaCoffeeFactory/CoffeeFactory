package Settings.CoffeeFactory.machine.processmachine.packmachine.strategy;

import Settings.CoffeeFactory.material.Package.LargeCup;
import Settings.CoffeeFactory.product.Product;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ShenBo
 * @description the strategy to pack coffee product with large cup
 */
public class LargeCupStrategy extends PackStrategy{

    /*
     * @param product
     * @return void
     * @author ShenBo
     * @description pack the coffee product with large cup
     */
    @Override
    public void packaging(Product product) {

        System.out.println("Start packaging " + product.getProductName() + " with a large cup...");
        product.setPackage(new LargeCup());
        product.nextStage();
        System.out.println("Complete packaging.");
        product.nextStage();

        Date day = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        product.setProductionDate(df.format(day));
    }
}
