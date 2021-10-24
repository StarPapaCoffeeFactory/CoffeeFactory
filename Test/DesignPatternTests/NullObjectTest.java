package Test.DesignPatternTests;

import Settings.CoffeeFactory.personnel.Personnel;
import Settings.CoffeeFactory.personnel.staff.EmptyStaff;
import Settings.CoffeeFactory.personnel.staff.Manager;
import Settings.CoffeeFactory.areas.StaffArea.Office;
import java.util.Scanner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


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

        manager.hireWorker("OldWang", Personnel.Gender.male, 45,  26000, "13609884567",office);
        manager.hireWorker("ZhangSan",  Personnel.Gender.male, 27, 13000,"18099775533", office);
        manager.hireWorker("LucyLee", Personnel.Gender.female, 24, 9000, "18655443378",office);
        manager.hireWorker("DavidHuang", Personnel.Gender.male, 33, 16000,"13535435996", office);
        manager.hireWorker("PeterYang", Personnel.Gender.male, 35, 19000,"19833994224", office);

        System.out.println("\nSome workers were added to the office, as shown below: ");

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
