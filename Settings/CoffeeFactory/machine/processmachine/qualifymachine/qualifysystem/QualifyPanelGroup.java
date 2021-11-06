package Settings.CoffeeFactory.machine.processmachine.qualifymachine.qualifysystem;

import java.util.ArrayList;
import java.util.List;
/**
 * @author YSX
 * @description Qualify Panel Group class, means a collection of many Qualify Panels
 * @date 2021/10/27 21:15
 */
public class QualifyPanelGroup extends QualifySystem{
    private List<QualifySystem> succulents = new ArrayList<QualifySystem>();


    public QualifyPanelGroup(String kind){
        super(kind);
    }

    /**
     * @param qualifySystem
     * @return void
     * @author YSX
     * @description Add subsystems to the system
     * @date 2021/10/27 21:52
     */
    @Override
    public void add(QualifySystem qualifySystem){
        succulents.add(qualifySystem);
    }
    /**
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
        System.out.println("Group"+this.getKind() );
        work();
        for (QualifySystem suc : succulents) {
            suc.show(depth + 2);
        }
    }
    public void work()
    {
        System.out.println("Group"+this.getKind()+" is working" );
    }
}
