package Settings.CoffeeFactory.machine.transportmachine;

import Settings.CoffeeFactory.product.Product;

/**
 * @author YSX
 * @description The class of large car extends Transport machine
 * @date 2021/10/27 21:10
 */
public class LCAR extends TransportMachine {
    public LCAR(String type, String machineNum) {
        super(type, machineNum, 10, 1, 400);
    }


    public LCAR(String type, String machineNum, double age) {
        super(type, machineNum, age, 10, 1, 400);
    }
    /**
     * @param product
     * @return void
     * @author YSX
     * @description the car loads something on it
     * @date 2021/10/27 21:48
     */
    @Override
    protected void load(Product product) {
        System.out.println(this.aimProcessNum + " " + product.getProductName() + " are being loaded on the big truck.");
    }

    @Override
    /**
     * @param product
     * @return void
     * @author YSX
     * @description the car successfully arrives at its destination
     * @date 2021/10/27 21:48
     */
    protected void arrive(Product product) {
        System.out.println(this.aimProcessNum + " " + product.getProductName() + " transport successfully.");
    }

    @Override
    public String toString() {
        return "LCAR";
    }
}
