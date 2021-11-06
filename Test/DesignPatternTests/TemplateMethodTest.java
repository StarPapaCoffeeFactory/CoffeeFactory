package Test.DesignPatternTests;

import Settings.CoffeeFactory.machine.transportmachine.LCAR;
import Settings.CoffeeFactory.machine.transportmachine.MCAR;
import Settings.CoffeeFactory.machine.transportmachine.SCAR;
import Settings.CoffeeFactory.product.Product;
import Settings.CoffeeFactory.product.coffeebeverage.Latte;

import java.util.Scanner;

/**
 * @author YuShiXuan
 * @description test for TemplateMethod
 */
public class TemplateMethodTest {
    public TemplateMethodTest() {
    }

    public static void main(String[] args) {
        System.out.println("─────────────────────   [Template Method] Test   ─────────────────────");
        System.out.println("");
        System.out.println("TransportMachine : work : execute work of transporting, include loading, transporting and arriving.");
        System.out.println("TransportMachine : load: loading a product.");
        System.out.println("TransportMachine : arrive : arrive at destination.");
        System.out.println("");
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        System.out.println("Suppose that we want to transport 50 Latte.");
        Latte latte = new Latte(1);
        System.out.println("");
        System.out.println("┌────────────────────   [Template Method] Test   ────────────────────┐");
        System.out.println("│                       To transport Latte                           │");
        System.out.println("│                       1. Use a big car                             │");
        System.out.println("│                       2. Use a medium car                          │");
        System.out.println("│                       3. Use a small car                           │");
        System.out.println("│                                                                    │");
        System.out.println("│                       To carry people                              │");
        System.out.println("│                       4. Use a small car                           │");
        System.out.println("└────────────────────────────────────────────────────────────────────┘");
        System.out.println("Enter the order [0 to quit]:");
        System.out.println("──────────────────────────────────────────────────────────────────────");
        System.out.println("");
        do {
            if(input.hasNextInt()){
            int op = input.nextInt();
            SCAR smallCar;
            switch(op) {
                case 0:
                    flag = false;
                    break;
                case 1:
                    System.out.println("\nUse a large car to transport them.");
                    LCAR bigTruck = new LCAR("LC", "101");
                    bigTruck.setAimProcessNum(50);
                    bigTruck.work(latte);
                    break;
                case 2:
                    System.out.println("\nUse a medium car to transport them.");
                    MCAR van = new MCAR("MC", "102");
                    van.setAimProcessNum(50);
                    van.work(latte);
                    break;
                case 3:
                    System.out.println("\nUse a small car to transport them.");
                    smallCar = new SCAR("SC", "103");
                    smallCar.work(latte);
                    break;
                case 4:
                    System.out.println("\nSmall car can only take people. ");
                    smallCar = new SCAR("SC", "104");
                    smallCar.work((Product)null);
                    break;
                default:
                    System.out.println("Invalid Input, Please input again.");
            }}else
            {System.out.println("Wrong input! Please input again");
                String string = input.next();
            }
        } while(flag);
    }
}
