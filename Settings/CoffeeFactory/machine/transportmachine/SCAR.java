package Settings.CoffeeFactory.machine.transportmachine;
import Settings.CoffeeFactory.product.Product;

/**
 * @author YSX
 * @description The class of small car extends Transport machine
 * @date 2021/10/27 21:09
 */
public class SCAR extends TransportMachine {
    public SCAR(String type, String machineNum) {
        super(type, machineNum, 20, 0.6, 50);
    }

    public SCAR(String type, String machineNum, double age) {
        super(type, machineNum, age, 20, 0.6, 50);
    }

    @Override
    public int work(Product product) {
        if (product == null) {
            return super.work(product);
        } else {
            System.out.println("Sorry, small cars cannot transport products.");
            return 0;
        }
    }
    protected int work() {
        System.out.println(aimProcessNum + " items transported successfully.");
        return 0;
    }
    /*
     *
 * @param product
     * @return void
     * @author YSX
     * @description the car loads something on it
     * @date 2021/10/27 21:48
     */
    @Override
    protected void load(Product product) {
        System.out.println("Four people are getting on the small car.");
    }

    /*
     *
 * @param product
     * @return void
     * @author YSX
     * @description the car successfully arrives at its destination
     * @date 2021/10/27 21:48
     */
    @Override
    protected void arrive(Product product) {
        System.out.println("Four people arrive at the destination.");
    }


}
