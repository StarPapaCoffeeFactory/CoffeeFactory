package Settings.CoffeeFactory.areas.Visitor;

import Settings.CoffeeFactory.areas.ManufacturingArea.Warehouse.Warehouse;
import Settings.CoffeeFactory.areas.ManufacturingArea.Workshop.CoffeeProductWorkshop;
import Settings.CoffeeFactory.areas.ManufacturingArea.Workshop.CoffeeWorkshop;
import Settings.CoffeeFactory.areas.ManufacturingArea.Workshop.Workshop;
import Settings.CoffeeFactory.areas.PublicArea.ExhibitionRoom;
import Settings.CoffeeFactory.areas.PublicArea.ExperienceRoom;
import Settings.CoffeeFactory.areas.StaffArea.DiningRoom;
import Settings.CoffeeFactory.areas.StaffArea.Office;

/***
 * @author ZJX
 * @description The basic class of visitor design mode
 */
public abstract class Visitor {
    /***
     * @param warehouse
     * @return void
     * @author ZJX
     * @description The visit function of warehouse
     */
    public abstract void visit(Warehouse warehouse);

    /***
     * @param coffeeWorkshop
     * @return void
     * @author ZJX
     * @description The visit function of coffeeWorkshop
     */
    public abstract void visit(CoffeeWorkshop coffeeWorkshop);

    /***
     * @param coffeeProductWorkshop
     * @return void
     * @author ZJX
     * @description The visit function of coffeeProductWorkshop
     */
    public abstract void visit(CoffeeProductWorkshop coffeeProductWorkshop);

    /***
     * @param exhibitionRoom
     * @return void
     * @author ZJX
     * @description The visit function of exhibitionRoom
     */
    public abstract void visit(ExhibitionRoom exhibitionRoom);

    /***
     * @param experienceRoom
     * @return void
     * @author ZJX
     * @description The visit function of experienceRoom
     */
    public abstract void visit(ExperienceRoom experienceRoom);

    /***
     * @param diningRoom
     * @return void
     * @author ZJX
     * @description The visit function of diningRoom
     */
    public abstract void visit(DiningRoom diningRoom);

    /***
     * @param office
     * @return void
     * @author ZJX
     * @description The visit function of office
     */
    public abstract void visit(Office office);
}
