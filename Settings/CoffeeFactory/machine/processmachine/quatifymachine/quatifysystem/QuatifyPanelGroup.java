package Settings.CoffeeFactory.machine.processmachine.quatifymachine.quatifysystem;
import java.util.ArrayList;
import java.util.List;

public class QuatifyPanelGroup extends QuatifySystem{
    private List<QuatifySystem> succulents = new ArrayList<QuatifySystem>();

    /**
     * Represent quality inspection panel group
     */
    public QuatifyPanelGroup(String kind){
        super(kind);
    }

    /**
     * Add quality test system
     */
    @Override
    public void add(QuatifySystem QuatifySystem){
        succulents.add(QuatifySystem);
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
        for (QuatifySystem suc : succulents) {
            suc.show(depth + 2);
        }
    }
}
