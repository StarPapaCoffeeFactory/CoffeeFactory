package Settings.CoffeeFactory.areas.visitors;

import Settings.CoffeeFactory.areas.manufacturingarea.Warehouse.Warehouse;
import Settings.CoffeeFactory.areas.manufacturingarea.Workshop.CoffeeProductWorkshop;
import Settings.CoffeeFactory.areas.manufacturingarea.Workshop.CoffeeWorkshop;
import Settings.CoffeeFactory.areas.publicarea.ExhibitionRoom;
import Settings.CoffeeFactory.areas.publicarea.ExperienceRoom;
import Settings.CoffeeFactory.areas.staffarea.DiningRoom;
import Settings.CoffeeFactory.areas.staffarea.Office;

/***
 * @author ZJX
 * @description Use the visitors design pattern, which produces a subclass of visitors, useVisitor
 */
public class useVisitor implements Visitor{

    /***
     * @param warehouse
     * @return void
     * @author ZJX
     * @description The concrete implementation of the visit function of Warehouse
     */
    public void visit(Warehouse warehouse){
        System.out.println("using visitors Pattern of Warehouse");
    }

    /***
     * @param coffeeWorkshop
     * @return void
     * @author ZJX
     * @description The concrete implementation of the visit function of coffeeWorkshop
     */
    public void visit(CoffeeWorkshop coffeeWorkshop){
        System.out.println("using visitors Pattern of CoffeeWorkshop");
    }

    /***
     * @param coffeeProductWorkshop
     * @return void
     * @author ZJX
     * @description The concrete implementation of the visit function of coffeeProductWorkshop
     */
    public void visit(CoffeeProductWorkshop coffeeProductWorkshop){
        System.out.println("using visitors Pattern of CoffeeProductWorkshop");
    }

    /***
     * @param exhibitionRoom
     * @return void
     * @author ZJX
     * @description The concrete implementation of the visit function of exhibitionRoom
     */
    public void visit(ExhibitionRoom exhibitionRoom){
        System.out.println("using visitors Pattern of ExhibitionRoom");
    }

    /***
     * @param experienceRoom
     * @return void
     * @author ZJX
     * @description The concrete implementation of the visit function of experienceRoom
     */
    public void visit(ExperienceRoom experienceRoom){
        System.out.println("using visitors Pattern of ExperienceRoom");
    }

    /***
     * @param diningRoom
     * @return void
     * @author ZJX
     * @description The concrete implementation of the visit function of diningRoom
     */
    public void visit(DiningRoom diningRoom){
        System.out.println("using visitors Pattern of DiningRoom");
    }

    /***
     * @param office
     * @return void
     * @author ZJX
     * @description The concrete implementation of the visit function of office
     */
    public void visit(Office office){
        System.out.println("using visitors Pattern of Office");
    }

}
