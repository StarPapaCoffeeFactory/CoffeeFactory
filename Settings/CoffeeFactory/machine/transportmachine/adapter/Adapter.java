package Settings.CoffeeFactory.machine.transportmachine.adapter;

import Settings.CoffeeFactory.machine.transportmachine.TransportMachine;
import Settings.CoffeeFactory.product.Product;

/**
 * @author ShenBo
 * @description The class Adapter that implements Aircraft
 */
public class Adapter implements Aircraft {
    private TransportMachine adaptee;
    private String mID;

    public Adapter() { }

    public Adapter(TransportMachine adaptee) {
        this.adaptee = adaptee;
    }

    /*
     * @param product
     * @return int
     * @author ShenBo
     * @description The aircraft start to fly and work
     */
    @Override
    public int work(Product product) {
        this.fly();
        adaptee.run(product);
        return 0;
    }

    @Override
    public void setID(String ID) {
        this.mID = ID;
    }

    @Override
    public String getID() {
        return this.mID;
    }

    @Override
    public void setAimProcessNum(int aimProcessNum) {
        adaptee.setAimProcessNum(aimProcessNum);
    }

    /*
     * @return void
     * @author ShenBo
     * @description The aircraft is flying
     */
    @Override
    public void fly() {
        System.out.println("Aircraft" + this.mID + " is flying...");
    }

    public TransportMachine getAdaptee() {
        return adaptee;
    }

    public void setAdaptee(TransportMachine adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public String toString() {
        return "class Adapter implements Aircraft";
    }
}
