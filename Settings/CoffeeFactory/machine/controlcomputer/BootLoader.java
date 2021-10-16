package Settings.CoffeeFactory.machine.controlcomputer;

public class BootLoader {
    Class<? extends OS> osClass = null;

    public void bindOS(Class<? extends OS> osClass) {
        try {
            this.osClass = osClass;
        } catch (Exception e) {
            System.out.println("Cannot bind to this class! Set to null.");
            this.osClass = null;
        }
    }

    public void loadOSTo(ControlComputer computer) {
        try {
            computer.loadOS(osClass.getDeclaredConstructor().newInstance());
        } catch (Exception e) {
            System.out.println("Cannot load OS of type" + osClass.getSimpleName() + "!");
        }
    }


    public static void main(String[] args) {
        BootLoader bootLoader = new BootLoader();
        ControlComputer computer = new ControlComputer();
        ControlComputer anotherComputer = new ControlComputer();

        bootLoader.bindOS(Windows.class);
        bootLoader.loadOSTo(computer);
        computer.boot();

        bootLoader.bindOS(Linux.class);
        bootLoader.loadOSTo(anotherComputer);
        anotherComputer.boot();
    }


}
