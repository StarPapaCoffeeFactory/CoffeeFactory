package Settings.CoffeeFactory.personnel.staff.worker;

import Settings.CoffeeFactory.areas.Area;
import Settings.CoffeeFactory.areas.AreaName;
import Settings.CoffeeFactory.areas.staffarea.StaffArea;
import Settings.CoffeeFactory.personnel.Personnel;
import Settings.CoffeeFactory.personnel.staff.Staff;
import Settings.CoffeeFactory.personnel.visitlimit.LimitContext;
import Settings.CoffeeFactory.product.Product;
import Settings.CoffeeFactory.product.coffeebeverage.*;
import Settings.CoffeeFactory.product.originalcoffee.Arabica;
import Settings.CoffeeFactory.product.originalcoffee.Robusta;

import java.util.Objects;


/**
 * @author CZQ
 * @DesignPattern Null object
 * @date 2021/10/17
 */
public class Worker extends Staff{

    protected String state;
    protected String defaultarea;

    static private Product americano = new Americano(1);
    static private Product latte = new Latte(1);
    static private Product arabica = new Arabica();
    static private Product robusta = new Robusta();



    public Worker(String name, int age, Personnel.Gender gender, String phnum, double salary ) {

        super(name, age, gender ,phnum ,salary);
        this.identity = "Worker";
        state="rest";
        this.setVisitLimit();
    }

    public Worker(String name, int age, Personnel.Gender gender, String phnum, double salary, StaffArea area ) {

        super(name, age, gender, phnum, salary, area);
        this.identity = "Worker";
        state = "rest";
        this.setVisitLimit();

    }

    /**
     * @description set this state to work
     */
    public void work()
    {
        state="work";
        System.out.println("Worker "+this.name+" starts working.");
    }

    /**
     * @description set this state to rest
     */
    public void rest()
    {
        state="rest";
        System.out.println("Worker "+this.name+" starts resting.");
    }

    /**
     * @description print send feedback
     */
    public void feedBack()
    {
        System.out.println("Worker "+this.name+"feedback");
    }


    @Override
    public String toString() {
        return "public class Worker extends Staff";
    }

    /**
     * @param dest:go to dest area
     * @return void
     */
    public void Goto(Area dest) {
        if (this.canEnter(dest)) {
            this.location = dest;
            System.out.println(this.identity + " " + this.name + "has entered " + dest.toString());

        } else {
            System.out.println("sorry???" + this.identity + " " + this.name + "has no access permission and fail to enter" + dest.toString());
        }
    }

    /**
     * @description set VisitLimit
     */
    @Override
    public void setVisitLimit()
    {
        String[] persons = {this.identity};
        String[] publicAreas = {AreaName.PUBLIC_AREA , AreaName.EXHIBITION_AREA, AreaName.COFFEE_EXPERIENCE_ROOM ,
                AreaName.MANUFACTURING_AREA , AreaName.STAFF_AREA , AreaName.DINING_ROOM , AreaName.OFFICE};

        this.visitLimit = new LimitContext(persons, publicAreas);
    }

    /**
     * @description produce products
     */
    public static void produceAmericano()
    {
        americano.produce();
    }
    public static void produceLatte()
    {
        latte.produce();
    }
    public static void produceArabica()
    {
        arabica.produce();
    }
    public static void produceRobusta(){ robusta.produce(); }

    @Override
    public void display()
    {
        String gender_str;
        if(Objects.equals(gender.toString(), "male"))
            gender_str="male";
        else
            gender_str="female";

        System.out.printf("%-20s%-20s%-5s%-10s%s%n", this.name,this.gender,this.age, this.Id, (this.department == null ? "null" : this.department.toString()));
    }

}
