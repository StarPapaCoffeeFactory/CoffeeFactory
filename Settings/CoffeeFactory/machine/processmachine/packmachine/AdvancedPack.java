package Settings.CoffeeFactory.machine.processmachine.packmachine;

public class AdvancedPack extends PackMachine {
    public AdvancedPack(String type, String machineNum) {
        super(type, machineNum, 50, 1.2, 500);
    }

    public AdvancedPack(String type, String machineNum, double age) {
        super(type, machineNum, age, 50, 1.2, 500);
    }

    public String toString() {
        return "class AdvancedPack";
    }
}
