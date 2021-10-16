package Settings.CoffeeFactory.machine.processmachine;
import Settings.CoffeeFactory.machine.Machine;
import Settings.CoffeeFactory.product.Product;

import java.util.Random;
public abstract class ProcessMachine extends Machine {

    public ProcessMachine(String type, String ID, double lifeSpan,  int maxProcessNum, double basicLoss) {
        super(type, ID, lifeSpan,  maxProcessNum,basicLoss);
    }

    public ProcessMachine(String type, String ID, double age, double lifeSpan, int maxProcessNum, double basicLoss) {
        super(type, ID, age, lifeSpan, maxProcessNum, basicLoss);
    }
    @Override
    protected int work(Product product) {
        if (isBroken) {
            System.out.println("This machine can't work because of a malfunction, please fix!\n");
            return 0;
        }
        Random rand = new Random();
        int failPossibility = rand.nextInt(12);
        if (failPossibility < 2) malfunction();
        if (!isBroken) {
            Random rand2 = new Random();
            int bounds = (int) (aimProcessNum * 0.02);
            int trashNum = rand2.nextInt(bounds);
            // 返回的值是成功产出产品数
            process(product, aimProcessNum - trashNum);
            increaseAge();
            return aimProcessNum - trashNum;
        } else {
            System.out.println("This machine can't work because of a malfunction, please fix!\n");
            return 0;
        }
    }
    public abstract void process(Product product, int productNum);

    public ProcessMachine(String type) {
        super(type);
    }

    public String toString() {
        return "class ProcessMachine";
    }
}
