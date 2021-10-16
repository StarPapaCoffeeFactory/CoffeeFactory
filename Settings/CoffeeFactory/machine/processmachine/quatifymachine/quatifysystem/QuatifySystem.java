package Settings.CoffeeFactory.machine.processmachine.quatifymachine.quatifysystem;

import Settings.CoffeeFactory.machine.processmachine.quatifymachine.QuatifyMachine;

public abstract  class QuatifySystem extends QuatifyMachine {
    private String kind;
    public QuatifySystem(String kind) {
        super(kind);
        this.kind=kind;
    }
    protected abstract void add(QuatifySystem qualityTestSystem);

    /**
     * Show the structure of the system
     */
    public void show() {
        this.show(0);
    }

    protected abstract void show(int depth);

    public String getKind() {
        return kind;
    }
}
