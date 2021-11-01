package Settings.CoffeeFactory.areas;

import Settings.CoffeeFactory.areas.visitor.Visitor;
import Settings.CoffeeFactory.personnel.staff.EmptyStaff;
import Settings.CoffeeFactory.personnel.staff.LogisticsAdministrator;
import Settings.CoffeeFactory.personnel.staff.Manager;
import Settings.CoffeeFactory.personnel.staff.Staff;

/**
 * @description an abstract class of area,the base class of package areas
 * @author lc
 */
public abstract class Area {

    /**
     * @description the location of an area
     * @author lc
     */
    protected String location;

    /**
     * @description the cost of an area for one year
     * @author lc
     */
    protected double cost;

    /**
     * @description the floor area of an area
     * @author lc
     */
    protected double area;

    /**
     * @description ctor
     * @author lc
     */
    public Area(String location, double cost, double area) {
        this.location = location;
        this.cost = cost;
        this.area = area;
    }

    /**
     * @description ctor
     * @author lc
     */
    public Area() {
        this("Default Location", 10000, 100);
    }

    /**
     * @description ctor
     * @author lc
     */
    public Area(double cost) {
        this("Default Location", cost, 100);
    }

    @Override
    public abstract String toString();

    /**
     * @description get the location of an area
     * @author lc
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * @description get the cost of an area for one year
     * @author lc
     */
    public double getCost() {
        return this.cost;
    }

    /**
     * @description set a new cost of an area
     * @author lc
     */
    public void setCost(double newCost) {
        this.cost = newCost;
    }

    /**
     * @description get the floor area of an area
     * @author lc
     */
    public double getArea() {
        return this.area;
    }

    /**
     * @description set a new floor area of an area
     * @author lc
     */
    public void setArea(double newArea) {
        this.area = newArea;
    }

    /**
     * @description set a new location of an area
     * @author lc
     */
    public boolean relocate(Staff executor, String newLocation) {
        if (executor instanceof Manager || executor instanceof LogisticsAdministrator||executor instanceof EmptyStaff) {
        this.location = newLocation;
        return true;
        }
        else {
        System.out.println("Sorry, you have no authority to move the sites.");
        return false;
        }
    }

    /***
     * @param v
     * @author ZJX
     * @description The basic function of visitor design model
     */
    public abstract void accept(Visitor v);
}
