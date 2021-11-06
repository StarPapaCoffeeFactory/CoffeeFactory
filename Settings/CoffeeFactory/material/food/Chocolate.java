package Settings.CoffeeFactory.material.food;
import java.util.Calendar;

public class Chocolate extends FoodInfo{

    /**
     * ctor of Chocolate
     * @description This ctor sets state to SOLID.
     *
     * @param initialQuant         initial quantity
     * @param initialExpireTime initial time to expire
     */
    public Chocolate(double initialQuant, Calendar initialExpireTime) {
        super(initialQuant, initialExpireTime, State.SOLID);
    }
    public Chocolate() {
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
        System.out.println("Successfully copy Chocolate!");
        return (Chocolate) super.clone();
    }
}
