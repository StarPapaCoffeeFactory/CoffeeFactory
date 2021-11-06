package Test.DesignPatternTests;

import Settings.CoffeeFactory.personnel.Personnel;
import Settings.CoffeeFactory.personnel.staff.worker.*;
import java.util.Scanner;


/**
 * @author Kaiyu Huang
 * @description Test for Command
 */
public class CommandTest {

    public static void main(String[] args) {
        /*
         * @param args
         * @return void
         * @author Kaiyu Huang
         * @description main function for CommandTest
         * @date 2021/10/27 8:12
         */
        System.out.println("─────────────────────────   [Command] Test   ─────────────────────────");

        System.out.println("");
        System.out.println("Worker : produceAmericano : Let the Worker send a command to produce Americano");
        System.out.println("Product : producing : Transmit the command to a specific machine");
        System.out.println("ProductMachine : process : Execute specific production process");
        System.out.println("");

        System.out.println("Firstly, we need to create a Worker.");
        Worker concreteWorker = new Worker("Worker", 18, Personnel.Gender.male, "123456", 10);

        System.out.println("");
        System.out.println("┌─────────────────────────   Command Test   ─────────────────────────┐");
        System.out.println("│                       1. produce Americano                         │");
        System.out.println("│                       2. produce Arabica                           │");
        System.out.println("│                       3. produce Robusta                           │");
        System.out.println("│                       4. produce Latte                             │");
        System.out.println("└────────────────────────────────────────────────────────────────────┘");
        System.out.println("");

        Scanner input = new Scanner(System.in);
        int op;
        boolean flag = true;

        do {
            System.out.println("");
            System.out.print("Enter the order [0 to quit]:");
            op = input.nextInt();

            switch (op) {
                case 0:
                    flag = false;
                    break;
                case 1: {
                    concreteWorker.produceAmericano();
                    break;
                }
                case 2: {
                    concreteWorker.produceArabica();
                    break;
                }
                case 3: {
                    concreteWorker.produceRobusta();
                    break;
                }
                case 4: {
                    concreteWorker.produceLatte();
                    break;
                }
                default:{
                    System.out.println("Invalid Input, Please input again.");
                }
            }
        } while (flag);
    }
}

