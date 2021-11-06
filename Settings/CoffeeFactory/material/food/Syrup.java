package Settings.CoffeeFactory.material.food;
import java.util.Calendar;

public class Syrup extends FoodInfo{
    /**
     * ctor of Syrup
     * @description This ctor sets state to LIQUID.
     *
     * @param initialQuant         initial quantity
     * @param initialExpireTime initial time to expire
     */
    public Syrup(double initialQuant, Calendar initialExpireTime) {
        super(initialQuant, initialExpireTime, State.LIQUID);
    }
    public Syrup() {
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
        System.out.println("Successfully copy Syrup!");
        return (Syrup) super.clone();
    }
}