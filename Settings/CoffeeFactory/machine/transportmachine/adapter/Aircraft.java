package Settings.CoffeeFactory.machine.transportmachine.adapter;

import Settings.CoffeeFactory.product.Product;

/**
 * @author ShenBo
 * @description The interface of Aircraft
 */
public interface Aircraft {

    /*
     * @param product
     * @return int
     * @author ShenBo
     * @description The work function of the aircraft
     */
    int work(Product product);

    void setID(String ID);

    String getID();

    void setAimProcessNum(int aimProcessNum);

    /*
     * @return void
     * @author ShenBo
     * @description The aircraft can fly
     */
    void fly();
}
