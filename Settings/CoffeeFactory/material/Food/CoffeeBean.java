package Settings.CoffeeFactory.material.Food;
import java.util.Calendar;

public class CoffeeBean extends FoodInfo{
    /**
     * ctor of CoffeeBean
     * This ctor sets state to SOLID.
     *
     * @param initialQuant         initial quantity
     * @param initialExpireTime initial time to expire
     */
    public CoffeeBean(double initialQuant, Calendar initialExpireTime) {
        super(initialQuant, initialExpireTime, State.SOLID);
    }
    public CoffeeBean() {
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
        System.out.println("Successfully copy CoffeeBean!");
        return (CoffeeBean) super.clone();
    }
}

