package Settings.CoffeeFactory.machine;

import Settings.CoffeeFactory.personnel.Personnel;
import Settings.CoffeeFactory.personnel.staff.Maintainer.FreshmanMaintainer;
import Settings.CoffeeFactory.personnel.staff.Maintainer.InternshipMaintainer;
import Settings.CoffeeFactory.personnel.staff.Maintainer.SeasonedMaintainer;
import Settings.CoffeeFactory.personnel.staff.Maintainer.SkilledMaintainer;
import Settings.CoffeeFactory.product.Product;

import java.util.Random;
/**
 * @author YSX
 * @description The basic abstract class of machine
 * @date 2021/10/27 21:08
 */
public abstract class Machine {

    private String type;
    //machine type,function
    private String ID;
    //machine id
    private double age = 0;
    //the time the machine has been in use,unit: year
    private double lifeSpan = 20;
    //the maximum expected life of the machine,unit:year
    private int maxProcessNum = 500;
    //The maximum number that the machine can process at one time
    protected boolean isBroken = false;
    // Whether the machine is damaged
    private double baseLoss = 0.5;
    //The foundation loss caused by each use reduces the service life
    private double productionLoss = 0.5;
    //the loss caused by production.The more we produce, the more we lose
    protected int aimProcessNum = 0;
    //The number of units expected to be produced for one production
    protected int breakLevel = 0;
    //the degree of machine failure


    public Machine(String type, String ID, double age, double lifeSpan, int maxProcessNum,  double baseLoss, double productionLoss) {
        this.type = type;
        this.ID = ID;
        this.age = age;
        this.lifeSpan = lifeSpan;
        this.maxProcessNum = maxProcessNum;
        this.baseLoss = baseLoss;
        this.productionLoss = productionLoss;
    }

    public Machine(String type, String ID, double age, double lifeSpan, int maxProcessNum, double baseLoss) {
        this.type = type;
        this.ID = ID;
        this.age = age;
        this.lifeSpan = lifeSpan;
        this.maxProcessNum = maxProcessNum;
        this.baseLoss = baseLoss;
    }

    public Machine(String type, String ID, double lifeSpan, int maxProcessNum, double baseLoss) {
        this.type = type;
        this.ID = ID;
        this.lifeSpan = lifeSpan;
        this.maxProcessNum = maxProcessNum;
        this.baseLoss = baseLoss;
    }

    public Machine(String type, String ID) {
        this.type = type;
        this.ID = ID;
    }

    public Machine(String type) {
        this.type=type;
    }
    protected void malfunction() {
        isBroken = true;
        System.out.println("Sorry, " + type + ID + " breaks down! Please fix!\n");
    }
    public void setBroken(boolean broken) {
        /**
         * @param broken
         * @return void
         * @author YXJ
         * @description add for Facade Test
         * @date 2021/10/26 13:39
         */
        isBroken = broken;
    }
    /**
     * @param breakLevel
     * @return void
     * @author YSX
     * @description Mark the extent of damage to the machine
     * @date 2021/10/27 21:40
     */
    public void markFault(int breakLevel) {
        isBroken = true;
        this.breakLevel = breakLevel;
        //fix();
        //czq add in 2021/10/24
        malfunction();
    }
/**
 * @return void
 * @author YSX
 * @description Fix the damaged machine
 * @date 2021/10/27 21:41
 */
    public void fix() {
        InternshipMaintainer maintainer1=new InternshipMaintainer("Tom", 18, Personnel.Gender.male, "1008611", 100);
        FreshmanMaintainer maintainer2=new FreshmanMaintainer("Jack", 19, Personnel.Gender.male, "1008612", 110);
        SkilledMaintainer maintainer3=new SkilledMaintainer("Robin", 20, Personnel.Gender.male, "1008613", 120);
        SeasonedMaintainer maintainer4=new SeasonedMaintainer("Mary", 21, Personnel.Gender.female, "1008614", 140);

        if (isBroken) {
            maintainer1.setNext(maintainer2);
            maintainer2.setNext(maintainer3);
            maintainer3.setNext(maintainer4);
            if (maintainer1.handle(breakLevel)) {
                breakLevel = 0;
                isBroken = false;
                System.out.println("Fix finished, " + type + ID + " can work again!\n");
            }
            else{
                System.out.println("Nobody can fix" + type + ID + ".Its broken level is too high!\n");
            }
        } else {
            System.out.println("There is nothing to be fixed.");//YXJ delete \n
        }
    }

    /**
     * @return void
     * @author YSX
     * @description Maintain the machine and prolong its service life
     * @date 2021/10/27 21:42
     */
    public void maintenance() {
        Random rand = new Random();
        int ageLonged = rand.nextInt(5);
        lifeSpan = lifeSpan + lifeSpan * ageLonged * 0.01;
        System.out.println("Maintenance work is completed, and the life of " + type + ID + " is extended to " + lifeSpan + " years.\n");
    }

    public void setID(String ID) {
        this.ID = ID;
        System.out.println("The code number of the machine is changed to " + ID + ".\n");
    }
    /**
     * @return double
     * @author YSX
     * @description After the machine is in use, its available time will be reduced,its age will increase
     * @date 2021/10/27 21:45
     */
    public double increaseAge() {
        age = age + baseLoss+productionLoss;
        System.out.println("The age of " + type + ID + " increases to " + age + " years.\n");
        if (age == lifeSpan) {
            System.out.println(type + ID + " has reached its end life.\n");
            System.out.println("Please maintenance " + type + ID + " or change a machine to run next time.\n");
        }
        return age;
    }

    public String getID() {
        return ID;
    }

    public void setAimProcessNum(int aimProcessNum) {
        if (aimProcessNum > maxProcessNum) {
            System.out.println("Exceed maxCapacity!\n");
            return;
        }
        if (aimProcessNum <= 0) {
            System.out.println("AimProcessNum must be a positive integer!\n");
            return;
        }
        this.aimProcessNum = aimProcessNum;
        //adjust the machine aging speed according to the target production number
        this.productionLoss = (1.0 * aimProcessNum) / maxProcessNum;
        double totalLoss=productionLoss+baseLoss;
     //   System.out.println("Set aimProcessNum to " + aimProcessNum + ".");
    }
    /**
     * @param product
     * @return int
     * @author YSX
     * @description abstract function named work
     * @date 2021/10/27 21:46
     */
    protected abstract int work(Product product);
    /**
     * @param product
     * @return int
     * @author YSX
     * @description Determine whether the machine can run properly
     * @date 2021/10/27 21:47
     */
    public int run(Product product) {
        double virtualAge = age + baseLoss+productionLoss;
        if (virtualAge > lifeSpan) {
            System.out.println(type + ID + "'s remaining life is not sufficient to support this operation.\n");
            System.out.println("Please maintenance " + type + ID + " or change a machine to run.\n");
            return 0;
        }
        if (aimProcessNum == 0) {
            System.out.println("Please set " + type + ID + "'s aimProcessNum first.\n");
            return 0;
        }
        System.out.println(type + ID + " starts to run...");
        return work(product);
    }
}

