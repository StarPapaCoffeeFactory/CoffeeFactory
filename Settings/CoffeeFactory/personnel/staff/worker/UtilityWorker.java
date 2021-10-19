package Settings.CoffeeFactory.personnel.staff.worker;

import Settings.CoffeeFactory.areas.Area;
import Settings.CoffeeFactory.areas.StaffArea.StaffArea;
import Settings.CoffeeFactory.personnel.Personnel;
import Settings.CoffeeFactory.personnel.staff.worker.worker;
/**
 * @author CZQ
 * @project CoffeeFactory
 * @classname ${}
 * @description
 * @DesignPattern
 * @date 2021/10/17
 */

public class UtilityWorker extends worker{

    protected UtilityWorker(String name, int age, Personnel.Gender gender, String phnum, double salary ) {
        super(name, age, gender ,phnum ,salary);
    }

    public void visit(Area area)
    {
        String loc=area.getLocation();
        System.out.println("UtilityWorker "+this.name+" visits "+loc);
    }

    @Override
    public void work()
    {
        state="work";
        System.out.println("UtilityWorker "+this.name+" starts working.");
    }

    @Override
    public void rest()
    {
        state="rest";
        System.out.println("UtilityWorker "+this.name+" starts resting.");
    }

    @Override
    public void feedBack()
    {
        System.out.println("UtilityWorker "+this.name+" gets feedback");
    }

    @Override
    public String toString() {
        return "public class UtilityWorker extends worker";
    }


}
