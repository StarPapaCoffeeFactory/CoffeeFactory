package Settings.CoffeeFactory.material.food;
import Settings.CoffeeFactory.material.Material;
import java.util.Calendar;
import java.util.LinkedList;

public abstract class FoodInfo extends Material implements Cloneable{
    enum State {
        POWDER, SOLID, LIQUID
    }
    private Calendar ExpirationTime;
    protected State state;
    private LinkedList<Object> expirationObseverList;

    protected FoodInfo(double initialQuant, Calendar initialExpireTime, State state) {
        super(initialQuant);
        ExpirationTime = initialExpireTime;
        this.state = state;
    }
    protected FoodInfo(State state) {
        this(1, Calendar.getInstance(), state);
    }

    public Calendar timeToExpire() {
        return ExpirationTime;
    }
    public boolean isExpired(Calendar now) {
        if(now.YEAR<ExpirationTime.YEAR) return false;
        else if(now.YEAR>ExpirationTime.YEAR) return true;
        else if(ExpirationTime.DAY_OF_YEAR-now.DAY_OF_YEAR <= 0) return false;
        else return true;
    }
    public boolean addNearExpirationReminder(Object observer) {
        return expirationObseverList.add(observer);
    }
    public boolean use(double useQuant) {
        if (super.getInventory() < useQuant) {
            return false;
        }
        return process();
    }
    protected boolean melt() {
        if (state != State.SOLID) {
            return false;
        }
        state = State.LIQUID;
        return true;
    }
    protected boolean grind() {
        if (state != State.SOLID) {
            return false;
        }
        state = State.POWDER;
        return true;
    }
    /**
     * process steps of material
     * The function is called by use().
     * This is a part of the "strategy" pattern.
     *
     * @return true if it can be processed
     */
    public abstract boolean process();


    protected void notificationOnExpiration() {
        /*
         * TODO: notifyOnExpiration()
         *
         * This is a part of the "observer" pattern.
         *
         * Hint: expirationObseverList is the list holding all the observers that should
         * be notified here.
         */
    }

}





