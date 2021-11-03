package Settings.CoffeeFactory.management.staff;

import Settings.CoffeeFactory.areas.AreaName;
import Settings.CoffeeFactory.areas.staffarea.StaffArea;
import Settings.CoffeeFactory.personnel.Personnel;
import Settings.CoffeeFactory.personnel.staff.worker.Worker;


public class WorkerController {

    public static void addWorker(String name, int age, Personnel.Gender gender, String phnum, double salary, StaffArea area) {

        Worker workerObj;
        if (area.toString().equals(AreaName.OFFICE)) {
            workerObj = new Worker(name, age, gender, phnum, salary, area);
            area.addWorker(workerObj);
        } else if (area.toString().equals(AreaName.DINING_ROOM)) {
            workerObj = new Worker(name, age, gender, phnum, salary, area);
            area.addWorker(workerObj);
        } else if (area.toString().equals(AreaName.WORKSHOP)) {
            workerObj = new Worker(name, age, gender, phnum, salary, area);
            area.addWorker(workerObj);
        } else if (area.toString().equals(AreaName.MANUFACTURING_AREA)) {
            workerObj = new Worker(name, age, gender, phnum, salary, area);
            area.addWorker(workerObj);
        } else if (area.toString().equals(AreaName.STAFF_AREA)) {
            workerObj = new Worker(name, age, gender, phnum, salary, area);
            area.addWorker(workerObj);
        } else if (area.toString().equals(AreaName.COFFEE_EXPERIENCE_ROOM)) {
            workerObj = new Worker(name, age, gender, phnum, salary, area);
            area.addWorker(workerObj);
        } else if (area.toString().equals(AreaName.EXHIBITION_AREA)) {
            workerObj = new Worker(name, age, gender, phnum, salary, area);
            area.addWorker(workerObj);
        } else if (area.toString().equals(AreaName.PUBLIC_AREA)) {
            workerObj = new Worker(name, age, gender, phnum, salary, area);
            area.addWorker(workerObj);
        } else if (area.toString().equals(AreaName.GARBAGE_STATION)) {
            workerObj = new Worker(name, age, gender, phnum, salary, area);
            area.addWorker(workerObj);
        } else if (area.toString().equals(AreaName.RESIDENCE)) {
            workerObj = new Worker(name, age, gender, phnum, salary, area);
            area.addWorker(workerObj);
        }



    }

}
