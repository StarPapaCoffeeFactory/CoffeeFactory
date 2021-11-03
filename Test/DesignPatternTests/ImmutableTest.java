package Test.DesignPatternTests;


import Settings.CoffeeFactory.supplement.receipt.commonReceipt;
import Settings.CoffeeFactory.supplement.receipt.purchaseReceipt;
import Settings.CoffeeFactory.supplement.receipt.taxReceipt;

import java.util.Scanner;


public class ImmutableTest {

    public static void main(String[] args) {


        System.out.println("");
        System.out.println("┌────────────────────────   Immutable Test   ────────────────────────┐");
        System.out.println("│                   1. Create a common receipt                       │");
        System.out.println("│                   2. Create a tax receipt                          │");
        System.out.println("│                   3. Create a purchase receipt                     │");
        System.out.println("│                                                                    │");
        System.out.println("│        Tips: You can choose the type of invoice to input.          │");
        System.out.println("│                The invoice created here is immutable               │");
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
                    //create common receipt;
                    commonReceipt cReceipt = new commonReceipt("This is a common receipt.");
                    cReceipt.displayAll();
                    break;
                }
                case 2: {
                    //create tax receipt;
                    taxReceipt tReceipt = new taxReceipt("This is a tax receipt.");
                    tReceipt.displayAll();
                    break;
                }
                case 3: {
                    //create purchase receipt;
                    purchaseReceipt pReceipt = new purchaseReceipt("This is a purchase receipt.");
                    pReceipt.displayAll();
                    break;
                }
                default: {
                    System.out.println("Invalid command. Please try again.");
                }
            }
        } while (flag);
    }

}