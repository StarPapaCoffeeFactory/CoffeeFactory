package Settings.CoffeeFactory.supplement.powerBank;


public class powerBankProxy implements powerBankSubject {

    private powerBank powerBankInstance;

    /**
     * Proxy the portable battery proxy
     */
    public powerBankProxy(powerBank tool) {
        this.powerBankInstance = tool;
    }

    /**
     * Take the portable battery
     */
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
        //System.out.println("Doing preTake functions");
    }

    public void postGet() {
        //System.out.println("Doing postTake functions");
    }

    /**
     * Return the portable battery
     */
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
        //System.out.println("Doing preReturn functions");
    }

    public void postReturn() {
        //System.out.println("Doing postReturn functions");
    }

    /**
     * Return the instance of portable battery
     */
    public powerBank getPowerBankInstance() {
        return powerBankInstance;
    }

    /**
     * Set the instance of the portable battery
     */
    public void setPowerBankInstance(powerBank powerBankInstance) {
        this.powerBankInstance = powerBankInstance;
    }

    @Override
    public String toString() {
        return "class powerBankProxy implements powerBankSubject";
    }
}