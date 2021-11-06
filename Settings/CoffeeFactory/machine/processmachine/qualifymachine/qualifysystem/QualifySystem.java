package Settings.CoffeeFactory.machine.processmachine.qualifymachine.qualifysystem;

import Settings.CoffeeFactory.machine.processmachine.qualifymachine.QualifyMachine;
/**
 * @author YSX
 * @description abstract class of QualifySystem extends Qualify machine
 * @date 2021/10/27 21:14
 */
public abstract class QualifySystem extends QualifyMachine {
    private String kind;
    public QualifySystem(String kind) {
        super(kind);
        this.kind=kind;
    }
    public QualifySystem(String type, String ID) {
        super(type, ID, 50, 500,1.2);
    }
    /**
     * @param qualifySystem
     * @return void
     * @author YSX
     * @description Add subsystems to the system
     * @date 2021/10/27 21:52
     */
    protected abstract void add( QualifySystem qualifySystem);
    /**
     * @return void
     * @author YSX
     * @description show the subsystems of the system
     * @date 2021/10/27 21:53
     */
    public void show() {
        this.show(0);
    }

    protected abstract void show(int depth);

    public String getKind() {
        return kind;
    }
}
