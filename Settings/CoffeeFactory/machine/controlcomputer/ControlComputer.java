package Settings.CoffeeFactory.machine.controlcomputer;

public class ControlComputer {

    private OS os = null;

    public ControlComputer() {
    }

    public void loadOS(OS os) {
        this.os = os;
    }

    public void boot() {
        if (os != null) {
            System.out.println(os.Startup());
        } else {
            System.out.println("No OS!");
        }
    }

}
