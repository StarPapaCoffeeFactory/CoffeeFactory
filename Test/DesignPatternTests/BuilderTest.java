package Test.DesignPatternTests;

import java.util.Random;
import java.util.Scanner;
import Settings.CoffeeFactory.machine.processmachine.productmachine.coffeemachine.CoffeeBasicMachine;
import Settings.CoffeeFactory.machine.processmachine.productmachine.coffeemachine.CoffeeArabicaMachine;
import Settings.CoffeeFactory.machine.processmachine.productmachine.coffeemachine.CoffeeMachineController;
import Settings.CoffeeFactory.machine.processmachine.productmachine.coffeemachine.CoffeeRobustaMachine;
public class BuilderTest {
    public BuilderTest() {
    }
    public static void main(String[] args) {
        //测试流程
        System.out.println("");
        System.out.println("┌─────────────────────────   Builder Test   ─────────────────────────┐");
        System.out.println("│   1.Create controller of the machine                               │");
        System.out.println("│   2.Establish a connection between the controller and the machine  │");
        System.out.println("│   3.Controller controls the machine to work                        │");
        System.out.println("└────────────────────────────────────────────────────────────────────┘");
        System.out.println("Enter the command [0 to quit]:");
        System.out.println("");
        CoffeeBasicMachine temp1=new CoffeeBasicMachine() {
            @Override
            public void useCoffeeBean() {

            }
        };temp1.setID("001");
        CoffeeBasicMachine temp2=new CoffeeBasicMachine() {
            @Override
            public void useCoffeeBean() {

            }
        };temp2.setID("002");
        CoffeeMachineController ArabicaController = new CoffeeMachineController(temp1);
        CoffeeMachineController RobustaController = new CoffeeMachineController(temp2);
        Scanner input = new Scanner(System.in);
        boolean flag = true;

        do {
            System.out.println("");
            int op = input.nextInt();
            switch(op) {
                case 0:
                    flag = false;
                    break;
                case 1:
                    System.out.println("Create a new CoffeeMachineController ...");
                    ArabicaController = new CoffeeMachineController(temp1);
                    System.out.println("Create another new CoffeeMachineController ...");
                    RobustaController = new CoffeeMachineController(temp2);
                    break;
                case 2:
                    System.out.println("Create a new CoffeeMachineController producing Arabica and give control of it to a controller...");
                    ArabicaController = new CoffeeMachineController(new CoffeeArabicaMachine("001"));
                    System.out.println("Create a new CoffeeMachineController producing Robusta and give control of it to a controller...");
                    RobustaController = new CoffeeMachineController(new CoffeeRobustaMachine("002"));
                    break;
                case 3:
                    System.out.println("Let CoffeeArabicaMachine start producing...");
                    ArabicaController.startProduce();
                    System.out.println("Let CoffeeRobustaMachine start producing...");
                    RobustaController.startProduce();
                    break;
                default:
                    System.out.println("Invalid Input, Please input again.");
            }
        } while(flag);

    }
}
