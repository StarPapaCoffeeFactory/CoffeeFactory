package Settings.CoffeeFactory.areas.PublicArea;

import Settings.CoffeeFactory.areas.AreaName;
import Settings.CoffeeFactory.areas.Visitor.Visitor;
import Settings.CoffeeFactory.supplement.handmadeTool.*;

/***
 * @author ZJX
 * @description This area provide some experience rooms
 */
public class ExperienceRoom extends PublicArea {

    private handmadeTool tool = handmadeToolFactory.getHandMadeTool();

    /**
     * number of this exp-room
     **/
    private int expRoomNumber;

    /**
     * constructor of ExperienceRoom
     */
    public ExperienceRoom(String location, double cost, double area, int maxNumber) {
        super(location, cost, area, maxNumber);
    }

    public ExperienceRoom() {
        super();
    }

    /**
     * @return the tool
     */
    public handmadeTool getTool() {
        return tool;
    }

    /**
     * Get description of tool in this room.
     *
     * @return description
     */
    public String getToolDescription() {
        return tool.getDescription();
    }

    /**
     * Set description of tool in this room. This is a part of COW pattern.
     *
     * @return description
     */
    public void setToolDescription(String description) {
        if (tool.getStock() > 1 || tool == handmadeToolFactory.getDefaultHandmadeTool()) {
            tool.deref();
            tool = new handmadeTool(tool);
        }
        tool.setDescription(description);
    }

    public int getExpRoomNumber() {
        return expRoomNumber;
    }

    public void setExpRoomNumber(int number) {
        expRoomNumber = number;
    }

    @Override
    public String toString() {
        return AreaName.COFFEE_EXPERIENCE_ROOM;}

    /***
     * @param v
     * @author ZJX
     * @description The basic function of visitor design model
     */
    public void accept(Visitor v) {
        v.visit(this);
    }
}
