package Settings.CoffeeFactory.material.Food;
import java.util.Calendar;

public class RobustaCoffeeBean extends FoodInfo{
    /**
     * ctor of RobustaCoffeeBean
     * This ctor sets state to SOLID.
     *
     * @param initialQuant         initial quantity
     * @param initialExpireTime initial time to expire
     */
    public RobustaCoffeeBean(double initialQuant, Calendar initialExpireTime) {
        super(initialQuant, initialExpireTime, State.SOLID);
    }
    public RobustaCoffeeBean() {
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
        System.out.println("Successfully copy RobustaCoffeeBean!");
        return (RobustaCoffeeBean) super.clone();
    }
}


