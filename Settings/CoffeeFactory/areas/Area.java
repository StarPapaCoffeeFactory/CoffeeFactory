package Settings.CoffeeFactory.areas;

import Settings.CoffeeFactory.personnel.staff.EmptyStaff;
import Settings.CoffeeFactory.personnel.staff.LogisticsAdministrator;
import Settings.CoffeeFactory.personnel.staff.Manager;
import Settings.CoffeeFactory.personnel.staff.Staff;

public abstract class Area {

    /*
    * 某个区域的位置
    **/
    protected String location;

    /*
    * 某个区域每年的花费
    **/
    protected double cost;

    protected double area;

    public Area(String location, double cost, double area) {
        this.location = location;
        this.cost = cost;
        this.area = area;
    }

    public Area() {
        this("Default Location", 10000, 100);
    }

    public Area(double cost) {
        this("Default Location", cost, 100);
    }

    @Override
    public abstract String toString();

    public String getLocation() {
        return this.location;
    }

    public double getCost() {
        return this.cost;
    }

    public void setCost(double newCost) {
        this.cost = newCost;
    }

    public double getArea() {
        return this.area;
    }

    public void setArea(double newArea) {
        this.area = newArea;
    }

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

    /**
     * Visitor Pattern: accept a utility worker to maintain the scene
     *
     * @param worker the utility worker
     *//*
    public abstract void accept(Visitor v);*/
}
