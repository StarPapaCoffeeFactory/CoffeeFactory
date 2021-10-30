package Settings.CoffeeFactory.machine.processmachine.qualifymachine;

import Settings.CoffeeFactory.machine.processmachine.ProcessMachine;
import Settings.CoffeeFactory.product.Product;
/**
 * @author YSX
 * @description The class of QualifyMachine
 * @date 2021/10/27 21:13
 */
public class QualifyMachine extends ProcessMachine {
    public QualifyMachine(String type)
    {
        super(type);
    }

    public QualifyMachine(String type, String ID, double lifeSpan, int maxProcessNum,double basicLoss) {
        super(type, ID, lifeSpan, maxProcessNum, basicLoss);
    }

    @Override
    public void process(Product product, int productNum) {
        product.pack();
    }

    public String toString() {
        return "class QualifyMachine";
    }
}
