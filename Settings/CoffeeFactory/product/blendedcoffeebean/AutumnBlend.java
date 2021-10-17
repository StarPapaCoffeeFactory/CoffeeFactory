package Settings.CoffeeFactory.product.blendedcoffeebean;

/**
 * @author LouTianyu
 * @description Blended coffee bean, which is called Autumn Blend. Created for Design Pattern Bridge
 */
public class AutumnBlend implements BlendedCoffee{
    @Override
    public String getBlended(){
        return "Autumn Blend";
    }

}
