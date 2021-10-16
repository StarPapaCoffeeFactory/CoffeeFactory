package Test.DesignPatternTests;

import Settings.CoffeeFactory.product.blendedcoffeebean.houseblend.HouseBlend;
import Settings.CoffeeFactory.product.originalcoffeebean.Arabica;
import Settings.CoffeeFactory.product.originalcoffeebean.Bourbon;
import Settings.CoffeeFactory.product.originalcoffeebean.Coffee;
import Settings.CoffeeFactory.product.originalcoffeebean.Robusta;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author LouTianyu
 * @description Test for Flyweight
 */

public class FlyweightTest {

    public static void main(String[] args) {
        final String HINT1 = "\n"
                + "┌─────────────────────────   Flyweight Test   ──────────────────────────┐\n"
                + "│                  <Phase 1: Create an Array of Coffee>                 │\n"
                + "│                  0. Produce HouseBlend Coffee Now                     │\n"
                + "│                  1. Arabica Coffee                                    │\n"
                + "│                  1. Bourbon Coffee                                    │\n"
                + "│                  1. Robusta Coffee                                    │\n"
                + "└───────────────────────────────────────────────────────────────────────┘\n";

        final String HINT2 = "\n"
                + "┌─────────────────────────   Flyweight Test   ──────────────────────────┐\n"
                + "│                  <Phase 2: Compare Instance Refs>                     │\n"
                + "│                  Input two indexes to compare.                        │\n"
                + "│                  If they are referring to the same instance,          │\n"
                + "│                  \"true\" is printed.                                 │\n"
                + "│                  Else \"false\" is printed.                           │\n"
                + "│                  Input -1 to quit.                                    │\n"
                + "│                  Index start from 0.                                  │\n"
                + "└───────────────────────────────────────────────────────────────────────┘\n";

        System.out.println(
                "—————————————-------------------------------------———— Test[Flyweight]Pattern —————————————-------------------------------------————");

        System.out.println("");
        System.out
                .println("HouseBlend : HouseBlend(List<Class<? extends Coffee>> typeList) "
                        + "Get an instance of subclass of Coffee.");
        System.out
                .println("HouseBlend : at(index: int) : Return the Coffee instance at index.");
        System.out.println("");
        System.out.println(HINT1);

        Scanner input = new Scanner(System.in);
        int op;
        boolean flag = true;

        ArrayList<Class<? extends Coffee>> classes = new ArrayList<>();
        Class<? extends Coffee> classChosen = null;

        do {
            System.out.print("Enter the option [0 to construct HouseBlend now]:");
            op = input.nextInt();
            switch (op) {
                case 0:
                    classChosen = null;
                    flag = false;
                    break;
                case 1: {
                    classChosen = Arabica.class;
                    break;
                }
                case 2: {
                    classChosen = Bourbon.class;
                    break;
                }
                case 3: {
                    classChosen = Robusta.class;
                    break;
                }
                default: {
                    classChosen = null;
                    System.out.println("Invalid Input, Please try again.");
                }
            }
            if (classChosen != null) {
                classes.add(classChosen);
                System.out.println("Added coffee type:" + classChosen.getSimpleName());
                System.out.println("");
            } else {
                System.out.println("");
            }
        } while (flag);

        System.out.println("You will see the production of coffee you selected here.");
        System.out.println("Each type will be displayed AT MOST ONCE:");

        try {
            HouseBlend houseBlend = new HouseBlend(classes);
            int index = 0;
            System.out.println("");
            System.out.println("HouseBlend is instantiated as following:");
            System.out.println("index\ttype");
            System.out.println("-----\t---------------");
            while (houseBlend.at(index) != null) {
                System.out.println(Integer.toString(index) + "\t"
                        + houseBlend.at(index).getClass().getSimpleName());
                index++;
            }
            System.out.println(HINT2);
            while (true) {
                System.out.print("Enter the indexes [-1 to quit]:");
                int lIndex = input.nextInt();
                if (lIndex == -1) {
                    return;
                }
                int rIndex = input.nextInt();
                if (rIndex == -1) {
                    return;
                }
                System.out.println(houseBlend.at(lIndex) == houseBlend.at(rIndex));
            }
        } catch (Exception e) {
            System.out.println("Failed to instantiate HouseBlend coffee.");
        }

    }


}