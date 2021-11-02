package Settings.CoffeeFactory.areas.manufacturingarea;

import Settings.CoffeeFactory.areas.staffarea.StaffArea;
import Settings.CoffeeFactory.personnel.staff.Manager;

/***
 * @author ZJX
 * @description manufacturing area abstract class
 * This class provides an abstract class for assembly line, warehouse and workshop
 *
 */
public abstract class ManufacturingArea extends StaffArea{
    public ManufacturingArea(){

    }

    public ManufacturingArea(String location, double cost, double area, Manager newManager) {
        super(location, cost, area, newManager);
    }
}
