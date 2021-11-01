package Settings.CoffeeFactory.personnel.staff;

import Settings.CoffeeFactory.areas.Area;
import Settings.CoffeeFactory.areas.staffarea.StaffArea;
import Settings.CoffeeFactory.management.staff.WorkerController;
import Settings.CoffeeFactory.personnel.ChiefManager;
import Settings.CoffeeFactory.personnel.Personnel;
import Settings.CoffeeFactory.personnel.staff.worker.worker;

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
        System.out.println(this.name + " get task and will distribute it to the workers.");
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
    public void reporttoChiefManager() {
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
//        System.out.println("Our dining room manager is here.");
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
//        System.out.println("Our office manager is here.");
        return officeManager;
    }
    /**
     * @return Manager
     */
    public static Manager getWorkShopManager() {
        if (workShopManager == null) {
            workShopManager = new Manager("workShopManager", 30, Gender.male, "123456");
        }
//        System.out.println("Here is our workshop manager.");
        return workShopManager;
    }

    /**
     * @return Manager
     */
    public static Manager getWarehouseManager() {
        if (warehouseManager == null) {
            warehouseManager = new Manager("warehouseManager", 28, Gender.male, "234567");
        }
//        System.out.println("Here is our warehouse manager.");
        return warehouseManager;
    }





    @Override
    public String toString() {
        return "public class Manager extends Staff";
    }

    /**
     * @param dest:go to dest area
     * @return
     */
    public void Goto(Area dest) {
        System.out.println("This manager cannot move area.");
    }

    public void setVisitLimit()
    {

    }

    /**
     * hire a worker!
     * @param _worker:the worker to be hired
     * @param phnum:the worker's phnum
     * @param staffArea:the worker's staffArea
     * @return
     */
    public void hireWorker(worker _worker, String phnum, StaffArea staffArea) {
        String name=_worker.getName();
        Gender gender=_worker.getGender();
        int age=_worker.getAge();
        double salary=_worker.salary;
        if (this.departmentList.contains(staffArea)) {
            WorkerController.addWorker(name, age, gender, phnum, salary, staffArea);
        }
        else {
            System.out.println("The manager does not match the staff area.");
        }
    }
    /**
     * hire a worker!(overload)
     * @param name:the worker's name
     * @param gender:the worker's gender
     * @param age:the worker's age
     * @param salary:the worker's salary
     * @param phnum:the worker's phnum
     * @param staffArea:the worker's staffArea
     * @return
     */
    public void hireWorker(String name, Gender gender, int age, double salary, String phnum, StaffArea staffArea) {
        if (this.departmentList.contains(staffArea)) {
            WorkerController.addWorker(name, age, gender, phnum, salary, staffArea);
        }
        else {
            System.out.println("The manager does not match the staff area.");
        }
    }


}
