package Test.DesignPatternTests;

/**
 * @ program: coffeefactory
 * @ description:
 * @ author: YXJ
 * @ date: 2021-10-15 12:55:29
 */


import Settings.CoffeeFactory.machine.Machine;
import Settings.CoffeeFactory.machine.transportmachine.SCAR;
import Settings.CoffeeFactory.management.logistics.logisticsWork;
import Settings.CoffeeFactory.personnel.Personnel;
import Settings.CoffeeFactory.personnel.staff.LogisticsAdministrator;
import Settings.CoffeeFactory.supplement.handmadeTool.handmadeTool;

import java.util.ArrayList;
import java.util.List;

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

        SCAR m1 = new SCAR("Blender Machine" , "101" );
        SCAR m2 = new SCAR("Blender Machine" , "102" );
        SCAR m3 = new SCAR("Blender Machine" , "103" );
        SCAR m4 = new SCAR("Blender Machine" , "104" );
        SCAR m5 = new SCAR("Blender Machine" , "105" );
        m1.setBroken(true);
        m4.setBroken(true);
        List<Machine> machines = new ArrayList<Machine>(){{
            add(m1 );
            add(m2 );
            add(m3 );
            add(m4 );
            add(m5 );
        }};
        //在此初始化一批handmadetool
        List<handmadeTool> tools = new ArrayList<handmadeTool>(){{
            add(new handmadeTool());
        }};


        logisticsWork someWork = new logisticsWork(machines, tools);
        LogisticsAdministrator logisticsAdministrator = new LogisticsAdministrator("Yuanxinjie" , 22 , Personnel.Gender.male , "1234567894" , 1000);
        System.out.println("Print basic information of the logistics administrator:");
        logisticsAdministrator.display();
        System.out.println();
        System.out.println("Set work tasks for the logistics administrator...");
        logisticsAdministrator.setWorks(someWork);
        System.out.println("work setup completed , start logistics check tasks...");
        System.out.println();
        logisticsAdministrator.checkMachines();
        System.out.println();
        logisticsAdministrator.checkTools();
        System.out.println();
        logisticsAdministrator.submitReport();
        System.out.println();
        System.out.println("logistics check tasks completed");
        System.out.println("");
        System.out.println("───────────────────End of the facade test───────────────────────");

    }
}
