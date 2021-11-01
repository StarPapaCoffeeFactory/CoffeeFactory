package Test.DesignPatternTests;

import Settings.CoffeeFactory.areas.ManufacturingArea.Workshop.Workshop;
import Settings.CoffeeFactory.personnel.Personnel;
import Settings.CoffeeFactory.personnel.staff.Manager;
import Settings.CoffeeFactory.areas.StaffArea.DiningRoom;
import Settings.CoffeeFactory.areas.StaffArea.Office;
import Settings.CoffeeFactory.areas.ManufacturingArea.Warehouse.Warehouse;
import Settings.CoffeeFactory.areas.ManufacturingArea.Workshop.CoffeeWorkshop;
import Settings.CoffeeFactory.areas.ManufacturingArea.Workshop.CoffeeProductWorkshop;

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
        System.out.println("│                         3. Init Warehouse                       │");
        System.out.println("│                         4. Init CoffeeWorkshop                  │");
        System.out.println("│                         5. Init CoffeeProductWorkshop           │");
        System.out.println("│                                                                 │");
        System.out.println("│                                                                 │");
        System.out.println("│      You can select different scenarios, and the workers in the │");
        System.out.println("│      scene will be filled automatically                         │");
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
                case 3: {
                    System.out.println("IOC Pattern: creating warehouse Walker will implicitly create WarehouseWorker：");
                    Warehouse warehouse = new Warehouse();
                    Manager.getWarehouseManager().hireWorker("Winne",  Personnel.Gender.female, 22, 7000, "19824270264",warehouse);
                    warehouse.displayAllStaffs();
                    System.out.println("");
                    break;
                }
                case 4: {
                    System.out.println("IOC Pattern: creating CoffeeWorkshop Walker will implicitly create CoffeeWorkshopWorker：");
                    CoffeeWorkshop coffeeWorkshop = new CoffeeWorkshop();
                    Manager.getWorkShopManager().hireWorker("Davis",  Personnel.Gender.male, 22, 7000, "13916301296", coffeeWorkshop);
                    coffeeWorkshop.displayAllStaffs();
                    System.out.println("");
                    break;
                }
                case 5: {
                    System.out.println("IOC Pattern: creating CoffeeProductWorkshop Walker will implicitly create CoffeeProductWorkshopWorker：");
                    CoffeeProductWorkshop coffeeProductWorkshop = new CoffeeProductWorkshop();
                    Manager.getWorkShopManager().hireWorker("Kevin", Personnel.Gender.male, 22,  7000, "15212312345", coffeeProductWorkshop);
                    coffeeProductWorkshop.displayAllStaffs();
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


