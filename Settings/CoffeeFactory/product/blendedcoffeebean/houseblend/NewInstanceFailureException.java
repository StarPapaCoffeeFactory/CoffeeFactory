package Settings.CoffeeFactory.product.blendedcoffeebean.houseblend;

/**
 * @author LouTianyu
 * @description Exception thrown when HouseBlend.getCoffee() failed to create an
 * instance of extended Coffee. In normal cases, this exception SHOULD NEVER BE
 * THROWN, as the parameter of HouseBlendFactory.getChocolate() is required to be one of
 * the extended classes of Coffee, and they all have trivial constructor with no parameter.
 */
public class NewInstanceFailureException extends Exception{
    static final long serialVersionUID = 1L;
    public NewInstanceFailureException(Class<?> type) {
        super("Failed to create coffee of type: " + type.getSimpleName());
    }
}
