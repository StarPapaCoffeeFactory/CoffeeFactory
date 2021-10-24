package Settings.CoffeeFactory.management;

import Settings.CoffeeFactory.areas.*;
public class CoffeeFactory {

    private static CoffeeFactory instance = null; //Only one factory instance should exist.
    private Area area;

    //Private constructor to ensure single instance .
    private CoffeeFactory(){
        area = new Area() {
            @Override
            public String toString() {
                return null;
            }
        };
    }

    //Singleton
    public static CoffeeFactory getCoffeeFactory() {
        if (instance == null) {
            instance = new CoffeeFactory();
        }
        return instance;
    }
}
