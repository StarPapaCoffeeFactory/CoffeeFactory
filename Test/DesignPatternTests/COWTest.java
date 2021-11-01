package Test.DesignPatternTests;

import Settings.CoffeeFactory.supplement.handmadeTool.handmadeToolFactory;
import Settings.CoffeeFactory.areas.publicarea.ExperienceRoom;

import java.util.Scanner;


public class COWTest {
    public static void main(String[] args) {

        final String HINT = "\n"
                + "************************* Copy on Write Test **************************\n"
                + "***                                                                 ***\n"
                + "***            0. Quit                                              ***\n"
                + "***            1. Display the Reference Count of Defalut Tool       ***\n"
                + "***            2. Modify Tool Description in Room 0                 ***\n"
                + "***            3. Modify Tool Description in Room 1                 ***\n"
                + "***            4. Display Tool Batch Number in Room 0               ***\n"
                + "***            5. Display Tool Batch Number in Room 1               ***\n"
                + "***                                                                 ***\n"
                + "***Tips: Every time you modify a unmodified tool, you will trigger  ***\n"
                + "***        Copy on Write. Every time you triggered Copy on Write, a ***\n"
                + "***        line of \"Copy Handmade Tool!\" will be printed. And the ***\n"
                + "***        reference count of default tool is decreased by 1.       ***\n"
                + "***      The batch number of both tools should ALWAYS BE THE SAME.  ***\n"
                + "***********************************************************************\n";


        /*
        System.out.println(
                "------------------------------------ [Copy on Write] Test ------------------------------------");

        System.out.println("");
        System.out.println("HandmadeTool : getBatchNumber() : Get batch number.");
        System.out.println("HandmadeTool : getRefCount() : Get reference counter.");
        System.out.println(
                "HandmadeToolFactory : getDefaultHandmadeTool() : Get default instance of HandmadeTool.");
        System.out.println(
                "ExperienceRoom : getTool() : Get instance of HandmadeTool in this ExperienceRoom.");
        System.out.println(
                "ExperienceRoom: setToolDescription(description: String): Set the description of the tool.");
        System.out.println("");
        */

        ExperienceRoom[] experienceRooms = new ExperienceRoom[2];
        experienceRooms[0] = new ExperienceRoom();
        experienceRooms[1] = new ExperienceRoom();
        System.out.println("Creat two experience rooms successfully!\n");

        System.out.println("┌─────────────────────   Copy On Write Test   ───────────────────────┐");
        System.out.println("|        0 --- Quit                                                  |");
        System.out.println("|        1 --- Display the Reference Count of Defalut Tool           |");
        System.out.println("|        2 --- Modify Tool Description in Room 0                     |");
        System.out.println("|        3 --- Modify Tool Description in Room 1                     |");
        System.out.println("|        4 --- Display Tool Batch Number in Room 0                   |");
        System.out.println("|        5 --- Display Tool Batch Number in Room 1                   |");
        System.out.println("└────────────────────────────────────────────────────────────────────┘");

        Scanner input = new Scanner(System.in);
        int op;
        boolean flag = true;

        do {
            System.out.println("");
            System.out.print("Enter the order [0 to quit]:");//[0] to quit
            op = input.nextInt();


            switch (op) {
                case 0:
                    flag = false;
                    break;
                case 1: {
                    System.out.println(handmadeToolFactory.getDefaultHandmadeTool().getStock());
                    break;
                }
                case 2: {
                    experienceRooms[0].setToolDescription("New Description for 0.");
                    System.out.println("Tool description modified in room 0.");
                    break;
                }
                case 3: {
                    experienceRooms[1].setToolDescription("New Description for 1.");
                    System.out.println("Tool description modified in room 1.");
                    break;
                }
                case 4: {
                    System.out.println(experienceRooms[0].getTool().getBatchNumber());
                    break;
                }
                case 5: {
                    System.out.println(experienceRooms[1].getTool().getBatchNumber());
                    break;
                }
                default:{
                    System.out.println("Invalid command. Please try again.");
                }
            }
        } while (flag);
    }

}
