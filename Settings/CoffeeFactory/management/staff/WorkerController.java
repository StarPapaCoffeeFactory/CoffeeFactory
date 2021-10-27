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
        } else if (area.toString().equals(AreaName.DINING_ROOM)) {
            workerObj = new worker(name, age, gender, phnum, salary, area);
            area.addWorker(workerObj);
        } else if (area.toString().equals(AreaName.WORKSHOP)) {
            workerObj = new worker(name, age, gender, phnum, salary, area);
            area.addWorker(workerObj);
        } else if (area.toString().equals(AreaName.MANUFACTURING_AREA)) {
            workerObj = new worker(name, age, gender, phnum, salary, area);
            area.addWorker(workerObj);
        } else if (area.toString().equals(AreaName.STAFF_AREA)) {
            workerObj = new worker(name, age, gender, phnum, salary, area);
            area.addWorker(workerObj);
        } else if (area.toString().equals(AreaName.COFFEE_EXPERIENCE_ROOM)) {
            workerObj = new worker(name, age, gender, phnum, salary, area);
            area.addWorker(workerObj);
        } else if (area.toString().equals(AreaName.EXHIBITION_AREA)) {
            workerObj = new worker(name, age, gender, phnum, salary, area);
            area.addWorker(workerObj);
        } else if (area.toString().equals(AreaName.PUBLIC_AREA)) {
            workerObj = new worker(name, age, gender, phnum, salary, area);
            area.addWorker(workerObj);
        } else if (area.toString().equals(AreaName.GARBAGE_STATION)) {
            workerObj = new worker(name, age, gender, phnum, salary, area);
            area.addWorker(workerObj);
        } else if (area.toString().equals(AreaName.RESIDENCE)) {
            workerObj = new worker(name, age, gender, phnum, salary, area);
            area.addWorker(workerObj);
        }



    }

}
