package Settings.CoffeeFactory.machine.processmachine.qualifymachine.qualifysystem;

import java.util.ArrayList;
import java.util.List;

public class QualifyPanelGroup extends QualifySystem{
    private List<QualifySystem> succulents = new ArrayList<QualifySystem>();

    /**
     * Represent quality inspection panel group
     */
    public QualifyPanelGroup(String kind){
        super(kind);
    }

    /**
     * Add quality test system
     */
    @Override
    public void add(QualifySystem qualifySystem){
        succulents.add(qualifySystem);
    }

//    @Override
//    public void add(QualityTestSystem qualityTestSystem) {
//
//    }

    /**
     * Show the structure of the system
     */
    @Override
    public void show(int depth) {
        for (int i = 0; i <= depth; i++) {
            System.out.print("-");
        }
        System.out.println("Group"+this.getKind() );
        for (QualifySystem suc : succulents) {
            suc.show(depth + 2);
        }
    }
}
