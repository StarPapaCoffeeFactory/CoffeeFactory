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

        System.out.println("");
        System.out.println("┌─────────────────────────   Facade Test   ──────────────────────────┐");
        System.out.println("│                  1.                                                │");
        System.out.println("│                  2.      this is a  test                           │");
        System.out.println("│                  3.                                                │");
        System.out.println("└────────────────────────────────────────────────────────────────────┘");
        System.out.println("");

        //在此初始化一批machine
        List<Machine> machines = new ArrayList<>(){{
            add(new SCAR("test machine" , "123" ));

        }};
        //在此初始化一批handmadetool
        List<handmadeTool> tools = new ArrayList<>(){{
            add(new handmadeTool());
        }};


        logisticsWork someWork = new logisticsWork(machines, tools);
        LogisticsManager logisManager = new LogisticsManager("YXJ" , 22 , Personnel.Gender.male , "1234567894" , 1000);
        System.out.println("打印后期管理员基本信息：");
        logisManager.display();
        System.out.println("为该后勤管理员设置工作任务...");
        logisManager.setWorks(someWork);

        logisManager.checkMachines();
        logisManager.checkTools();
        logisManager.submitReport();

//        facade end

    }
}
