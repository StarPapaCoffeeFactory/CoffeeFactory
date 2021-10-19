package Settings.CoffeeFactory.machine.processmachine.packmachine.strategy;

import Settings.CoffeeFactory.material.Package.Box;
import Settings.CoffeeFactory.product.Product;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BoxStrategy extends PackStrategy {

    @Override
    public void packaging(Product product) {

        System.out.println("Start packaging " + product.toString() + " with a box...");
        product.setPackage(new Box());
        product.nextStage();
        System.out.println("Finish packaging.");
        product.nextStage();

        Date day = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        product.setProductionDate(df.format(day));
    }
}
