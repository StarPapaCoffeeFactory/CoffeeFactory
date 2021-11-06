package Test.DesignPatternTests;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import Settings.CoffeeFactory.personnel.ChiefManager;

/**
 * @author Chen ZeQi
 * @description test for Singleton
 */
public class SingletonTest {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("┌─────────────────────────   Singleton Test   ───────────────────────┐");
        System.out.println("│            1. Theoretically, there is only on Chief manager.       │");
        System.out.println("│            2. Create some Chief managers by getting instance.      │");
        System.out.println("│            3. Check whether they are the same one!                 │");
        System.out.println("└────────────────────────────────────────────────────────────────────┘");
        System.out.println("");

        Scanner input = new Scanner(System.in);


        do{
            System.out.println("\nInput 1 to create a Chief manager object(0 exit):");
            String str = input.nextLine();
            if(str.length()==1&&str.charAt(0)=='1') {
                ChiefManager chiefmanager = null;
                chiefmanager = ChiefManager.getInstance();
                System.out.println("Get instance successfully. Display :");
                chiefmanager.display();
            }
            else if(str.length()==1&&str.charAt(0)=='0') {
                break;
            }

        }while(true);

        //in case of inputting 0 directly
        ChiefManager chiefmanager = null;
        chiefmanager = ChiefManager.getInstance();

        System.out.println("\n\nNow, get two instances,check if the are the same:");
        ChiefManager chiefmanager1 = null, chiefmanager2 = null;
        chiefmanager1=ChiefManager.getInstance();
        chiefmanager2=ChiefManager.getInstance();
        System.out.println("The result of (chiefmanager1==chiefmanager2) is:"+(chiefmanager1==chiefmanager2));

        System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");

    }
}
