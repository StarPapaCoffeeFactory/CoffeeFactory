package Test.DesignPatternTests;

import Settings.CoffeeFactory.areas.manufacturingarea.AssemblyLine.AssemblyLine;
import Settings.CoffeeFactory.areas.manufacturingarea.AssemblyLine.AssemblyLineName;
import Settings.CoffeeFactory.areas.manufacturingarea.AssemblyLine.CoffeeFactoryProducer;
import Settings.CoffeeFactory.product.originalcoffee.Coffee;

import java.util.Scanner;

/**
 * @author LiuChuang
 * @description test for Factory
 */
public class FactoryMethodTest {

    public static void main(String[] args) {

        System.out.println("------------------------------------ Factory Method Test ------------------------------------");

        System.out.println("");
        System.out.println("CoffeeFactoryProducer : newCoffeeMachine(factoryName: String) : create one coffee assembly line instance with the given name");
        System.out.println("ArabicaCoffeeAssemblyLine : getCoffee() : create one arabica coffee instance");
        System.out.println("RobustaCoffeeAssemblyLine : getCoffee() : create one robusta coffee instance");
        System.out.println("");

        System.out.println("");
        System.out.println("┌─────────────────────────   Factory Method Test   ──────────────────────────┐");
        System.out.println("│                           1. arabica coffee                                │");
        System.out.println("│                           2. robusta coffee                                │");
        System.out.println("│                                                                            │");
        System.out.println("│                      Input the coffee you're gonna create                  │");
        System.out.println("└────────────────────────────────────────────────────────────────────────────┘");
        System.out.println("");

        Scanner input = new Scanner(System.in);
        int op;
        boolean flag = true;

        while (flag) {
            System.out.println("");
            System.out.print("Enter the order [0 to quit]:");
            op = input.nextInt();

            switch (op) {
                case 0:
                    flag = false;
                    break;
                case 1: {
                    System.out.println("\nNow let's create an arabica coffee instance.");
                    AssemblyLine aLine= CoffeeFactoryProducer.newCoffeeMachine(AssemblyLineName.ARABICA_COFFEE_FACTORY);
                    Coffee aCoffee=aLine.getCoffee();
                    System.out.print("Here is the coffee we've just created:\n ");
                    aCoffee.display();
                    break;
                }
                case 2: {
                    System.out.println("\nNow let's create a robusta coffee instance.");
                    AssemblyLine rLine=CoffeeFactoryProducer.newCoffeeMachine(AssemblyLineName.ROBUSTA_COFFEE_FACTORY);
                    Coffee rCoffee=rLine.getCoffee();
                    System.out.print("Here is the coffee we've just created:\n ");
                    rCoffee.display();
                    break;
                }
                default: {
                    System.out.println("Invalid Input, Please input again.");
                }
            }
        }

    }

}
