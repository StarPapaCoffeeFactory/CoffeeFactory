package Settings.CoffeeFactory.machine.processmachine.packmachine;

/**
 * @author ShenBo
 * @description The class of the common pack machine
 */
public class CommonPack extends PackMachine {
    public CommonPack(String type, String machineNum) {
        super(type, machineNum, 30, 250,1.5);
    }

    public CommonPack(String type, String machineNum, double age) {
        super(type, machineNum, age, 30, 250,1.5);
    }

    public String toString() {
        return "class CommonPack";
    }
}
