package Test.DesignPatternTests;

import Settings.CoffeeFactory.machine.processmachine.packmachine.PackMachine;

import java.util.Scanner;

public class ChainResponsibilityTest {
    public static void main(String[] args) {
        System.out.println("------------------------------------ [Chain of Responsibility] Test ------------------------------------");
        System.out.println("");
        System.out.println("Maintainer:setNext(next:Maintainer) : create next link");
        System.out.println("Maintainer:getNext() : get next link");
        System.out.println("Maintainer:handle(difficulty:int) : The specific process for processing the request");
        System.out.println("|--If the machine can be fixed now, then fixed it.");
        System.out.println("|--If not, pass this task to next maintainer, who is more professional.");
        System.out.println("Machine:fix() : Create a maintainer processing chain and submit the request");
        System.out.println("to the first maintainer of the chain");
        System.out.println("");

        System.out.println("**************************** Chain of Responsibility Test ***************************");
        System.out.println("*** The difficulty is used to describe the broken degree of the machine           ***");
        System.out.println("***   --  0. exit                                                                 ***");
        System.out.println("***   -- (0,25] can be fixed by the InternshipMaintainer                          ***");
        System.out.println("***   -- (25,50] can be fixed by the FreshmanMaintainer                           ***");
        System.out.println("***   -- (50,75] can be fixed by the SkilledMaintainer                            ***");
        System.out.println("***   -- (75,100] cannot be fixed by the SeasonedMaintainer                       ***");
        System.out.println("***   --  other difficulty cannot be fixed                                        ***");
        System.out.println("***   --  Please enter the difficulty                                             ***");
        System.out.println("*************************************************************************************");

        PackMachine packMachine = new PackMachine("PA", "603");
        Scanner input = new Scanner(System.in);

        int difficulty = 0;
        int op;
        while(true)
        {
            System.out.print("Please enter the difficulty [0 to quit]:");
            op = input.nextInt();

            if(op==0)
                break;
            else if(op<=100)
            {
                packMachine.markFault(difficulty);
                break;
            }else
                System.out.println("Invalid Input, Please input again.");
        }
    }
}
