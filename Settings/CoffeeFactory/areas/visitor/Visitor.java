package Settings.CoffeeFactory.areas.visitor;

import Settings.CoffeeFactory.areas.manufacturingarea.warehouse.Warehouse;
import Settings.CoffeeFactory.areas.manufacturingarea.workshop.CoffeeProductWorkshop;
import Settings.CoffeeFactory.areas.manufacturingarea.workshop.CoffeeWorkshop;
import Settings.CoffeeFactory.areas.publicarea.ExhibitionRoom;
import Settings.CoffeeFactory.areas.publicarea.ExperienceRoom;
import Settings.CoffeeFactory.areas.staffarea.DiningRoom;
import Settings.CoffeeFactory.areas.staffarea.Office;

/***
 * @author ZJX
 * @description The basic class of visitor design mode
 */
public interface Visitor {
    /***
     * @param warehouse
     * @return void
     * @author ZJX
     * @description The visit function of warehouse
     */
    void visit(Warehouse warehouse);

    /***
     * @param coffeeWorkshop
     * @return void
     * @author ZJX
     * @description The visit function of coffeeWorkshop
     */
    void visit(CoffeeWorkshop coffeeWorkshop);

    /***
     * @param coffeeProductWorkshop
     * @return void
     * @author ZJX
     * @description The visit function of coffeeProductWorkshop
     */
    void visit(CoffeeProductWorkshop coffeeProductWorkshop);

    /***
     * @param exhibitionRoom
     * @return void
     * @author ZJX
     * @description The visit function of exhibitionRoom
     */
    void visit(ExhibitionRoom exhibitionRoom);

    /***
     * @param experienceRoom
     * @return void
     * @author ZJX
     * @description The visit function of experienceRoom
     */
    void visit(ExperienceRoom experienceRoom);

    /***
     * @param diningRoom
     * @return void
     * @author ZJX
     * @description The visit function of diningRoom
     */
    void visit(DiningRoom diningRoom);

    /***
     * @param office
     * @return void
     * @author ZJX
     * @description The visit function of office
     */
    void visit(Office office);
}
