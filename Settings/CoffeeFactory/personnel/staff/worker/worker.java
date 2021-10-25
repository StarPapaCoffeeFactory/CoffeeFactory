package Settings.CoffeeFactory.personnel.staff.worker;

import Settings.CoffeeFactory.areas.Area;
import Settings.CoffeeFactory.areas.AreaName;
import Settings.CoffeeFactory.areas.StaffArea.StaffArea;
import Settings.CoffeeFactory.personnel.Personnel;
import Settings.CoffeeFactory.personnel.staff.Staff;
import Settings.CoffeeFactory.personnel.visitlimit.LimitContext;
import Settings.CoffeeFactory.product.Product;
import Settings.CoffeeFactory.product.coffeebeverage.*;
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

    static private Product americano,caramelMacchiato,hazelnutLatte,latte,mocha,arabica,autumnBlend,houseBlend;

    public worker(String name, int age, Personnel.Gender gender, String phnum,double salary ) {

        super(name, age, gender ,phnum ,salary);
        this.identity = "worker";
        state="rest";
        this.SetVisitLimit();
    }

    public worker(String name, int age, Personnel.Gender gender, String phnum,double salary, StaffArea area ) {

        super(name, age, gender, phnum, salary, area);
        this.identity = "worker";
        state = "rest";
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
        if (this.canEnter(dest)) {
            this.location = dest;
            System.out.println(this.identity + " " + this.name + "has entered " + dest.toString());

        } else {
            System.out.println("sorry，" + this.identity + " " + this.name + "has no access permission and fail to enter" + dest.toString());
        }
    }

    public void SetVisitLimit()
    {
        String[] persons = {this.identity};
        String[] publicAreas = {AreaName.PUBLIC_AREA , AreaName.EXHIBITION_AREA, AreaName.COFFEE_EXPERIENCE_ROOM ,
                AreaName.MANUFACTURING_AREA , AreaName.STAFF_AREA , AreaName.DINING_ROOM , AreaName.OFFICE};

        this.visitLimit = new LimitContext(persons, publicAreas);
    }

    public static void produceAmericano()
    {
        americano.produce();
    }
    public static void produceArabica()
    {
        arabica.produce();
    }
    public static void produceAutumnBlend()
    {
        autumnBlend.produce();
    }
    public static void produceHouseBlend()
    {
        houseBlend.produce();
    }



}
