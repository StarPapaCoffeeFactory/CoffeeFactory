package Settings.CoffeeFactory.management.staff;

import Settings.CoffeeFactory.areas.AreaName;
import Settings.CoffeeFactory.areas.StaffArea.StaffArea;
import Settings.CoffeeFactory.personnel.Personnel;
import Settings.CoffeeFactory.personnel.staff.worker.worker;


public class WorkerController {

    public static void addWorker(String name, int age, Personnel.Gender gender, String phnum, double salary, StaffArea area) {

        worker workerObj;
        if (area.toString().equals(AreaName.OFFICE)) {
            workerObj = new worker(name, age, gender, phnum, salary, area);
            area.addWorker(workerObj);
        } else if (area.toString().equals(AreaName.OFFICE)) {
            workerObj = new worker(name, age, gender, phnum, salary, area);
            area.addWorker(workerObj);
        } else if (area.toString().equals(AreaName.OFFICE)) {
            workerObj = new worker(name, age, gender, phnum, salary, area);
            area.addWorker(workerObj);
        } else if (area.toString().equals(AreaName.OFFICE)) {
            workerObj = new worker(name, age, gender, phnum, salary, area);
            area.addWorker(workerObj);
        }

    }

}
