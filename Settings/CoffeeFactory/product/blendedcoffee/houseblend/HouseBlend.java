package Settings.CoffeeFactory.product.blendedcoffee.houseblend;

import Settings.CoffeeFactory.material.Material;
import Settings.CoffeeFactory.material.packages.MiddleCup;
import Settings.CoffeeFactory.product.Product;
import Settings.CoffeeFactory.product.originalcoffee.Coffee;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author LouTianyu
 * @description Blended coffee bean, which is called House Blend. Created for Design Pattern Flyweight
 */
public class HouseBlend extends Product {
    // fields
    private final Coffee[] coffeeList;

    /**
     * Constructor for HouseBlend
     *
     * @param typeList List of extended class of Coffee
     * @throws NewInstanceFailureException Thrown when failed to create an instance.
     */
    public HouseBlend(List<Class<? extends Coffee>> typeList)
            throws NewInstanceFailureException {
        super("House Blend", Integer.MAX_VALUE, 0);
        Coffee coffee = null;
        int coffeeShelfLife = 0;
        int index = 0;

        coffeeList = new Coffee[typeList.size()];
        for (Class<? extends Coffee> type : typeList) {
            coffee = HouseBlendFactory.getCoffee(type);
            coffeeList[index] = coffee;
            weight += coffee.getWeight();
            coffeeShelfLife = coffee.getShelfLife();
            if (coffeeShelfLife < shelfLife) {
                shelfLife = coffeeShelfLife;
            }
            index++;
        }
        this.initIngredientList();
    }

    public HouseBlend(Coffee[] coffeeList) {
        this.coffeeList = coffeeList;
    }

    /**
     * @param index index of instance
     * @return coffee instance
     */
    public Coffee at(int index) {
        if (index >= 0 && index < coffeeList.length) {
            return coffeeList[index];
        } else {
            return null;
        }
    }

    /*
     * @description set the package for HouseBlend
     */
    @Override
    public void pack() {
        super.nextStage();
        System.out.println("Start packing HouseBlend coffee bean...");
        super.pack = new MiddleCup(1);
        super.nextStage();
        System.out.println("Finish packing HouseBlend coffee bean.");
        super.nextStage();

        Date day = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        super.setProductionDate(df.format(day));
    }

    /*
     * @description set the material for HouseBlend
     */
    @Override
    protected void initIngredientList() {
        for (Coffee coffee : coffeeList) {
            for (Material material : coffee.ingredientList) {
                if (!ingredientList.contains(material)) {
                    ingredientList.add(material);
                }
            }
        }
    }

}
