package Settings.CoffeeFactory.personnel.staff.worker;

import Settings.CoffeeFactory.areas.Area;
import Settings.CoffeeFactory.areas.StaffArea.StaffArea;
import Settings.CoffeeFactory.personnel.Personnel;
import Settings.CoffeeFactory.personnel.staff.Staff;
import Settings.CoffeeFactory.personnel.visitlimit.LimitContext;

/**
 * @author CZQ
 * @project CoffeeFactory
 * @classname worker
 * @description 员工
 * @DesignPattern Visitor//partly
 * @date 2021/10/17
 */

public class worker extends Staff{

    protected String state;
    protected String defaultarea;

    public worker(String name, int age, Personnel.Gender gender, String phnum,double salary ) {
        super(name, age, gender ,phnum ,salary);
        state="rest";
    }

    public worker(String name, int age, Personnel.Gender gender, String phnum,double salary, StaffArea area ) {
        super(name, age, gender, phnum, salary, area);
    }

    public void work()
    {
        state="work";
        System.out.println("Worker "+this.name+" starts working.");
    }

    public void rest()
    {
        state="rest";
        System.out.println("Worker "+this.name+" starts resting.");
    }

    public void feedBack()
    {
        System.out.println("Worker "+this.name+" gets feedback");
    }


    @Override
    public String toString() {
        return "public class worker extends Staff";
    }

    public void Goto(Area dest) {
        System.out.println("This worker cannot move area.");
    }

    public void SetVisitLimit()
    {
        String[] persons = {this.identity};
        String[] publicAreas = {"publicArea", "experienceRoom", "exhibitionRoom" ,
                "manufacturingArea" , "staffArea" , "diningRoom" , "office"};
        this.visitLimit = new LimitContext(persons, publicAreas);
    }

}
