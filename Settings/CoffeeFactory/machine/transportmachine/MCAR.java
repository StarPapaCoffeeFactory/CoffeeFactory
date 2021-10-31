package Settings.CoffeeFactory.machine.transportmachine;

import Settings.CoffeeFactory.product.Product;
/**
 * @author YSX
 * @description The class of medium car extends Transport machine
 * @date 2021/10/27 21:10
 */
public class MCAR extends TransportMachine {
    public MCAR(String type, String machineNum) {
        super(type, machineNum, 15, 0.8, 150);
    }



    public MCAR(String type, String machineNum, double age) {
        super(type, machineNum, age, 15, 0.8, 150);
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
        System.out.println("Four people are getting on the van and " +
                this.aimProcessNum + " " + product.getProductName() + " are being loaded on the van.");
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
        System.out.println("Four people and " +
                this.aimProcessNum + " " + product.getProductName() + " arrive at the destination.");
    }

}
