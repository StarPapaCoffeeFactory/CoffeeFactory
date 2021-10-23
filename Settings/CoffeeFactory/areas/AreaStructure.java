package Settings.CoffeeFactory.areas;

import Settings.CoffeeFactory.personnel.staff.worker.UtilityWorker;

import java.util.ArrayList;
import java.util.List;

public class AreaStructure {
    /**
     * all areas in the factory
     */
    private List<Area> areas;

    /**
     * constructor of the class AreaStructure
     */
    public AreaStructure() {
        areas = new ArrayList<Area>();
    }

    /**
     * Add a area to the collection list
     *
     * @param s new area object
     */
    public void addArea(Area s) {
        areas.add(s);
    }

    /**
     * get a area object from the scene list by its name
     *
     * @param name name of the area to be found
     * @return object of the area found (return null if not found)
     */
    public Area getAreaByName(String name) {
        for (Area item : areas) {
            if (item.toString().equals(name)) {
                return item;
            }
        }
        return null;
    }

    /**
     * worker maintains all scenes in the list
     *
     */
    /*public void accept(Visitor v) {
        for (Object obj : areas) {
            ((Area) obj).accept(v);
        }
    }*/
}
