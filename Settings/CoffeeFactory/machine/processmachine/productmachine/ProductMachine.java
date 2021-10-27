package Settings.CoffeeFactory.machine.processmachine.productmachine;
import Settings.CoffeeFactory.product.Product;
import Settings.CoffeeFactory.machine.processmachine.ProcessMachine;
/**
 * @author YSX
 * @description The basic abstract class of the Product machine that extends Process Machine
 * @date 2021/10/27 21:16
 */
public abstract class ProductMachine extends ProcessMachine {

    public ProductMachine(String type, String ID, double lifeSpan, double basicLoss, int maxProcessNum) {
        super(type, ID, lifeSpan,  maxProcessNum,basicLoss);
    }
    public ProductMachine(String type, String ID, double age,double lifeSpan, double basicLoss, int maxProcessNum) {
        super(type, ID, age,lifeSpan,  maxProcessNum,basicLoss);
    }

    @Override
    public void process(Product product, int productNum) {
        System.out.println("Successfully produce " + productNum + " " + product.getProductName());
        product.nextStage();
    }

    public String toString() {
        return "class ProductMachine";
    }
}
