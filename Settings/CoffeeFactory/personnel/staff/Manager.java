package Settings.CoffeeFactory.personnel.staff;

import Settings.CoffeeFactory.areas.Area;
import Settings.CoffeeFactory.personnel.Personnel;
import Settings.CoffeeFactory.personnel.staff.Staff;

/**
 * @author CZQ
 * @project CoffeeFactory
 * @classname Manager
 * @description 经理
 * @DesignPattern
 * @date 2021/10/17
 */

public class Manager extends Staff{

    public String identity = "manager";

    private ArrayList<StaffArea> departmentList;

    private static Manager diningRoomManager;

    private static Manager officeManager;

    private static Manager warehouseManager;


    protected Manager(String name, int age, Personnel.Gender gender, String phnum ) {
        super(name, age, gender, phnum, 0.0);
        departmentList = new ArrayList<StaffArea>();

        diningRoomManager = null;
        officeManager = null;
        warehouseManager = null;
    }

    public void dispatchTask()
    {
        System.out.println(this.name + " get task.");
    }


    public void Goto(Area dest) {
        System.out.println("This manager cannot move area.");
    }

    public void SetVisitLimit()
    {

    }


}
