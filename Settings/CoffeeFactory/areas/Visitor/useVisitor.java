package Settings.CoffeeFactory.areas.Visitor;

import Settings.CoffeeFactory.areas.ManufacturingArea.Warehouse.Warehouse;
import Settings.CoffeeFactory.areas.ManufacturingArea.Workshop.Workshop;
import Settings.CoffeeFactory.areas.PublicArea.ExhibitionRoom;
import Settings.CoffeeFactory.areas.PublicArea.ExperienceRoom;
import Settings.CoffeeFactory.areas.StaffArea.DiningRoom;
import Settings.CoffeeFactory.areas.StaffArea.Office;

//使用Visitor设计模式，即产生Visitor的子类useVisitor
public class useVisitor {
    public void visit(Warehouse warehouse){
        System.out.println("using Visitor Pattern of Warehouse");
    }

    public void visit(Workshop workshop){
        System.out.println("using Visitor Pattern of Workshop");
    }

    public void visit(ExhibitionRoom exhibitionRoom){
        System.out.println("using Visitor Pattern of ExhibitionRoom");
    }

    public void visit(ExperienceRoom experienceRoom){
        System.out.println("using Visitor Pattern of ExperienceRoom");
    }

    public void visit(DiningRoom diningRoom){
        System.out.println("using Visitor Pattern of DiningRoom");
    }

    public void visit(Office office){
        System.out.println("using Visitor Pattern of Office");
    }

}
