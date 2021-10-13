package Settings.CoffeeFactory.product.originalcoffeebean;

import Settings.CoffeeFactory.product.blendedcoffeebean.BlendedCoffee;

public class Arabica extends Coffee{
    public Arabica(){super("Arabica",24,10,1.00);}
    
    public Arabica(String name, int shelfLife, int weight, double content, BlendedCoffee blended) {
        super("Arabica", 24, 10, 1.00, blended);
        this.initIngredientList();
    }

    @Override
    protected void initIngredientList() {
        super.ingredientList.add(new CoffeeBean());
        super.ingredientList.add(new Water());
    }

    @Override
    public void dispaly() {
        System.out.println("This is Arabica Coffee!");
    }

    @Override
    public String getBlendedCoffee(){return blended.getBlended()+ " Arabica Coffee";}

    @Override
    public String toString() {
        return "subclass : DarkCoffee";
    }

    @Override
    public void display(){};

}
