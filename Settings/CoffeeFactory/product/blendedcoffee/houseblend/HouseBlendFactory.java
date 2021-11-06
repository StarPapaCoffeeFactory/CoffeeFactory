package Settings.CoffeeFactory.product.blendedcoffee.houseblend;

import Settings.CoffeeFactory.product.originalcoffee.Coffee;
import java.util.HashMap;

/**
 * @author LouTianyu
 * @description Factory class for HouseBlend. Created for Design Pattern Flyweight
 */
public class HouseBlendFactory {
    private static final HashMap<Class<? extends Coffee>, Coffee> coffeeMap =
            new HashMap<>();

    /**
     * @description Get an instance of certain subclass of Coffee or create a new one if absent.
     * @param type Extended class of Coffee
     * @return Instance of (extended) Coffee.
     * @throws NewInstanceFailureException Thrown when failed to create an instance.
     */
    public static Coffee getCoffee(Class<? extends Coffee> type)
            throws NewInstanceFailureException {
        Coffee coffee = coffeeMap.computeIfAbsent(type, (Class<? extends Coffee> key) -> {
                    try {
                        System.out.println("Creating coffee of type: " + key.getSimpleName());
                        return key.getDeclaredConstructor().newInstance();
                    } catch (Exception e) {
                        return null;
                    }
                });

        if (coffee == null) {
            throw new NewInstanceFailureException(type);
        }
        return coffee;
    }

    private HouseBlendFactory() {
    }
}
