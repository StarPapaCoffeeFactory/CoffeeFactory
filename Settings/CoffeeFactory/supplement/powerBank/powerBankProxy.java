package Settings.CoffeeFactory.supplement.powerBank;

/**
 * @author ZPZ
 * @description class powerBankProxy
 * @date 2021/10/27 14:10
 */

public class powerBankProxy implements powerBankSubject {

    private powerBank powerBankInstance;

    public powerBankProxy(powerBank tool) {
        this.powerBankInstance = tool;
    }

    //get powerBank
    @Override
    public boolean get() {
        if (powerBankInstance == null) {
            powerBankInstance = new powerBank();
        }
        preGet();
        boolean out = powerBankInstance.getPowerBank();
        postGet();

        return out;
    }

    public void preGet() {
        System.out.println("Doing preTake functions");
    }

    public void postGet() {
        System.out.println("Doing postTake functions");
    }

    //return powerBank
    @Override
    public boolean returnPowerBank() {
        if (powerBankInstance == null) {
            powerBankInstance = new powerBank();
        }
        preReturn();
        boolean out = powerBankInstance.returnPowerBank();
        postReturn();
        return out;
    }

    public void preReturn() {
        System.out.println("Doing preReturn functions");
    }

    public void postReturn() {
        System.out.println("Doing postReturn functions");
    }

    //return powerBankInstance
    public powerBank getPowerBankInstance() {
        return powerBankInstance;
    }

    //set powerBankInstance
    public void setPowerBankInstance(powerBank powerBankInstance) {
        this.powerBankInstance = powerBankInstance;
    }

    @Override
    public String toString() {
        return "class powerBankProxy implements powerBankSubject";
    }
}
