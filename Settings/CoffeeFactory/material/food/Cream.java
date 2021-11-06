package Settings.CoffeeFactory.material.food;
import java.util.Calendar;

public class Cream extends FoodInfo{
    /**
     * ctor of Cream
     * @description This ctor sets state to LIQUID.
     *
     * @param initialQuant         initial quantity
     * @param initialExpireTime initial time to expire
     */
    public Cream(double initialQuant, Calendar initialExpireTime) {
        super(initialQuant, initialExpireTime, State.LIQUID);
    }
    public Cream() {
        super(State.LIQUID);
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
        System.out.println("Successfully copy Cream!");
        return (Cream) super.clone();
    }
}