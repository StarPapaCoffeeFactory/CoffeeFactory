package Settings.CoffeeFactory.machine.processmachine.packmachine.strategy;

import Settings.CoffeeFactory.product.Product;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BottleStrategy extends PackStrategy {

    @Override
    public void packaging(Product product) {

        System.out.println("Start packaging " + product.toString() + " with a bottle...");
        product.setPack(new Cup());
        product.gotoNextState();
        System.out.println("Finish packaging.");
        product.gotoNextState();

        Date day = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        product.setProducedDate(df.format(day));
    }


}
