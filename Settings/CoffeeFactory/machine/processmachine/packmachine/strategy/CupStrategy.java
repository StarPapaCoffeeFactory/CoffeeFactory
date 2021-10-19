package Settings.CoffeeFactory.machine.processmachine.packmachine.strategy;

import Settings.CoffeeFactory.material.Package.Cup;
import Settings.CoffeeFactory.product.Product;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CupStrategy extends PackStrategy {

    @Override
    public void packaging(Product product) {

        System.out.println("Start packaging " + product.toString() + " with a cup...");
        product.setPackage(new Cup());
        product.nextStage();
        System.out.println("Finish packaging.");
        product.nextStage();

        Date day = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        product.setProductionDate(df.format(day));
    }


}
