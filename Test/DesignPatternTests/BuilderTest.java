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
//        System.out.println("MilkChocController : startProduce() : Let the specific MilkChocMachine produce milk chocolate with a specific composition");
//        System.out.println("MilkChocController : getMilkChocolate() : Get the milk chocolate produced");
//        System.out.println("");
        CoffeeBasicMachine temp=new CoffeeBasicMachine() {
            @Override
            public void useCoffeeBean() {

            }
        };

        Scanner input = new Scanner(System.in);
        boolean flag = true;

        do {
//            System.out.println("");
//            System.out.println("********************** TIPS **********************");
//            System.out.println("***      1. Input 1 to start testing           ***");
//            System.out.println("***      2. Input 2 to fix machines            ***");
//            System.out.println("***      3. Input 3 to create new machines     ***");
//            System.out.println("***      4. Input 0 to exit                    ***");
//            System.out.println("**************************************************");
//            System.out.println("");
            System.out.println("");
            int op = input.nextInt();
            switch(op) {
                case 0:
                    flag = false;
                    break;
                case 1:
                    System.out.println("Create a new CoffeeMachineController producing Arabica and give control of it to a controller...");
                    CoffeeMachineController ArabicaController = new CoffeeMachineController(temp);
                    System.out.println("Create a new CoffeeMachineController producing Robusta and give control of it to a controller...");
                    CoffeeMachineController RobustaController = new CoffeeMachineController(temp);
                    break;
                case 2:
                    ArabicaController = new CoffeeMachineController(new CoffeeArabicaMachine());
                    RobustaController = new CoffeeMachineController(new CoffeeRobustaMachine());
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
