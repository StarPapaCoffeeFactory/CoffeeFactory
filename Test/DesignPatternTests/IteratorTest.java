package Test.DesignPatternTests;

import Settings.CoffeeFactory.areas.ManufacturingArea.Workshop.CoffeeWorkshop;
import Settings.CoffeeFactory.areas.StaffArea.Office;
import Settings.CoffeeFactory.areas.WorkerIterator.WorkerListIterator;
import Settings.CoffeeFactory.personnel.Personnel;
import Settings.CoffeeFactory.personnel.staff.LogisticsAdministrator;
import Settings.CoffeeFactory.personnel.staff.Manager;
import Settings.CoffeeFactory.personnel.staff.worker.worker;

import java.util.Scanner;

public class IteratorTest {

    public static void main(String[] args) {
        System.out.println("We will test the Iterator design model");
        System.out.println("");
        System.out.println("┌─────────────────────────   Iterator Test   ──────────────────────────┐");
        System.out.println("│               0. Exit!!!                                             │");
        System.out.println("│               1. Get the first workers in the Coffee                 │");
        System.out.println("│               2. Get the next workers in the Coffee                  │");
        System.out.println("│               3. Traverse all staff of the staffs in the office      │");
        System.out.println("└──────────────────────────────────────────────────────────────────────┘");
        System.out.println("");

        // create a coffee workshop and add 3 workers.
        CoffeeWorkshop coffeeWorkshop = new CoffeeWorkshop();
        coffeeWorkshop.addWorker(new worker("Anna", 22, Personnel.Gender.female, "12345678909", 10000));
        coffeeWorkshop.addWorker(new worker("Billie", 19, Personnel.Gender.male, "12345678908", 20000));
        coffeeWorkshop.addWorker(new worker("Justin", 24, Personnel.Gender.male, "12345678907", 30000));
        WorkerListIterator workerIterator = new WorkerListIterator();
        workerIterator.setWorkerList(coffeeWorkshop.getWorkerList());
        worker firstStaff;

        // create an office and add 3 staffs.
        Office office = new Office();
        WorkerListIterator staffIterator = new WorkerListIterator();
        staffIterator.setWorkerList(office.getWorkerList());
        office.addWorker(new LogisticsAdministrator("Brian", 20, Personnel.Gender.male, "12345678906",50000));
        office.addWorker(new LogisticsAdministrator("Kerr", 20, Personnel.Gender.female, "12345678905",50000));
        office.addWorker(new LogisticsAdministrator("Young", 20, Personnel.Gender.male, "12345678904",50000));
        Manager currentStaff;

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

                }
            }
        }while(flag);

        System.out.println("Iterator Design Mode Finished");
    }

}