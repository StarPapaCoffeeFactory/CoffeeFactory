package Settings.CoffeeFactory.machine.processmachine.packmachine;

import Settings.CoffeeFactory.machine.processmachine.ProcessMachine;
import Settings.CoffeeFactory.machine.processmachine.packmachine.strategy.PackStrategy;
import Settings.CoffeeFactory.product.Product;

public class PackMachine extends ProcessMachine {

    // pack strategy
    private PackStrategy strategy;

    public PackMachine(String type, String machineNum) {
        this(type, machineNum, 10.0, 10,0.5);
    }

    public PackMachine(String type, String machineNum, double lifeYear, int maxCapacity, double lossCoefficient) {
        super(type, machineNum, lifeYear, maxCapacity,lossCoefficient);
    }

    public PackMachine(String type, String machineNum, double age, double lifeYear, int maxCapacity, double lossCoefficient) {
        super(type, machineNum, age, lifeYear, maxCapacity,lossCoefficient);
    }

    public void setStrategy(PackStrategy strategy) {
        this.strategy = strategy;
    }

    public PackStrategy getStrategy() {
        return strategy;
    }

    @Override
    public void process(Product product, int productNum) {
        if (strategy == null) {
            System.out.println("Fail to pack!");
            System.out.println("Please invoke setStrategy() to set the pack strategy first.");
        } else {
            strategy.packaging(product);
        }
    }

    public String toString() {
        return "class PackMachine";
    }
}

