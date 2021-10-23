package Settings.CoffeeFactory.areas.StaffArea;

import Settings.CoffeeFactory.areas.Visitor.Visitor;
import Settings.CoffeeFactory.personnel.ChiefManager;
import Settings.CoffeeFactory.personnel.staff.Manager;
import Settings.CoffeeFactory.areas.AreaName;

public class DiningRoom extends StaffArea {


    public DiningRoom() {
        this("Dining room", 10000, 100);
    }

    /**
     * 没指定经理的构造函数
     */
    public DiningRoom(String location, double cost, double area) {
        super(location, cost, area, Manager.getDiningRoomManager());
        Manager.getDiningRoomManager().addDepartment(this);
        ChiefManager.getInstance().addManager(Manager.getDiningRoomManager());
    }

    /**
     * @return 区域名字符串
     */
    @Override
    public String toString() {
        return AreaName.DINING_ROOM;
    }

    /**
     * 维护餐厅设备
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
