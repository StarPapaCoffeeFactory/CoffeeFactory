package Test.DesignPatternTests;

import Settings.CoffeeFactory.personnel.Personnel;
import Settings.CoffeeFactory.personnel.staff.worker.*;
import java.util.Scanner;

/**
 * @ program: CoffeeFactory.iml
 * @ description: Test for Command
 * @ author: Kaiyu Huang
 * @ date: 2021-10-27 08:31:25
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
        System.out.println("Worker : produceAmericano : Let the worker send a command to produce Americano");
        System.out.println("Product : producing : Transmit the command to a specific machine");
        System.out.println("ProductMachine : process : Execute specific production process");
        System.out.println("");

        System.out.println("Firstly, we need to create a worker.");
        worker concreteWorker = new worker("worker", 18, Personnel.Gender.male, "123456", 10);

        System.out.println("");
        System.out.println("┌─────────────────────────   Command Test   ─────────────────────────┐");
        System.out.println("│                       1. produce Americano                         │");
        System.out.println("│                       2. produce Arabica                           │");
        System.out.println("│                       3. produce AutumnBlend                       │");
        System.out.println("│                       4. produce HouseBlend                        │");
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
                    concreteWorker.produceAutumnBlend();
                    break;
                }
                case 4: {
                    concreteWorker.produceHouseBlend();
                    break;
                }
                default:{
                    System.out.println("Invalid Input, Please input again.");
                }
            }
        } while (flag);
    }
}

