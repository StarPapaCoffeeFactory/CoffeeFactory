package Settings.CoffeeFactory.material.food;
import java.util.Calendar;

public class ArabicaCoffeeBean extends FoodInfo{
    /**
     * ctor of ArabicaCoffeeBean
     * This ctor sets state to SOLID.
     *
     * @param initialQuant         initial quantity
     * @param initialExpireTime initial time to expire
     */
    public ArabicaCoffeeBean(double initialQuant, Calendar initialExpireTime) {
        super(initialQuant, initialExpireTime, State.SOLID);
    }
    public ArabicaCoffeeBean() {
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
        System.out.println("Successfully copy ArabicaCoffeeBean!");
        return (ArabicaCoffeeBean) super.clone();
    }
}


