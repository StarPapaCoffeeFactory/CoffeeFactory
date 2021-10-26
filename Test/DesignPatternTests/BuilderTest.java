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
        System.out.println("─────────────────────────   [Builder] Test   ─────────────────────────");

        System.out.println("");
        System.out.println("CoffeeMachineController: startProcess: The machine starts to work under the control of controller");
        System.out.println("");
        System.out.println("");
        System.out.println("┌───────────────────────   [Builder] Test   ─────────────────────────┐");
        System.out.println("│   1.Create controller of the machine                               │");
        System.out.println("│   2.Establish a connection between the controller and the machine  │");
        System.out.println("│   3.Controller controls the machine to work                        │");
        System.out.println("└────────────────────────────────────────────────────────────────────┘");
        System.out.println("Enter the order [0 to quit]:");
        System.out.println("──────────────────────────────────────────────────────────────────────");
        System.out.println("");
        CoffeeBasicMachine temp1=new CoffeeBasicMachine() {
            @Override
            public void useCoffeeBean() {

            }
        };
        CoffeeBasicMachine temp2=new CoffeeBasicMachine() {
            @Override
            public void useCoffeeBean() {

            }
        };
        CoffeeMachineController ArabicaController = new CoffeeMachineController(temp1);
        CoffeeMachineController RobustaController = new CoffeeMachineController(temp2);
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        String name1="001",name2="002";
        boolean step2=false;
        do {
            System.out.println("");
            if(input.hasNextInt())
            {int op = input.nextInt();
            switch(op) {
                case 0:
                    flag = false;
                    break;
                case 1:
                    System.out.println("Create a new CoffeeMachineController ...,please enter its ID");
                    name1=input.next();
                    temp1.setID(name1);
                    ArabicaController = new CoffeeMachineController(temp1);
                    System.out.println("Create a new CoffeeMachineController ...,please enter its ID");
                    name2=input.next();
                    temp2.setID(name2);
                    RobustaController = new CoffeeMachineController(temp2);
                    step2=false;
                    break;
                case 2:
                    System.out.println("Create a new CoffeeMachineController producing Arabica and give control of it to a controller...");
                    ArabicaController = new CoffeeMachineController(new CoffeeArabicaMachine(name1));
                    System.out.println("Create a new CoffeeMachineController producing Robusta and give control of it to a controller...");
                    RobustaController = new CoffeeMachineController(new CoffeeRobustaMachine(name2));
                    step2=true;
                    break;
                case 3:
                    if(!step2)
                    { System.out.println("Step 2 has not been performed");}
                    else
                    {
                    System.out.println("CoffeeArabicaMachine start producing...");
                    ArabicaController.startProduce();
                    System.out.println("CoffeeRobustaMachine start producing...");
                    RobustaController.startProduce();}
                    break;
                default:
                    System.out.println("Invalid Input, Please input again.");
            }}
            else
            {System.out.println("Wrong input! Please input again");
                String string = input.next();
            }
        } while(flag);
    }
}
