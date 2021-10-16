package Settings.CoffeeFactory.machine.processmachine.quatifymachine;
import Settings.CoffeeFactory.machine.processmachine.ProcessMachine;
import Settings.CoffeeFactory.product.Product;
public class QuatifyMachine extends ProcessMachine{
    public QuatifyMachine(String type)
    {
        super(type);
    }

    public QuatifyMachine(String type, String ID, double lifeSpan, int maxProcessNum,double basicLoss) {
        super(type, ID, lifeSpan, maxProcessNum, basicLoss);
    }

    @Override
    public void process(Product product, int productNum) {
        product.packaging();
    }

    public String toString() {
        return "class QualityTestMachine";
    }
}
