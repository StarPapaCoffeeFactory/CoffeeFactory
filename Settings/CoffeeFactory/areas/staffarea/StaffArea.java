package Settings.CoffeeFactory.areas.staffarea;

import Settings.CoffeeFactory.areas.Area;
import Settings.CoffeeFactory.areas.visitors.Visitor;
import Settings.CoffeeFactory.areas.workeriterator.Aggregate;
import Settings.CoffeeFactory.areas.workeriterator.WorkerListIterator;
import Settings.CoffeeFactory.personnel.staff.EmptyStaff;
import Settings.CoffeeFactory.personnel.staff.Manager;
import Settings.CoffeeFactory.personnel.ChiefManager;
import Settings.CoffeeFactory.personnel.staff.Staff;

import java.util.ArrayList;

/**
 * @author lc
 * @description An abstract class of staff area
 */
public abstract class StaffArea extends Area implements Aggregate {

    /**
     * @description area manager
     * @author lc
     */
    protected Manager manager;

    /**
     * @description a Worker list of the area
     * @author lc
     **/
    protected ArrayList<Staff> workerList = null;

    public StaffArea() {
        super();
        workerList = new ArrayList<Staff>();
    }

    /**
     * @param location
     * @param cost
     * @param area
     * @param newManager
     * @description a constructor with an assigned manager
     * @author lc
     */
    public StaffArea(String location, double cost, double area, Manager newManager) {
        super(location, cost, area);
        workerList = new ArrayList<Staff>();
        manager = newManager;
        ChiefManager.getInstance().addManager(manager);
    }

    /**
     * @description get the manager of the area
     * @author lc
     */
    public Manager getManager() {
        return manager;
    }

    /**
     * @description set a new manager of this area
     * @author lc
     */
    public void setManager(Manager newManager) {
        manager = newManager;
    }

    /**
     * @description add a new staff to workerList
     * @author lc
     */
    public void addWorker(Staff workerObj) {
        if (!workerList.contains(workerObj)) {
            workerList.add(workerObj);
        } else {
            System.out.println("The Worker is in the area");
        }
    }

    /**
     * @description remove a staff from this area,if the staff belongs to the area
     * @author lc
     */
    public void removeWorker(Staff workerObj) {
        if (workerList.contains(workerObj)) {
            workerList.remove(workerObj);
        } else {
            System.out.println("Worker object doesn't exist.");
        }
    }

    /**
     * @description search and remove a staff by name in the factory
     * @author lc
     */
    public void removeWorker(String name) {
        workerList.removeIf(worker -> worker.getName().equals(name));
        System.out.println("Worker object doesn't exist.");
    }

    /**
     * @description get the workerList of the area
     * @author lc
     */
    public ArrayList<Staff> getWorkerList() {
        return workerList;
    }

    /**
     * @description show all staffs from the area
     * @author lc
     */
    public void displayAllStaffs() {
        System.out.printf("%-20s%-20s%-5s%-10s%s%n", "Name", "Gender", "Age", "Id", "Department");
        if(manager != null) manager.display();
        else {
            Manager.getWorkShopManager().display();
        }
        for (Staff obj : workerList) {
            obj.display();
        }
    }

    /**
     * @description search and show Worker information by id
     * @author lc
     */
    public void searchStaffById(String id) {
        if (manager.getId().equals(id)) {
            manager.display();
            return;
        }
        for (Staff obj : workerList) {
            if (obj.getId().equals(id)) {
                obj.display();
                return;
            }
        }
        (new EmptyStaff()).display();
    }

    /**
     * @return a iterator copies workerList
     * @author lc
     */
    @Override
    public WorkerListIterator getIterator() {
        return new WorkerListIterator(workerList);
    }

    /***
     * @param v
     * @author ZJX
     * @description The basic function of visitor design model
     */
    public abstract void accept(Visitor v);
}
