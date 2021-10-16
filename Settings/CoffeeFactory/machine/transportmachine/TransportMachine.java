package Settings.CoffeeFactory.machine.transportmachine;
import Settings.CoffeeFactory.machine.Machine;
import Settings.CoffeeFactory.product.Product;

public abstract class TransportMachine extends Machine {
    public TransportMachine(String type, String ID, double lifeSpan, double basicLoss, int maxProcessNum) {
        super(type, ID, lifeSpan,  maxProcessNum,basicLoss);
    }

    public TransportMachine(String type, String ID, double age, double lifeSpan, double basicLoss, int maxProcessNum) {
        super(type, ID, age, lifeSpan, maxProcessNum, basicLoss);
    }
    protected abstract void load(Product product);
    protected abstract void arrive(Product product);

    @Override
    public int work(Product product) {
        load(product);
        System.out.println("On the way to the destination...");
        arrive(product);
        return 0;
    }

    public String toString() {
        return "class TransportMachine";
    }

}
