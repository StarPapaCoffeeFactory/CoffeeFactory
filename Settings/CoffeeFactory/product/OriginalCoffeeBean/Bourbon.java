package Settings.CoffeeFactory.product.OriginalCoffeeBean;

import Settings.CoffeeFactory.product.coffeebeverage.Beverage;

public class Bourbon extends Coffee{
    protected double bourbonPortion;

    public Bourbon(){super("Bourbon",24,10,0.95);}

    public Bourbon(Beverage beverage){
        super("Bourbon",24,10,0.95,beverage);
        this.bourbonPortion = 0.95;
        this.initIngredientList();
    }

    public double getBourbonPortion() {
        return bourbonPortion;
    }

    @Override
    protected void initIngredientList(){
        super.ingredientList.add(new CoffeeBean());
        super.ingredientList.add(new Water());
    }

    @Override
    public String getBlended(){return blended.getBlended()}
}
