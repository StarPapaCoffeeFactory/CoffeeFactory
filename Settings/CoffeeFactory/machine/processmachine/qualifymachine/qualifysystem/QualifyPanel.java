package Settings.CoffeeFactory.machine.processmachine.qualifymachine.qualifysystem;

public class QualifyPanel extends QualifySystem{
    public QualifyPanel(String kind){
        super(kind);
    }

    @Override
    protected void add(QualifySystem qualityTestSystem) { }

    @Override
    public void show(int depth) {
        for (int i = 0; i <= depth; i++) {
            System.out.print("-");
        }
        System.out.println(this.getKind());
    }

    public String toString() {
        return "class QualifyPanel";
    }
}
