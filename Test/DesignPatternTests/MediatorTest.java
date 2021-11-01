package Test.DesignPatternTests;
import Settings.CoffeeFactory.areas.staffarea.Office;
import Settings.CoffeeFactory.areas.workeriterator.WorkerListIterator;
import Settings.CoffeeFactory.personnel.ChiefManager;
import Settings.CoffeeFactory.personnel.Personnel;
import Settings.CoffeeFactory.personnel.staff.Manager;
import Settings.CoffeeFactory.personnel.staff.Staff;

/**
 * @author LouTianyu
 * @description Test for Mediator
 */
import java.util.Scanner;

/**
 * @author LouTianyu
 * @description Test for Mediator
 */
public class MediatorTest {

    public static void main(String[] args) {
        System.out.println(
                "—————————————-------------------------------------———— Test[Mediator]Pattern —————————————-------------------------------------————");

        System.out.println("");
        System.out.println("GeneralManager : getInstance() : Get the only instance of the general manager " + "and create an instance if there's none,");
        System.out.println("GeneralManager : addManager() : Add an office manager to the list.");
        System.out.println("GeneralManager : distributeWork() : Distribute work to office manager.");
        System.out.println("Manager : getOfficeManager() : Get office's manager.");
        System.out.println("Manager : hireWorker() : Add workers to a specific department.");
        System.out.println("Manager : dispatchTask() : Manager dispatch the task that general manager dispatch to him to the office workers.");
        System.out.println("Manager : getFeedBack() : Manager gets workers' feedback.");
        System.out.println("Manager : reporttoChiefManager() : Manager report feedback from workers to the general manager.");
        System.out.println("");

        System.out.println("");
        System.out.println("┌───────────────────────────────────────────────────   Mediator Test   ─────────────────────────────────────────────────┐");
        System.out.println("│              1.Office manager dispatch the task which chief manager dispatched to him to the office workers           │");
        System.out.println("│              2.Workers appoint a team leader for this task                                                            │");
        System.out.println("│              3.Office manager send feedback received from workers to the general manager                              │");
        System.out.println("└───────────────────────────────────────────────────────────────────────────────────────────────────────────────────────┘");
        System.out.println("");
        //Mediator: Manager here is a mediator, which is the mediator of the worker and the general manager.

        System.out.println("First, we need to create an office and a general manager... ");
        Office office = new Office();
        ChiefManager generalManager = ChiefManager.getInstance(); //Singleton
        System.out.println("Next, we should get the instance of the office manager so that the general manager could distribute work to him ...");
        Manager officeManager = Manager.getOfficeManager();
        generalManager.addManager(officeManager);
        generalManager.distributeWork();
        System.out.println("Then, office manager should hire some workers... ");
        officeManager.hireWorker("worker1", Personnel.Gender.male, 21, 10, "12345", office);
        officeManager.hireWorker("worker2", Personnel.Gender.male, 22, 10, "23456", office);
        officeManager.hireWorker("worker3", Personnel.Gender.male, 19, 10, "34567", office);

        WorkerListIterator workerListIterator = new WorkerListIterator();  //Get an iterator
        workerListIterator.setWorkerList(office.getWorkerList());



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
                    for(int i = 0; i < office.getWorkerList().size(); i++) {
                        System.out.println("Worker " + office.getWorkerList().get(i).getName() + " has received the task.");
                    }
                    break;
                }
                case 2: {
                    System.out.println("Please enter the name of the worker to be the team leader for this task. (Now we have worker1/worker2/worker3)");
                    input.nextLine();
                    String name = input.nextLine();
                    boolean judge = false;
                    Staff searchStaff = workerListIterator.first();
                    while(true){
                        if(searchStaff.getName().equals(name)){
                            judge = true;
                            break;
                        }
                        if(workerListIterator.hasNext())searchStaff = workerListIterator.next();
                        else break;
                    }
                    if(judge == true) System.out.println(name + " has been appointed the team leader");
                    else System.out.println("Don`t find the " + name + "!");
                    break;
                }
                case 3: {
                    officeManager.getFeedBack();
                    officeManager.reporttoChiefManager();
                    break;
                }

                default: {
                    System.out.println("Invalid Input, Please input again!");
                }
            }
        } while (flag);
        System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");
    }

}
