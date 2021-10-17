package Test.DesignPatternTests;

import java.util.Scanner;

public class CommandTest {
    public static void main(String[] args) {
        System.out.println("─────────────────────────   [Command] Test   ─────────────────────────");

        System.out.println("");
        System.out.println("Worker : produceAmericano : Let the worker send a command to produce Americano");
        System.out.println("Product : producing : Transmit the command to a specific machine");
        System.out.println("ProductMachine : process : Execute specific production process");
        System.out.println("");

        System.out.println("Firstly, we need to create a worker.");
        Worker worker = new WorkshopWorker("worker", 18, Person.Sex.MALE, 10);

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
                    worker.produceAmericano();
                    break;
                }
                case 2: {
                    worker.produceArabica();
                    break;
                }
                case 3: {
                    worker.produceAutumnBlend();
                    break;
                }
                case 4: {
                    worker.produceHouseBlend();
                    break;
                }
                default:{
                    System.out.println("Invalid Input, Please input again.");
                }
            }
        } while (flag);
    }
}

