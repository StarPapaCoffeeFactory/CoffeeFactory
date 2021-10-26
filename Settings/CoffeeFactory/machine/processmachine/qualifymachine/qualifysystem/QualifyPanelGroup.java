package Settings.CoffeeFactory.machine.processmachine.qualifymachine.qualifysystem;

import java.util.ArrayList;
import java.util.List;

public class QualifyPanelGroup extends QualifySystem{
    private List<QualifySystem> succulents = new ArrayList<QualifySystem>();


    public QualifyPanelGroup(String kind){
        super(kind);
    }


    @Override
    public void add(QualifySystem qualifySystem){
        succulents.add(qualifySystem);
    }

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
