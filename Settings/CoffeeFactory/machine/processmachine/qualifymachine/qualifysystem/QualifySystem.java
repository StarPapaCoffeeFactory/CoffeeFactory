package Settings.CoffeeFactory.machine.processmachine.qualifymachine.qualifysystem;

import Settings.CoffeeFactory.machine.processmachine.qualifymachine.QualifyMachine;

public abstract class QualifySystem extends QualifyMachine {
    private String kind;
    public QualifySystem(String kind) {
        super(kind);
        this.kind=kind;
    }
    public QualifySystem(String type, String ID) {
        super(type, ID, 50, 500,1.2);
    }
    protected abstract void add( QualifySystem qualifySystem);

    public void show() {
        this.show(0);
    }

    protected abstract void show(int depth);

    public String getKind() {
        return kind;
    }
}
