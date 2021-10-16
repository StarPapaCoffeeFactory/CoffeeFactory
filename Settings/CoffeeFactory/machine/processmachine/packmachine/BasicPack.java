package Settings.CoffeeFactory.machine.processmachine.packmachine;

public class BasicPack extends PackMachine {
    public BasicPack(String type, String machineNum) {
        super(type, machineNum, 30, 1.5, 250);
    }

    public BasicPack(String type, String machineNum, double age) {
        super(type, machineNum, age, 30, 1.5, 250);
    }

    public String toString() {
        return "class BasicPack";
    }
}
