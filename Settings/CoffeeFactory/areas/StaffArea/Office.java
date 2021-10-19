package Settings.CoffeeFactory.areas.StaffArea;

import Settings.CoffeeFactory.personnel.ChiefManager;
import Settings.CoffeeFactory.personnel.staff.Manager;
import Settings.CoffeeFactory.areas.AreaName;
import Settings.CoffeeFactory.personnel.staff.worker.UtilityWorker;

public class Office extends StaffArea {


    public Office() {
        this("Default Office", 100, 100);
    }

    /**
     * 没指定经理的构造函数
     */
    public Office(String location, double cost, double area) {
        super(location, cost, area, Manager.getOfficeManager());
        Manager.getOfficeManager().addDepartment(this);
        ChiefManager.getInstance().addManager(Manager.getOfficeManager());
    }

    /**
     * @return 区域名字字符串
     */
    @Override
    public String toString() {
        return AreaName.OFFICE;
    }

    /**
     * Visitor Pattern: accept a utility worker to maintenance the scene
     *
     * @param worker the utility worker
     */
    @Override
    public void accept(UtilityWorker worker) {
        worker.visit(this);
    }
}
