package Settings.CoffeeFactory.management.staff;

import Settings.CoffeeFactory.areas.StaffArea.StaffArea;
import Settings.CoffeeFactory.personnel.Personnel;
import Settings.CoffeeFactory.personnel.staff.worker.worker;


public class WorkerController {

    public static void addWorker(String name, int age, Personnel.Gender gender, String phnum,double salary) {

        worker workerObj;
        if (scene.toString().equals(SceneNameConst.OFFICE)) {
            workerObj = new worker(name, age, sex, salary, scene);
            scene.addWorker(workerObj);
        } else if (scene.toString().equals(SceneNameConst.DINING_ROOM)) {
            workerObj = new DinningRoomWorker(name, age, sex, salary, scene);
            scene.addWorker(workerObj);
        } else if (scene.toString().contains(SceneNameConst.WORKSHOP)) {
            workerObj = new WorkshopWorker(name, age, sex, salary, scene);
            scene.addWorker(workerObj);
        } else if (scene.toString().equals(SceneNameConst.WAREHOUSE)) {
            workerObj = new WarehouseWorker(name, age, sex, salary, scene);
            scene.addWorker(workerObj);
        }

    }

}
