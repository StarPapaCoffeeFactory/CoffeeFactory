package Settings.CoffeeFactory.product.blendedcoffeebean;

/**
 * @author LouTianyu
 * @description Blended coffee bean, which is called Verona. Created for Design Pattern Bridge
 */
public class Verona implements BlendedCoffee{
    @Override
    public String getBlended(){
        return "Verona";
    }
}
