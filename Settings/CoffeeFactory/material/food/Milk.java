package Settings.CoffeeFactory.material.food;
import java.util.Calendar;

public class Milk extends FoodInfo{
    /**
     * ctor of Milk
     * @description This ctor sets state to LIQUID.
     *
     * @param initialQuant         initial quantity
     * @param initialExpireTime initial time to expire
     */
    public Milk(double initialQuant, Calendar initialExpireTime) {
        super(initialQuant, initialExpireTime, State.LIQUID);
    }
    public Milk() {
        super(State.SOLID);
    }

    @Override
    public boolean process() {
        /*
         * TODO: implement Chocolate.process()
         */
        return false;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("Successfully copy Milk!");
        return (Milk) super.clone();
    }
}