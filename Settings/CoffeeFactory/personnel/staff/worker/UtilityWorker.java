package Settings.CoffeeFactory.personnel.staff.worker;

import Settings.CoffeeFactory.personnel.Personnel;

/**
 * @author CZQ
 * @project CoffeeFactory
 * @classname ${}
 * @description
 * @DesignPattern
 * @date 2021/10/17
 */

public class UtilityWorker extends Worker {



    public UtilityWorker(String name, int age, Personnel.Gender gender, String phnum, double salary ) {
        /*
         *
         * @param name
         * @param age
         * @param gender
         * @param phnum
         * @param salary
         * @return
         * @author YXJ
         * @description
         * @date 2021/10/25 21:31
         */

        super(name, age, gender ,phnum ,salary);
    }

    /*public void visit(Area area)
    {
        String loc=area.getLocation();
        System.out.println("UtilityWorker "+this.name+" visits "+loc);
    }*/

    /**
     * set this state to work
     */
    @Override
    public void work()
    {
        state="work";
        System.out.println("UtilityWorker "+this.name+" starts working.");
    }

    /**
     * set this state to rest
     */
    @Override
    public void rest()
    {
        state="rest";
        System.out.println("UtilityWorker "+this.name+" starts resting.");
    }

    /**
     * print get feedback
     */
    @Override
    public void feedBack()
    {
        System.out.println("UtilityWorker "+this.name+" gets feedback");
    }

    @Override
    public String toString() {
        return "public class UtilityWorker extends Worker";
    }


}
