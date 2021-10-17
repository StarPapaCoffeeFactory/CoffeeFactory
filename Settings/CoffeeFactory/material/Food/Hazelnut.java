package Settings.CoffeeFactory.material.Food;
import java.util.Calendar;

public class Hazelnut extends FoodInfo{
    /**
     * ctor of Hazelnut
     * This ctor sets state to SOLID.
     *
     * @param initialQuant         initial quantity
     * @param initialExpireTime initial time to expire
     */
    public Hazelnut(double initialQuant, Calendar initialExpireTime) {
        super(initialQuant, initialExpireTime, State.SOLID);
    }
    public Hazelnut() {
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
        System.out.println("Successfully copy Hazelnut!");
        return (Hazelnut) super.clone();
    }
}