package Settings.CoffeeFactory.areas.manufacturingarea.warehouse.delegate;

import Settings.CoffeeFactory.material.Material;

/***
 * @author ZJX
 * @description Presentation layer
 */
public class WarehouseClient {
    WarehouseDelegate warehouseDelegate;

    public WarehouseClient(WarehouseDelegate warehouseDelegate) {
        this.warehouseDelegate = warehouseDelegate;
        showServiceList();
    }

    /***
     * @param Material
     * @return void
     * @author ZJX
     * @description By calling this method, the services of the repository are applied.
     */
    public void doTask(Material Material) {
        warehouseDelegate.doTask(Material);
    }

    /***
     * @author ZJX
     * @description Show service list
     */
    public static void showServiceList() {
        System.out.println("");
        System.out.println("┌─────────────────────────   Warehouse Service List   ──────────────────────────┐");
        System.out.println("│               1. Testing the get material service                             │");
        System.out.println("│               2. Testing the storage material service                         │");
        System.out.println("└───────────────────────────────────────────────────────────────────────────────┘");
        System.out.println("");
    }
}
