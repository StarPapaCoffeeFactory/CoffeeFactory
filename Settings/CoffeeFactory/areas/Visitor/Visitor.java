package Settings.CoffeeFactory.areas.Visitor;

import Settings.CoffeeFactory.areas.ManufacturingArea.Warehouse.Warehouse;
import Settings.CoffeeFactory.areas.ManufacturingArea.Workshop.Workshop;
import Settings.CoffeeFactory.areas.PublicArea.ExhibitionRoom;
import Settings.CoffeeFactory.areas.PublicArea.ExperienceRoom;
import Settings.CoffeeFactory.areas.StaffArea.DiningRoom;
import Settings.CoffeeFactory.areas.StaffArea.Office;

public abstract class Visitor {
    public abstract void visit(Warehouse warehouse);
    public abstract void visit(Workshop workshop);
    public abstract void visit(ExhibitionRoom exhibitionRoom);
    public abstract void visit(ExperienceRoom experienceRoom);
    public abstract void visit(DiningRoom diningRoom);
    public abstract void visit(Office office);
}
