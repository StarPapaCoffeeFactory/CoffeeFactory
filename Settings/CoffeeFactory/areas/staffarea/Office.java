package Settings.CoffeeFactory.areas.staffarea;

import Settings.CoffeeFactory.areas.visitor.Visitor;
import Settings.CoffeeFactory.personnel.ChiefManager;
import Settings.CoffeeFactory.personnel.staff.Manager;
import Settings.CoffeeFactory.areas.AreaName;

/**
 * @author lc
 * @description this area is office of staff area
 */
public class Office extends StaffArea {

    /**
     * @description ctor
     * @author lc
     */
    public Office() {
        this("Default Office", 100, 100);
    }

    /**
     * @description ctor with not specified manager
     * @author lc
     */
    public Office(String location, double cost, double area) {
        super(location, cost, area, Manager.getOfficeManager());
        Manager.getOfficeManager().addDepartment(this);
        ChiefManager.getInstance().addManager(Manager.getOfficeManager());
    }

    /**
     * @return string of area name
     * @author lc
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
