package Settings.CoffeeFactory.machine.processmachine.packmachine;

public class BasicPack extends PackMachine {
    public BasicPack(String type, String machineNum) {
        super(type, machineNum, 30, 250,1.5);
    }

    public BasicPack(String type, String machineNum, double age) {
        super(type, machineNum, age, 30, 250,1.5);
    }

    public String toString() {
        return "class BasicPack";
    }
}
