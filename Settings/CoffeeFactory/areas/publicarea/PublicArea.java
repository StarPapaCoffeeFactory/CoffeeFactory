package Settings.CoffeeFactory.areas.publicarea;

import Settings.CoffeeFactory.areas.Area;
import Settings.CoffeeFactory.personnel.visitor.Visitor;

import java.util.LinkedList;

/***
 * @author ZJX
 * @description An abstract class of public area
 */
public abstract class PublicArea extends Area {

    /***
     * @author ZJX
     * @description Maximum visitors
     */
    protected int maxVisitorNumber;

    /***
     * @author ZJX
     * @description List of visitors
     */
    protected LinkedList<Visitor> visitorList;

    public PublicArea(String location, double cost, double area, int maxNumber) {
        super(location, cost, area);
        this.maxVisitorNumber = maxNumber;
        this.visitorList = new LinkedList<Visitor>();
    }

    public PublicArea() {
        this("Public Location", 10000, 100, 200);
    }

    /**
     * @return name of the scene as a String
     */
    @Override
    public abstract String toString();

    /**
     * @description when a visitor enters the area, add him to the list
     * @param visitorObj visitor object
     */
    public void addVisitor(Visitor visitorObj) {
        if (visitorList.size() >= maxVisitorNumber) {
            System.out.println("The area is already full");
        } else if (visitorList.contains(visitorObj)) {
            System.out.println("The area is already in the area");
        } else {
            visitorList.add(visitorObj);
        }
    }

    /**
     * @description when a visitor leaves the area, remove him from the list
     * @param visitorObj visitor object
     */
    public void removeVisitor(Visitor visitorObj) {
        if (visitorList.contains(visitorObj)) {
            visitorList.remove(visitorObj);
        } else {
            System.out.println("The area is not in the area");
        }
    }

    /**
     * @description check whether a visitor object is in the list
     * @param visitorObj visitor object
     * @return true if the visitor is in
     */
    public boolean checkVisitor(Visitor visitorObj) {
        return visitorList.contains(visitorObj);
    }

    /**
     * @return true if the area is full
     */
    public boolean isFull() {
        return visitorList.size() >= maxVisitorNumber;
    }

    /**
     * @description maintain exhibits
     */
    public void getExhibitsMaintained() {
        System.out.println("The exhibits have been maintained.");
    }

    /***
     * @param v
     * @author ZJX
     * @description The basic function of visitor design model
     */
    public abstract void accept(Settings.CoffeeFactory.areas.visitors.Visitor v);
}
