package Test.DesignPatternTests;

import Settings.CoffeeFactory.supplement.screen.screen;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * @author wangling
 * @project CoffeeFactory
 * @classname MonostateTest
 * @description test for monostate pattern
 * @date 2021/10/26 15:17
 */
public class MonostateTest {

    public static void runTest() {
        List<screen> ScreenList = new ArrayList<screen>();

        System.out.println("—————————————-------------------------------------———— Test[Monostate]Pattern —————————————-------------------------------------————");
        String choice;

        label:
        while (true) {
            System.out.println("┌────────────────────────   Monostate Test   ─────────────────────────┐");
            System.out.println("│          1 --- Create the security group                            │");
            System.out.println("│          2 --- Make an alert                                        │");
            System.out.println("└─────────────────────────────────────────────────────────────────────┘");
            System.out.println("");
            System.out.print("Enter the order [0 to quit]: ");
            Scanner sc = new Scanner(System.in);
            choice = sc.next();
            int i;
            int j;
            switch (choice) {
                case "1":
                    System.out.print("Input the number of security: ");
                    Scanner reader = new Scanner(System.in);
                    i = reader.nextInt();
                    for (j = 1; j <= i; j++) {
                        screen Sc= new screen();
                        Sc.getContext();
                        ScreenList.add(Sc);
                        System.out.println("Security" + j + "'s Screen: " + Sc.getContext());
                    }
                    break;
                case "2":
                    Scanner input = new Scanner(System.in);
                    System.out.print("Input which one is in trouble：");
                    try {
                        int security_no = input.nextInt();
                        if (security_no > 0 && security_no <= ScreenList.size() + 1) {
                            String no = "SECURITY "+security_no+" IN TROUBLE!";

                            ScreenList.get(security_no - 1).setContent(no);
                            for (j = 1; j <= ScreenList.size(); j++) {
                                System.out.println("Security" + j + "'s screen: " + ScreenList.get(security_no - 1).getContext());
                            }
                        } else {
                            System.out.println("Invalid Input.\n");
                        }
                    } catch (ArrayIndexOutOfBoundsException | InputMismatchException e) {
                        System.out.println("Invalid Input.\n");
                        System.out.println("");
                    }

                    break;
                case "0":
                    break label;
                default:
                    System.out.println("Invalid Input.\n");
                    break;
            }
        }

        System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");

    }


    public static void main(String[] args) {
        MonostateTest.runTest();
    }


}
