package Settings.CoffeeFactory.areas.ManufacturingArea;

import Settings.CoffeeFactory.areas.Area;
import Settings.CoffeeFactory.areas.StaffArea.StaffArea;
import Settings.CoffeeFactory.personnel.staff.Manager;

public abstract class ManufacturingArea extends StaffArea{

    public ManufacturingArea(String location, double cost, double area, Manager newManager) {
        super(location, cost, area, newManager);
    }
}
