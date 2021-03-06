package Test.DesignPatternTests;

import Settings.CoffeeFactory.areas.manufacturingarea.Workshop.CoffeeWorkshop;
import Settings.CoffeeFactory.areas.staffarea.Office;
import Settings.CoffeeFactory.areas.workeriterator.WorkerListIterator;
import Settings.CoffeeFactory.personnel.Personnel;
import Settings.CoffeeFactory.personnel.staff.LogisticsAdministrator;
import Settings.CoffeeFactory.personnel.staff.Staff;
import Settings.CoffeeFactory.personnel.staff.worker.Worker;

import java.util.Scanner;


/***
 * @author ZhangJiXian
 * @description Test for Iterator design model
 */
public class IteratorTest {

    public static void main(String[] args) {
        System.out.println("We will test the Iterator design model");
        System.out.println("");
        System.out.println("┌─────────────────────────   Iterator Test   ────────────────────────┐");
        System.out.println("│             0. Exit!!!                                             │");
        System.out.println("│             1. Get the first workers in the Coffee                 │");
        System.out.println("│             2. Get the next workers in the Coffee                  │");
        System.out.println("│             3. Traverse all staff of the staffs in the office      │");
        System.out.println("└────────────────────────────────────────────────────────────────────┘");
        System.out.println("");

        // create a coffee workshop and add 3 workers.
        CoffeeWorkshop coffeeWorkshop = new CoffeeWorkshop();
        coffeeWorkshop.addWorker(new Worker("Anna", 22, Personnel.Gender.female, "12345678909", 10000));
        coffeeWorkshop.addWorker(new Worker("Billie", 19, Personnel.Gender.male, "12345678908", 20000));
        coffeeWorkshop.addWorker(new Worker("Justin", 24, Personnel.Gender.male, "12345678907", 30000));
        WorkerListIterator workerIterator = coffeeWorkshop.getIterator();
        /*WorkerListIterator workerIterator = new WorkerListIterator();
        workerIterator.setWorkerList(coffeeWorkshop.getWorkerList());*/
        Staff firstStaff;
        Staff nextStaff;

        // create an office and add 3 staffs.
        Office office = new Office();
        office.addWorker(new LogisticsAdministrator("Brian", 20, Personnel.Gender.male, "12345678906",50000));
        office.addWorker(new LogisticsAdministrator("Kerr", 20, Personnel.Gender.female, "12345678905",50000));
        office.addWorker(new LogisticsAdministrator("Young", 20, Personnel.Gender.male, "12345678904",50000));
        WorkerListIterator staffIterator = office.getIterator();
        /*WorkerListIterator staffIterator = new WorkerListIterator();
        staffIterator.setWorkerList(office.getWorkerList());*/
        Staff currentStaff;

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
                    firstStaff = workerIterator.first();
                    System.out.println("Get the first Worker:");
                    System.out.println(" name: " + firstStaff.getName() + " sex: " + firstStaff.getGender() + " age: "
                            + firstStaff.getAge() );
                    break;
                }
                case 2:
                {
                    if(workerIterator.hasNext()){
                        nextStaff = workerIterator.next();
                        System.out.println("Get the next Worker:");
                        System.out.println(" name: " + nextStaff.getName() + " sex: " + nextStaff.getGender() + " age: "
                                + nextStaff.getAge() );
                    }
                    else{
                        System.out.println("Don't have next Worker!!!");
                    }
                    break;
                }
                case 3:
                {
                    currentStaff = staffIterator.first();
                    while (true) {
                        System.out.println("name: " + currentStaff.getName() + " sex: " + currentStaff.getGender() + " age: "
                                + currentStaff.getAge());
                        if (staffIterator.hasNext()) {
                            currentStaff = staffIterator.next();
                        } else {
                            break;
                        }
                    }
                    break;
                }
                default:
                {
                    System.out.println("Invalid Input, Please input again.");
                    break;
                }
            }
        }while(flag);

        System.out.println("Iterator Design Mode Finished");
    }

}
