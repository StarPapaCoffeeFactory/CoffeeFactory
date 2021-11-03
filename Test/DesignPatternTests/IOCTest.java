package Test.DesignPatternTests;

import Settings.CoffeeFactory.personnel.Personnel;
import Settings.CoffeeFactory.personnel.staff.Manager;
import Settings.CoffeeFactory.areas.staffarea.DiningRoom;
import Settings.CoffeeFactory.areas.staffarea.Office;
import Settings.CoffeeFactory.areas.manufacturingarea.Warehouse.Warehouse;
import Settings.CoffeeFactory.areas.manufacturingarea.Workshop.CoffeeWorkshop;
import Settings.CoffeeFactory.areas.manufacturingarea.Workshop.CoffeeProductWorkshop;

import java.util.Scanner;

/**
 * @author wangling
 * @project CoffeeFactory
 * @classname IOCPatternTest
 * @description By passing different staffareas, we create different workers in our workeraddingcontroller
 * and inject them into our staffarea class to realize our IOC (dependency flipping) function
 * @date 2021/10/26 15:46
 */
public class IOCTest {
    public static void main(String[] args) {
        System.out.println("—————————————-------------------------------------———— Test[IOC]Pattern —————————————-------------------------------------————");
        System.out.println("");
        System.out.println("WorkerAddingController : addWorkerToScene(): void : " +
                "By passing different staffareas, our work is generated internally and then returned.\n" +
                "\n");
        System.out.println("");

        System.out.println("");
        System.out.println("┌─────────────────────────   IOC Test   ──────────────────────────┐");
        System.out.println("│                         1. Init Office                          │");
        System.out.println("│                         2. Init DiningRoom                      │");
        System.out.println("│                                                                 │");
        System.out.println("│                                                                 │");
        System.out.println("│      You can select different areas, and the workers in the     │");
        System.out.println("│      area will be filled automatically                          │");
        System.out.println("└─────────────────────────────────────────────────────────────────┘");
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
                    System.out.println("IOC Pattern: creating office Walker will implicitly create office worker：");
                    Office office = new Office();
                    Manager.getOfficeManager().hireWorker("Tom",  Personnel.Gender.male, 18, 5000, "19812312345",office);
                    office.displayAllStaffs();
                    System.out.println("");
                    break;
                }
                case 2: {
                    System.out.println("IOC Pattern: creating office DiningRoom will implicitly create DinningRoomWorker：");
                    DiningRoom diningRoom = new DiningRoom();
                    Manager.getDiningRoomManager().hireWorker("Lisa", Personnel.Gender.female, 20, 6000, "18912312345",diningRoom);
                    diningRoom.displayAllStaffs();
                    System.out.println("");
                    break;
                }
                default: {
                    System.out.println("Invalid Input, Please input again.");
                }
            }
        } while (flag);
        System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");
    }
}


