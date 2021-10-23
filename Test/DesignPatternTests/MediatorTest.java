package Test.DesignPatternTests;

/**
 * @author LouTianyu
 * @description Test for Mediator
 */


import Settings.CoffeeFactory.areas.StaffArea.Office;
import Settings.CoffeeFactory.personnel.Personnel;
import Settings.CoffeeFactory.personnel.staff.Manager;

import java.util.Scanner;

/**
 * @author Zheng
 * @project chocolateFactory
 * @classname MediatorTest
 * @description MediatorTest
 * @date 2020/11/22 10:14
 */
public class MediatorTest {

    public static void main(String[] args) {
        System.out.println("------------------------------------ [Mediator] Test ------------------------------------");

        System.out.println("");
        System.out.println("GeneralManager : getInstance() : Get the only instance of the general manager " +
                "and create an instance if there's none,");
        System.out.println("Manager : getOfficeManager() : Get office's manager which is single.");
        System.out.println("Manager : hireWorker() : Add workers to a specific department.");
        System.out.println("Manager : dispatchTask() : Manager dispatch the task that general manager dispatch to him to the office workers.");
        System.out.println("");

        System.out.println("First, we need to create an office... ");
        Office office = new Office();
        System.out.println("Next, we should get the instance of the office manager...");
        Manager officeManager = Manager.getOfficeManager();

        System.out.println("Then, office manager should hired some office workers... ");
        officeManager.hireWorker("worker1", Personnel.Gender.male, 18, 10, office);
        officeManager.hireWorker("worker2", Person.Sex.FEMALE, 22, 10, office);
        officeManager.hireWorker("worker3", Person.Sex.MALE, 20, 10, office);

        System.out.println("");
        System.out.println("*******************                        Mediator Test                           *******************");
        System.out.println("*** 1. Office manager dispatch the task that general manager dispatch to him to the office workers ***");
        System.out.println("*** 2. Office manager send feedback received from workers to the general manager                   ***");
        System.out.println("***                                                                                                ***");
        System.out.println("******************************************************************************************************");
        System.out.println("");

        Scanner input = new Scanner(System.in);
        int op;
        boolean flag = true;

        do {
            System.out.println("");
            System.out.print("Enter the order [0 to quit]:");
            op = input.nextInt();


            switch (op) {
                case 0:
                    flag = false;
                    break;
                case 1: {
                    officeManager.dispatchTask();
                    break;
                }
                case 2: {
                    officeManager.getFeedBack();
                    break;
                }

                default: {
                    System.out.println("Invalid Input, Please input again.");
                }
            }
        } while (flag);
    }

}
