package Settings.CoffeeFactory.machine.processmachine.packmachine.strategy;

import Settings.CoffeeFactory.material.Package.MiddleCup;
import Settings.CoffeeFactory.product.Product;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MiddleCupStrategy extends PackStrategy {

    @Override
    public void packaging(Product product) {

        System.out.println("Start packaging " + product.getProductName() + " with a middle cup...");
        product.setPackage(new MiddleCup());
        product.nextStage();
        System.out.println("Finish packaging.");
        product.nextStage();

        Date day = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        product.setProductionDate(df.format(day));
    }
}
