package Test.DesignPatternTests;


import Settings.CoffeeFactory.supplement.receipt.commonReceipt;
import Settings.CoffeeFactory.supplement.receipt.purchaseReceipt;
import Settings.CoffeeFactory.supplement.receipt.taxReceipt;

import java.util.Scanner;


public class ImmutableTest {

    public static void main(String[] args) {
        /*
        System.out.println("------------------------------------ [Immutable] Test ------------------------------------");

        System.out.println("");
        System.out.println("AbstractReceipt : AbstractReceipt(String info, ReceiptType type) : " +
                "The base class of invariant objects, used to initialize invariant objects.");
        System.out.println("");
        */

        System.out.println("");
        System.out.println("┌────────────────────────   Immutable Test   ────────────────────────┐");
        System.out.println("|                   1. Init commonReceipt                            |");
        System.out.println("|                   2. Init TaxReceipt                               |");
        System.out.println("|                   3. Init PurchaseReceipt                          |");
        System.out.println("|                                                                    |");
        System.out.println("|        Tips: You can choose the type of invoice to input.          |");
        System.out.println("|            The invoice initialized here is immutable               |");
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
                    // init common receipt;
                    commonReceipt receipt = new commonReceipt("This is a common receipt.");
                    receipt.displayAll();
                    break;
                }
                case 2: {
                    // init TaxReceipt;
                    taxReceipt receipt = new taxReceipt("This is a tax receipt.");
                    receipt.displayAll();
                    break;
                }
                case 3: {
                    // init PurchaseReceipt;
                    purchaseReceipt receipt = new purchaseReceipt("This is a purchase receipt.");
                    receipt.displayAll();
                    break;
                }
                default: {
                    System.out.println("Invalid command. Please try again.");
                }
            }
        } while (flag);
    }

}