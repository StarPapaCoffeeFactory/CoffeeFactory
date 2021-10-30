package Settings.CoffeeFactory.machine.processmachine.packmachine;

/**
 * @author ShenBo
 * @description The class of the Advanced pack machine
 */
public class AdvancedPack extends PackMachine {
    public AdvancedPack(String type, String machineNum) {
        super(type, machineNum, 50, 500,1.2);
    }

    public AdvancedPack(String type, String machineNum, double age) {
        super(type, machineNum, age, 50, 500,1.2);
    }

    public String toString() {
        return "class AdvancedPack";
    }
}
