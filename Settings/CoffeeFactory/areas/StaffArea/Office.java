package Settings.CoffeeFactory.areas.StaffArea;

import Settings.CoffeeFactory.areas.Visitor.Visitor;
import Settings.CoffeeFactory.personnel.ChiefManager;
import Settings.CoffeeFactory.personnel.staff.Manager;
import Settings.CoffeeFactory.areas.AreaName;

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
     * Visitor Pattern
     *
     */
    public void accept(Visitor v) {
        v.visit(this);
    }
}
