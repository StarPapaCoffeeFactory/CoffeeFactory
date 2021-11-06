package Settings.CoffeeFactory.material.food;
import java.util.Calendar;

public class Water extends FoodInfo{
    /**
     * ctor of Water
     * @description This ctor sets state to LIQUID.
     *
     * @param initialQuant         initial quantity
     * @param initialExpireTime initial time to expire
     */
    public Water(double initialQuant, Calendar initialExpireTime) {
        super(initialQuant, initialExpireTime, State.LIQUID);
    }
    public Water() {
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
        System.out.println("Successfully copy Water!");
        return (Water) super.clone();
    }
}