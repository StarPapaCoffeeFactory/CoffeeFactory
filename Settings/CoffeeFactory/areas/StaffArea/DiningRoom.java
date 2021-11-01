package Settings.CoffeeFactory.areas.StaffArea;

import Settings.CoffeeFactory.areas.Visitor.Visitor;
import Settings.CoffeeFactory.personnel.ChiefManager;
import Settings.CoffeeFactory.personnel.staff.Manager;
import Settings.CoffeeFactory.areas.AreaName;

/**
 * @author lc
 * @description this area is dining room of staff area
 */
public class DiningRoom extends StaffArea {

    /**
     * @description ctor
     * @author lc
     */
    public DiningRoom() {
        this("Dining room", 10000, 100);
    }

    /**
     * @description ctor with not specified manager
     * @author lc
     */
    public DiningRoom(String location, double cost, double area) {
        super(location, cost, area, Manager.getDiningRoomManager());
        Manager.getDiningRoomManager().addDepartment(this);
        ChiefManager.getInstance().addManager(Manager.getDiningRoomManager());
    }

    /**
     * @return a string of area name
     * @author lc
     */
    @Override
    public String toString() {
        return AreaName.DINING_ROOM;
    }

    /**
     * @description maintain devices of dining room
     * @author lc
     */
    public void getDevicesMaintained() {
        System.out.println("The tables and cookers have been maintained.");
    }

    /**
     * Visitor Pattern
     *
     */
    public void accept(Visitor v) {
        v.visit(this);
    }

}
