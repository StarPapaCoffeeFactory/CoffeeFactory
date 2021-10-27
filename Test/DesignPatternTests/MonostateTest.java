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
        System.out.println("Screen : setContent(String content) : Set the information show on the Screen");
        System.out.println("Screen : showContent() : Show the information");
        System.out.println("");

        String choice;

        label:
        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("┌────────────────────────   Monostate Test   ─────────────────────────┐");
            System.out.println("│          1 --- Create the guard group                               │");
            System.out.println("│          2 --- Make an alert                                        │");
            System.out.println("│          # --- Exit                                                 │");
            System.out.println("└─────────────────────────────────────────────────────────────────────┘");
            System.out.println("");

            choice = sc.next();
            int i;
            int j;
            switch (choice) {
                case "1":
                    System.out.print("Input how many guards you want to have：");
                    Scanner reader = new Scanner(System.in);
                    i = reader.nextInt();
                    for (j = 1; j <= i; j++) {
                        screen Sc= new screen();
                        Sc.getContext();
                        ScreenList.add(Sc);

                        System.out.println("Guard" + j + "'s Screen: " + Sc.getContext());
                    }
                    break;
                case "2":
                    Scanner input = new Scanner(System.in);
                    Scanner sc1 = new Scanner(System.in);
                    System.out.print("Input which Guard to make an alert：");
                    try {
                        int guard_num = input.nextInt();
                        if (guard_num > 0 && guard_num <= ScreenList.size() + 1) {
                            System.out.print("Input the alert：");
                            String no = sc1.next();

                            ScreenList.get(guard_num - 1).setContent(no);
                            for (j = 1; j <= ScreenList.size(); j++) {

                                System.out.println("Guard" + j + "'s screen: " + ScreenList.get(guard_num - 1).getContext());
                            }
                        } else {
                            System.out.println("Invalid Input, Please input again.\n");
                        }
                    } catch (ArrayIndexOutOfBoundsException | InputMismatchException e) {
                        System.out.println("Invalid Input, Please input again.\n");
                        System.out.println("");
                    }

                    break;
                case "#":
                    break label;
                default:
                    System.out.println("Invalid Input, Please input again.\n");
                    break;
            }
        }

        System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");

    }


    public static void main(String[] args) {
        MonostateTest.runTest();
    }


}
