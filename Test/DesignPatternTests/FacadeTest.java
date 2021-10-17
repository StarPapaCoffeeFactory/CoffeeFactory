package Test.DesignPatternTests;

/**
 * @ program: coffeefactory
 * @ description:
 * @ author: YXJ
 * @ date: 2021-10-15 12:55:29
 */
import Settings.CoffeeFactory.machine.*;
import Settings.CoffeeFactory.machine.transportmachine.SCAR;
import Settings.CoffeeFactory.machine.transportmachine.TransportMachine;
import Settings.CoffeeFactory.management.logistics.logisticsWork;
import Settings.CoffeeFactory.personnel.Personnel;
import Settings.CoffeeFactory.supplement.handmadeTool.handmadeTool;
import Settings.CoffeeFactory.personnel.staff.*;
import java.util.*;

public class FacadeTest {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("┌─────────────────────────   Facade Test   ──────────────────────────┐");
        System.out.println("│                  1.                              │");
        System.out.println("│                  2.                    │");
        System.out.println("│                  3.                          │");
        System.out.println("└────────────────────────────────────────────────────────────────────┘");
        System.out.println("");

        List<Machine> machines = new ArrayList<>(){{
            add(new SCAR("test machine" , "123" ));

        }};
        List<handmadeTool> tools = new ArrayList<>(){{
            add(new handmadeTool());
        }};
        logisticsWork someWork = new logisticsWork(machines, tools);
        LogisticsManager logisManager = new LogisticsManager("YXJ" , 22 , Personnel.Gender.male , "1234567894" , 1000);

        logisManager.setWorks(someWork);

        logisManager.checkMachines();
        logisManager.checkTools();
        logisManager.submitReport();


    }
}
