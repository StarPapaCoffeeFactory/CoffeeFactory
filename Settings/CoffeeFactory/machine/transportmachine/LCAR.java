package Settings.CoffeeFactory.machine.transportmachine;

import Settings.CoffeeFactory.product.Product;

/**
 * @author Yuan.Cai
 * @project chocolateFactory
 * @classname BigTruck
 * @description Machine for transporting a large quantity of items.
 * @date 2020/11/8 19:55
 */
public class LCAR extends TransportMachine {
    public LCAR(String type, String machineNum) {
        super(type, machineNum, 10, 1, 400);
    }


    public LCAR(String type, String machineNum, double age) {
        super(type, machineNum, age, 10, 1, 400);
    }

    @Override
    protected void load(Product product) {
        System.out.println(this.aimProcessNum + " " + product.getProductName() + " are being loaded on the big truck.");
    }

    @Override
    protected void arrive(Product product) {
        System.out.println(this.aimProcessNum + " " + product.getProductName() + " transport successfully.");
    }

    @Override
    public String toString() {
        return "LCAR";
    }
}
