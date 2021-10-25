package Test.DesignPatternTests;

import Settings.CoffeeFactory.product.blendedcoffee.*;
import Settings.CoffeeFactory.product.originalcoffee.*;
import java.util.Scanner;

/**
 * @author LouTianyu
 * @description Test for Bridge
 */
public class BridgeTest {
    static public void bridgeTest() {
        System.out.println("");
        System.out.println("┌─────────────────────────   Bridge Test   ──────────────────────────┐");
        System.out.println("│                  1. Choose Blend Method                            │");
        System.out.println("│                  2. Choose Coffee Bean                             │");
        System.out.println("│                  3. Wait for manufacturing                         │");
        System.out.println("└────────────────────────────────────────────────────────────────────┘");
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Choose Blend Method");
        System.out.println("Option: 1.AutumnBlend 2.PikePlace 3.Verona");
        BlendedCoffee blendedCoffee;
        int tmp;
        while (true) {
            try {
                tmp = scanner.nextInt();
                if (tmp == 1) {
                    blendedCoffee = new AutumnBlend();
                    System.out.println("AutumnBlend will be created");
                    break;
                } else if (tmp == 2) {
                    blendedCoffee = new PikePlace();
                    System.out.println("PikePlace will be created");
                    break;
                } else {
                    System.out.println("Verona will be created");
                }
            } catch (Exception e) {
                System.out.println("Invalid Input. Try again!");
            }
        }
        System.out.println("2. Choose Coffee Bean");
        int cmd;
        while (true) {
            try {
                System.out.println("1.Arabica  2.Robusta");
                cmd = scanner.nextInt();
                Coffee coffee;
                if (cmd == 1) {
                    coffee = new Arabica();
                    System.out.println(coffee.getBlendedCoffeeName());
                } else if (cmd == 2) {
                    coffee = new Robusta();
                    System.out.println(coffee.getBlendedCoffeeName());
                } else if (cmd == 3) {
                    break;
                } else {
                    System.out.println("Invalid Input. Try again!");
                }
            } catch (Exception e) {
                System.out.println("Invalid Input. Try again!");
            }
        }

    }

    public static void main(String[] args) {
        bridgeTest();
        System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");

    }
}
