package Settings.CoffeeFactory.machine;

import Settings.CoffeeFactory.product.Product;

import java.util.Random;

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
    private boolean isBroken = false;
    // Whether the machine is damaged
    private double baseLoss = 0.5;
    //The foundation loss caused by each use reduces the service life
    private double productionLoss = 0.5;
    //the loss caused by production.The more we produce, the more we lose
    protected int aimProcessNum = 0;
    //The number of units expected to be produced for one production
    protected int breakLevel = 0;
    //the degree of machine failure


    public Machine(String type, String ID, double age, double lifeSpan, int maxProcessNum,  double baseLoss, double totalLoss) {
        this.type = type;
        this.ID = ID;
        this.age = age;
        this.lifeSpan = lifeSpan;
        this.maxProcessNum = maxProcessNum;
        this.baseLoss = baseLoss;
        this.productionLoss = totalLoss;
    }

    public Machine(String type, String ID) {
        this.type = type;
        this.ID = ID;
    }

    protected void malfunction() {
        isBroken = true;
        System.out.println("Oh no! " + type + ID + " breaks down! Please fix!\n");
    }
    public void markFault(int breakLevel) {
        isBroken = true;
        this.breakLevel = breakLevel;
        fix();
    }
    public void fix() {
// FixRookie worker1 = new FixRookie("Kerr", 18, Person.Sex.MALE, 10, null);
// FixProfession worker2 = new FixProfession("Young", 19, Person.Sex.MALE, 10, null);
// FixExpert worker3 = new FixExpert("Brian", 18, Person.Sex.MALE, 10000, null);
        FixWorker worker = new FixWorker("Kerr", 18);

        if (isBroken) {
                breakLevel = 0;
                isBroken = false;
                System.out.println("Fix finished, " + type + ID + " can work again!\n");
            }
        else {
            System.out.println("There is nothing to be fixed.\n");
        }
    }
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
    public double increaseAge() {
        age = age + baseLoss+productionLoss;
        System.out.println("The age of " + type + ID + " increases to " + age + " years.\n");
        if (age == lifeSpan) {
            System.out.println(type + ID + " has reached its end life.\n");
            System.out.println("Please maintenance " + type + ID + " or change a machine to run next time.\n");
        }
        return age;
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
        System.out.println("Set aimProcessNum to " + aimProcessNum + ".");
        System.out.println("The agingSpeed of " + type + ID + " changes to " + totalLoss + ".\n");
    }

    protected abstract int work(Product product);

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
