package Settings.CoffeeFactory.management;

import Settings.CoffeeFactory.areas.*;
public class CoffeeFactory {

    private static CoffeeFactory instance = null; //Only one factory instance should exist.
    private AreaUtil areaUtil;

    //Private constructor to ensure single instance .
    private CoffeeFactory(){
        areaUtil = new AreaUtil();
    }

    //Singleton
    public static CoffeeFactory getCoffeeFactory() {
        if (instance == null) {
            instance = new CoffeeFactory();
        }
        return instance;
    }
}
