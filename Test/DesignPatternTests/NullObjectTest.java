package Test.DesignPatternTests;

import Settings.CoffeeFactory.areas.StaffArea.Office;
import Settings.CoffeeFactory.personnel.Personnel;
import Settings.CoffeeFactory.personnel.staff.Manager;
import Settings.CoffeeFactory.personnel.staff.worker.worker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class NullObjectTest {

    public static void main(String[] args) throws IOException  {


        System.out.println("—————————————-------------------------------------———— Test[NullObject]Pattern —————————————-------------------------------------————");

        //System.out.println("");
        //System.out.println("EmptyStaff : display(): void : show there is no such object");
        //System.out.println("");


        System.out.println("");
        System.out.println("┌─────────────────────────   NullObject Test   ──────────────────────┐");
        System.out.println("│   1.There are some workers added into the office.                  │");
        System.out.println("│   2.You can search a worker by him/her ID.                         │");
        System.out.println("│   3.If the ID does not exist, the Null Object will be called.      │");
        System.out.println("└────────────────────────────────────────────────────────────────────┘");
        System.out.println("");

        Manager manager = Manager.getOfficeManager();
        Office office=new Office();

        System.out.println("\nPress ENTER to add workers...");
        new BufferedReader(new InputStreamReader(System.in)).readLine();

        worker worker1=new worker("OldWang",45, Personnel.Gender.male,  "13609884567",26000, office);
        worker worker2=new worker("ZhangSan",27, Personnel.Gender.male,  "18099775533",13000, office);
        worker worker3=new worker("LucyLee",24, Personnel.Gender.female,  "18655443378",9000, office);
        worker worker4=new worker("DavidHuang",33, Personnel.Gender.male,  "13535435996",16000, office);
        worker worker5=new worker("PeterYang",35, Personnel.Gender.male,  "19833994224",19000, office);
        //office.addWorker(worker1);
        //office.addWorker(worker2);
        //office.addWorker(worker3);
        //office.addWorker(worker4);
        //office.addWorker(worker5);

        manager.hireWorker(worker1,"13609884567",office);
        manager.hireWorker(worker2,"18099775533",office);
        manager.hireWorker(worker3,"18655443378",office);
        manager.hireWorker(worker4,"13535435996",office);
        manager.hireWorker(worker5,"19833994224",office);

        System.out.println("\nSome workers were added to the office.");

        office.displayAllStaffs();


        Scanner input = new Scanner(System.in);

        do{
            System.out.println("\nPlease input the ID you want to search (0 to exit):");
            String Id = input.nextLine();
            if(Id.length()==1&&Id.charAt(0)=='0')
                break;
            System.out.println("\nThe result is: ");
            office.searchStaffById(Id);
        }while(true);


    }

}
