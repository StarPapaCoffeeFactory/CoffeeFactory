package Settings.CoffeeFactory.personnel.staff;

import Settings.CoffeeFactory.areas.Area;
import Settings.CoffeeFactory.areas.StaffArea.StaffArea;
import Settings.CoffeeFactory.management.staff.WorkerController;
import Settings.CoffeeFactory.personnel.ChiefManager;
import Settings.CoffeeFactory.personnel.Personnel;

import java.util.ArrayList;

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
    private static Manager workShopManager;
    private static Manager warehouseManager;


    protected Manager(String name, int age, Personnel.Gender gender, String phnum ) {
        super(name, age, gender, phnum, 0.0);
        departmentList = new ArrayList<StaffArea>();

        diningRoomManager = null;
        officeManager = null;
        workShopManager = null;
        warehouseManager = null;
    }




    /**
     * 从总经理处获得任务
     */
    public void dispatchTask()
    {
        System.out.println(this.name + " get task.");
    }

    /**
     * 发怒
     */
    public void getangry()
    {
        System.out.println(this.name + " get angry. &%$*%&$**%$%*$");
    }

    /**
     * send feedback to the ChiefManager
     */
    private void reporttoChiefManager() {
        System.out.println(this.name + " report to the Chief manager.");
        ChiefManager.getInstance().getFeedBack();
    }

    /**
     * add a new department to the list.
     */
    public void addDepartment(StaffArea department) {
        this.departmentList.add(department);
    }

    /**
     * @return Manager
     */
    public static Manager getDiningRoomManager() {
        if (diningRoomManager == null) {
            diningRoomManager = new Manager("diningRoomManager", 29, Gender.female,"13922049976");
        }
        System.out.println("Our dining room manager is here.");
        return diningRoomManager;
    }

    public void getFeedBack() {
        System.out.println("Manager \""+this.name+"\" has gotten the feedback and solve it.");
    }

    /**
     * @return Manager
     */
    public static Manager getOfficeManager() {
        if (officeManager == null) {
            officeManager = new Manager("officeManager", 33, Gender.female, "18003434555");
        }
        System.out.println("Our office manager is here.");
        return officeManager;
    }

    public static Manager getWorkShopManager() {
        if (workShopManager == null) {
            workShopManager = new Manager("workShopManager", 30, Gender.male, "123456");
        }
        System.out.println("Here is our workshop manager.");
        return workShopManager;
    }

    /**
     * return the warehouse's manager which is single!!
     *
     * @return Manager
     */
    public static Manager getWarehouseManager() {
        if (warehouseManager == null) {
            warehouseManager = new Manager("warehouseManager", 28, Gender.male, "234567");
        }
        System.out.println("Here is our warehouse manager.");
        return warehouseManager;
    }





    @Override
    public String toString() {
        return "public class Manager extends Staff";
    }

    public void Goto(Area dest) {
        System.out.println("This manager cannot move area.");
    }

    public void SetVisitLimit()
    {

    }

    public void hireWorker(String name, Gender gender, int age, double salary, String phnum, StaffArea staffArea) {
        if (this.departmentList.contains(staffArea)) {
            WorkerController.addWorker(name, age, gender, phnum, salary, staffArea);
        }
        else {
            System.out.println("The manager does not match the staff area.");
        }
    }


}
