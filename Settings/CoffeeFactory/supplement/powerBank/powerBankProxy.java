package Settings.CoffeeFactory.supplement.powerBank;


public class powerBankProxy implements powerBankSubject {

    private powerBank powerBankInstance;

    /**
     * Proxy the powerBank proxy
     */
    public powerBankProxy(powerBank tool) {
        this.powerBankInstance = tool;
    }

    /**
     * Get a powerBank
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
        System.out.println("Doing preTake functions");
    }

    public void postGet() {
        System.out.println("Doing postTake functions");
    }

    /**
     * Return the powerBank
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
        System.out.println("Doing preReturn functions");
    }

    public void postReturn() {
        System.out.println("Doing postReturn functions");
    }

    /**
     * Return the instance of powerBank
     */
    public powerBank getPowerBankInstance() {
        return powerBankInstance;
    }

    /**
     * Set the instance of the powerBank
     */
    public void setPowerBankInstance(powerBank powerBankInstance) {
        this.powerBankInstance = powerBankInstance;
    }

    @Override
    public String toString() {
        return "class powerBankProxy implements powerBankSubject";
    }
}
