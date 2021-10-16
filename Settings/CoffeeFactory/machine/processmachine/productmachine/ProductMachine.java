package Settings.CoffeeFactory.machine.processmachine.productmachine;
import Settings.CoffeeFactory.product.Product;
import Settings.CoffeeFactory.machine.processmachine.ProcessMachine;

public abstract class ProductMachine extends ProcessMachine {

    public ProductMachine(String type, String ID, double lifeSpan, double basicLoss, int maxProcessNum) {
        super(type, ID, lifeSpan,  maxProcessNum,basicLoss);
    }
    public ProductMachine(String type, String ID, double age,double lifeSpan, double basicLoss, int maxProcessNum) {
        super(type, ID, age,lifeSpan,  maxProcessNum,basicLoss);
    }

    @Override
    public void process(Product product, int productNum) {
        System.out.println("Successfully produce " + productNum + " " + product.getName());
        product.gotoNextState();
    }

    public String toString() {
        return "class ProductMachine";
    }
}
