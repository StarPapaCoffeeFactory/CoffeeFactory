package Settings.CoffeeFactory.personnel.staff;

import Settings.CoffeeFactory.areas.Area;


/**
 * @author CZQ
 * @DesignPattern Null object
 */
public class EmptyStaff extends Staff {

    public EmptyStaff() {
        super(null, -1, null, "-1", -1);
    }


    @Override
    public String toString() {
        return "public class EmptyStaff extends Staff";
    }

    public void Goto(Area dest) {
        System.out.println("EmptyStaff cannot move area.");
    }

    public void setVisitLimit()
    {

    }

    /**
     * @description no staff found
     */
    @Override
    public void display() {
        System.out.println("THIS IS AN EMPTY STAFF!");
    }

}
