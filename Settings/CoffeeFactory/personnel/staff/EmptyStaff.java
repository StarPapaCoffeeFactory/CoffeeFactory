package Settings.CoffeeFactory.personnel.staff;

import Settings.CoffeeFactory.areas.Area;
import Settings.CoffeeFactory.areas.StaffArea.StaffArea;
import Settings.CoffeeFactory.personnel.Personnel;
import Settings.CoffeeFactory.personnel.staff.Staff;

import java.util.ArrayList;

/**
 * @author CZQ
 * @project CoffeeFactory
 * @classname EmptyStaff
 * @description
 * @DesignPattern Null object
 * @date 2021/10/17
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

    public void SetVisitLimit()
    {

    }

    /**
     * no staff found
     */
    @Override
    public void display() {
        System.out.println("THIS IS AN EMPTY STAFF!");
    }

}
