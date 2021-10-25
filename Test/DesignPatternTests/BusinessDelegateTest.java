package Test.DesignPatternTests;

import java.util.Scanner;

public class BusinessDelegateTest {
    public static void main(String[] args) {

        System.out.println("We will test the business delegate design model");
        System.out.println("");
        System.out.println("┌─────────────────────────   Business Delegate Test   ──────────────────────────┐");
        System.out.println("│               0. Exit!!!                                                      │");
        System.out.println("│               1. Testing the get material service                             │");
        System.out.println("│               2. Testing the storage material service                         │");
        System.out.println("└───────────────────────────────────────────────────────────────────────────────┘");
        System.out.println("");

        Scanner input = new Scanner(System.in);
        int op;
        boolean flag = true;

        do{
            System.out.println("");
            System.out.print("Enter the order [0 to 3]:");
            op = input.nextInt();

            switch(op) {
                case 0:
                {
                    flag = false;
                    break;
                }
                case 1:
                {

                    break;
                }
                case 2:
                {

                    break;
                }

                default:
                {
                    System.out.println("Invalid Input, Please input again.");
                }
            }
        }while(flag);

        System.out.println("Business delegate Design Mode Finished");

    }
}
