package Settings.CoffeeFactory.machine.processmachine.productmachine;
/**
 * @author YSX
 * @description Basic Product Machine class
 * @date 2021/10/27 21:18
 */
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
