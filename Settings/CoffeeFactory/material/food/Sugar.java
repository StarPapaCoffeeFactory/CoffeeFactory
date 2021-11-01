package Settings.CoffeeFactory.material.food;
import java.util.Calendar;

public class Sugar extends FoodInfo{
    /**
     * ctor of Sugar
     * This ctor sets state to POWDER.
     *
     * @param initialQuant         initial quantity
     * @param initialExpireTime initial time to expire
     */
    public Sugar(double initialQuant, Calendar initialExpireTime) {
        super(initialQuant, initialExpireTime, State.POWDER);
    }
    public Sugar() {
        super(State.POWDER);
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
        System.out.println("Successfully copy Sugar!");
        return (Sugar) super.clone();
    }
}