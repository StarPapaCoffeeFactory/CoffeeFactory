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
//        facade test

        System.out.println();
        System.out.println("┌─────────────────────────   Facade Test   ──────────────────────────┐");
        System.out.println("│                  1. Initialize a logistic administrator            │");
        System.out.println("│                  2. Initialize the logistic work task              │");
        System.out.println("│                  3. set the work for the administrator             │");
        System.out.println("│                  4. let the administrator do his work              │");
        System.out.println("│                  5. submit the work report                         │");
        System.out.println("└────────────────────────────────────────────────────────────────────┘");
        System.out.println();

        //在此初始化一批machine
        List<Machine> machines = new ArrayList<>(){{
            add(new SCAR("test machine" , "123" ));

        }};
        //在此初始化一批handmadetool
        List<handmadeTool> tools = new ArrayList<>(){{
            add(new handmadeTool());
        }};


        logisticsWork someWork = new logisticsWork(machines, tools);
        LogisticsAdministrator logisticsAdministrator = new LogisticsAdministrator("Yuanxinjie" , 22 , Personnel.Gender.male , "1234567894" , 1000);
        System.out.println("Print basic information of the logistics administrator:");
        logisticsAdministrator.display();
        System.out.println("Set work tasks for the logistics administrator...");
        logisticsAdministrator.setWorks(someWork);
        System.out.println("work setup completed , start logistics check tasks...");
        logisticsAdministrator.checkMachines();
        logisticsAdministrator.checkTools();
        logisticsAdministrator.submitReport();
        System.out.println("logistics check tasks completed");
        System.out.println("");
        System.out.println("───────────────────End of the facade test───────────────────────");

    }
}
