package Settings.CoffeeFactory.machine.transportmachine.adapter;

import Settings.CoffeeFactory.product.Product;


public interface Aircraft {

    int work(Product product);

    void setID(String ID);

    String getID();

    void setAimProcessNum(int aimProcessNum);


    //导航
    void navigate();

}
