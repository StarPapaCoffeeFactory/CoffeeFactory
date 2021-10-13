package Settings.CoffeeFactory.product.OriginalCoffeeBean;

import Settings.CoffeeFactory.product.coffeebeverage.Beverage;

public class Arabica extends Coffee{
    public Arabica(){super("Arabica",24,10,1.00);}
    public Arabica(String name, int shelfLife, int weight, double content, Beverage beverage) {
        super("Arabica", 24, 10, 1.00, beverage);
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
    public String getBlended(){return beverage.getBeverage() + " Arabica Coffee";}

    @Override
    public String toString() {
        return "subclass : DarkCoffee";
    }

    @Override
    public void display(){};

}
