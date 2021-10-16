package Settings.CoffeeFactory.machine.processmachine.productmachine;

public class BasicProductMachine extends ProductMachine{
    public BasicProductMachine(String type, String ID) {
        super(type, ID, 40, 1,500);
    }

    public BasicProductMachine(String type, String ID, double age) {
        super(type, ID, age, 40, 1, 500);
    }

    public String toString() {
        return "class BasicProductMachine";
    }
}
