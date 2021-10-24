package Test.DesignPatternTests;

import Settings.CoffeeFactory.personnel.staff.Maintainer.Maintainer;
import Settings.CoffeeFactory.machine.Machine;
import Settings.CoffeeFactory.machine.processmachine.ProcessMachine;
import Settings.CoffeeFactory.machine.processmachine.productmachine.ProductMachine;
import Settings.CoffeeFactory.machine.processmachine.productmachine.coffeemachine.CoffeeBasicMachine;
import Settings.CoffeeFactory.machine.processmachine.productmachine.coffeemachine.CoffeeArabicaMachine;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;


public class ChainOfResponsibilityTest {

    public static void main(String[] args)  throws IOException  {
        System.out.println("");
        System.out.println("┌────────────────── Chain of responsibility Test   ───────────────────────┐");
        System.out.println("│            1. A machine is broken.                                      │");
        System.out.println("│            2. You can set the broken level.                             │");
        System.out.println("│            3. There are four maintainer who has different abilities.    │");
        System.out.println("│            4. Find if there is maintainer who can fix the problem.      │");
        System.out.println("└─────────────────────────────────────────────────────────────────────────┘");
        System.out.println("\n");
        System.out.println("***************************************************************************");
        System.out.println("****************************------NOTE------*******************************");
        System.out.println("* broken level: [0~25]  can be fixed by an InternshipMaintainer           *");
        System.out.println("*               [26~50] can be fixed by a FreshmanMaintainer              *");
        System.out.println("*               [51~75] can be fixed by a SkilledMaintainer               *");
        System.out.println("*               [76~100]can be fixed by a SeasonedMaintainer              *");
        System.out.println("*               [101,+∞]cannot be fixed                                   *");
        System.out.println("***************************************************************************");

        int brokelevel;

        System.out.println("\n OOOps! Coffee arabica machine is broken...");

        CoffeeArabicaMachine machine1 = new CoffeeArabicaMachine();

        while(true) {
            System.out.println("\n Please set the broke level(-1 to exit):");
            Scanner input = new Scanner(System.in);
            brokelevel = input.nextInt();
            if (brokelevel < 0)
                break;

            machine1.markFault(brokelevel);

            System.out.println("\nPress ENTER to fix it...");
            new BufferedReader(new InputStreamReader(System.in)).readLine();

            machine1.fix();

            System.out.println("\n Would you like to run the test again?(Y/N):");

            Scanner input2 = new Scanner(System.in);
            String str = input2.nextLine();
            if (str.charAt(0) == 'N' || str.charAt(0) == 'n')
                break;
        }

        System.out.println("\nTry to fix it again...\n");
        machine1.fix();

    }
}
