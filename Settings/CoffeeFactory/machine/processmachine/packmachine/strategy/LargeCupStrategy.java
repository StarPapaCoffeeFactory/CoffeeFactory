package Settings.CoffeeFactory.machine.processmachine.packmachine.strategy;

import Settings.CoffeeFactory.material.Package.LargeCup;
import Settings.CoffeeFactory.product.Product;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ShenBo
 * @description pack coffee product with large cup
 */
public class LargeCupStrategy extends PackStrategy{
    @Override
    public void packaging(Product product) {

        System.out.println("Start packaging " + product.getProductName() + " with a large cup...");
        product.setPackage(new LargeCup());
        product.nextStage();
        System.out.println("Finish packaging.");
        product.nextStage();

        Date day = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        product.setProductionDate(df.format(day));
    }
}
