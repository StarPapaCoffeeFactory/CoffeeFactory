package Test.DesignPatternTests;

import java.util.Scanner;

import Settings.CoffeeFactory.supplement.handmadeTool.handmadeToolFactory;
import Settings.CoffeeFactory.areas.publicarea.ExperienceRoom;


/**
 * @author Zhang PeiZhi
 * @description Test for copy on write design pattern
 */
public class COWTest {
    public static void main(String[] args) {

        ExperienceRoom[] experienceRooms = new ExperienceRoom[2];
        experienceRooms[0] = new ExperienceRoom();
        experienceRooms[1] = new ExperienceRoom();
        System.out.println("Have created two experience rooms successfully!\n");

        System.out.println("┌─────────────────────   Copy On Write Test   ───────────────────────┐");
        System.out.println("│        0 --- Quit                                                  │");
        System.out.println("│        1 --- Show the reference count of default Tool              │");
        System.out.println("│        2 --- Change tool description in room [0]                   │");
        System.out.println("│        3 --- Change tool description in room [1]                   │");
        System.out.println("│        4 --- Show tool description in room [0]                     │");
        System.out.println("│        5 --- Show tool description in room [1]                     │");
        System.out.println("│        6 --- Show tool serial number in room [0]                   │");
        System.out.println("│        7 --- Show tool serial number in room [1]                   │");
        System.out.println("└────────────────────────────────────────────────────────────────────┘");

        Scanner input = new Scanner(System.in);
        int command;
        boolean flag = true;

        do {
            System.out.println("");
            System.out.print("Enter the order [0 to quit]:");
            command = input.nextInt();


            switch (command) {
                case 0:
                    flag = false;
                    break;
                case 1: {
                    System.out.println(handmadeToolFactory.getDefaultHandmadeTool().getUsageCount());
                    break;
                }
                case 2: {
                    System.out.println("Please enter a new description for the tool in room[0]:");
                    Scanner scan = new Scanner(System.in);
                    String str = scan.nextLine();
                    experienceRooms[0].setToolDescription(str);
                    System.out.println("You have changed the tool description in room [0].");
                    break;
                }
                case 3: {
                    System.out.println("Please enter a new description for the tool in room[1]:");
                    Scanner scan = new Scanner(System.in);
                    String str = scan.nextLine();
                    experienceRooms[1].setToolDescription(str);
                    System.out.println("You have changed the tool description in room [1].");
                    break;
                }
                case 4: {
                    System.out.println("The description for the tool in room[0] is:\n");
                    System.out.println(experienceRooms[0].getToolDescription());
                    break;
                }
                case 5: {
                    System.out.println("The description for the tool in room[1] is:\n");
                    System.out.println(experienceRooms[1].getToolDescription());
                    break;
                }
                case 6: {
                    System.out.println("The serial number of the tool in room [0] is: ");
                    System.out.println(experienceRooms[0].getTool().getSerialNumber());
                    break;
                }
                case 7: {
                    System.out.println("The serial number of the tool in room [1] is: ");
                    System.out.println(experienceRooms[1].getTool().getSerialNumber());
                    break;
                }
                default:{
                    System.out.println("Invalid command. Please try again.");
                }
            }
        } while (flag);
    }

}
