package Settings.CoffeeFactory.product.blendedcoffee;

/**
 * @author LouTianyu
 * @description Blended coffee bean, which is called Pike Place. Created for Design Pattern Bridge
 */
public class PikePlace implements BlendedCoffee{
    @Override
    public String getBlended(){
        return "PikePlace";
    }

}
