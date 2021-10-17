package Settings.CoffeeFactory.material.Food;
import java.util.Calendar;

public class BourbonCoffeeBean extends FoodInfo{
    /**
     * ctor of BourbonCoffeeBean
     * This ctor sets state to SOLID.
     *
     * @param initialQuant         initial quantity
     * @param initialExpireTime initial time to expire
     */
    public BourbonCoffeeBean(double initialQuant, Calendar initialExpireTime) {
        super(initialQuant, initialExpireTime, State.SOLID);
    }
    public BourbonCoffeeBean() {
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
        System.out.println("Successfully copy BourbonCoffeeBean!");
        return (BourbonCoffeeBean) super.clone();
    }
}


