package Settings.CoffeeFactory.areas.StaffArea;

import Settings.CoffeeFactory.areas.Area;
import Settings.CoffeeFactory.areas.Visitor.Visitor;
import Settings.CoffeeFactory.areas.WorkerIterator.Aggregate;
import Settings.CoffeeFactory.areas.WorkerIterator.Iterator;
import Settings.CoffeeFactory.areas.WorkerIterator.WorkerListIterator;
import Settings.CoffeeFactory.personnel.staff.EmptyStaff;
import Settings.CoffeeFactory.personnel.staff.Manager;
import Settings.CoffeeFactory.personnel.ChiefManager;
import Settings.CoffeeFactory.personnel.staff.Staff;

import java.util.ArrayList;

public abstract class StaffArea extends Area implements Aggregate {

    /**
     * 区域经理
     **/
    protected Manager manager;

    /**
     * 区域员工列表
     **/
    protected ArrayList<Staff> workerList = null;


    public StaffArea() {
        super();
        workerList = new ArrayList<Staff>();
    }

    /**
     * 指定经理的构造函数
     */
    public StaffArea(String location, double cost, double area, Manager newManager) {
        super(location, cost, area);
        workerList = new ArrayList<Staff>();
        manager = newManager;
        ChiefManager.getInstance().addManager(manager);
    }

    /**
     * 获取本区域的经理
     */
    public Manager getManager() {
        return manager;
    }

    /**
     * 设置本区域的新经理
     */
    public void setManager(Manager newManager) {
        manager = newManager;
    }

    /**
     * 在工人列表中添加一个新员工
     */
    public void addWorker(Staff workerObj) {
        if (!workerList.contains(workerObj)) {
            workerList.add(workerObj);
        } else {
            System.out.println("The worker is in the area");
        }
    }

    /**
     * 删除该区域的单个员工（如果要删除的员工在该区域）
     */
    public void removeWorker(Staff workerObj) {
        if (workerList.contains(workerObj)) {
            workerList.remove(workerObj);
        } else {
            System.out.println("Worker object doesn't exist.");
        }
    }

    /**
     * 从工厂中查找并删除某个员工
     */
    public void removeWorker(String name) {
        workerList.removeIf(worker -> worker.getName().equals(name));
        System.out.println("Worker object doesn't exist.");
    }

    /**
     * 获取本区域的员工列表
     */
    public ArrayList<Staff> getWorkerList() {
        return workerList;
    }

    /**
     * 展示本区域的所有员工
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
     * 通过id查找和展示员工信息
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
     * @return 一个复制WorkerList的迭代器
     */
    @Override
    public WorkerListIterator getIterator() {
        return new WorkerListIterator(workerList);
    }

    /**
     * Visitor Pattern
     */
    public abstract void accept(Visitor v);
}
