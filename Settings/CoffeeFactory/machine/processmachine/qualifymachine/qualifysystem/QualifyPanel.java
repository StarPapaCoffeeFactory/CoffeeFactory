package Settings.CoffeeFactory.machine.processmachine.qualifymachine.qualifysystem;
/**
 * @author YSX
 * @description class of the single Qualify Panel
 * @date 2021/10/27 21:16
 */
public class QualifyPanel extends QualifySystem{
    public QualifyPanel(String kind){
        super(kind);
    }
    /*
     *
     * @param qualifySystem
     * @return void
     * @author YSX
     * @description Add subsystems to the system
     * @date 2021/10/27 21:52
     */
    @Override
    protected void add(QualifySystem qualityTestSystem) { }
    /*
     *
     * @return void
     * @author YSX
     * @description show the subsystems of the system
     * @date 2021/10/27 21:53
     */
    @Override
    public void show(int depth) {
        for (int i = 0; i <= depth; i++) {
            System.out.print("-");
        }
        System.out.println(this.getKind());
        work();
    }
    public void work()
    {
        System.out.println("Panel"+this.getKind()+" is working" );
    }
    public String toString() {
        return "class QualifyPanel";
    }
}
