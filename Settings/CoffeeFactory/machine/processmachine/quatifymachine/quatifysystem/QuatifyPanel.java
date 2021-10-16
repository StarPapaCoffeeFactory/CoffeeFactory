package Settings.CoffeeFactory.machine.processmachine.quatifymachine.quatifysystem;

public class QuatifyPanel extends QuatifySystem{
    public QuatifyPanel(String species){
        super(species);
    }

    @Override
    protected void add(QuatifySystem QuatifySystem) { }

    /**
     * Show the structure of the system
     */
    @Override
    public void show(int depth) {
        for (int i = 0; i <= depth; i++) {
            System.out.print("-");
        }
        System.out.println(this.getKind());
    }

    public String toString() {
        return "class QuatifyPanel";
    }
}
