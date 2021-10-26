package Settings.CoffeeFactory.machine.transportmachine;

import Settings.CoffeeFactory.product.Product;

public class MCAR extends TransportMachine {
    public MCAR(String type, String machineNum) {
        super(type, machineNum, 15, 0.8, 150);
    }



    public MCAR(String type, String machineNum, double age) {
        super(type, machineNum, age, 15, 0.8, 150);
    }

    @Override
    protected void load(Product product) {
        System.out.println("Four people are getting on the van and " +
                this.aimProcessNum + " " + product.getProductName() + " are being loaded on the van.");
    }

    @Override
    protected void arrive(Product product) {
        System.out.println("Four people and " +
                this.aimProcessNum + " " + product.getProductName() + " arrive at the destination.");
    }

}
