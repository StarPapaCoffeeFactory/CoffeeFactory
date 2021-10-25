package Settings.CoffeeFactory.areas.ManufacturingArea.Warehouse.Delegate;

import Settings.CoffeeFactory.material.Material;

//展示层
public class WarehouseClient {
    WarehouseDelegate warehouseDelegate;

    public WarehouseClient(WarehouseDelegate warehouseDelegate) {
        this.warehouseDelegate = warehouseDelegate;
        showServiceList();
    }

    //通过调用此方法，将应用仓库的服务
    public void doTask(Material Material) {
        warehouseDelegate.doTask(Material);
    }

    public static void showServiceList() {
        System.out.println("");
        System.out.println("┌─────────────────────────   Warehouse Service List   ──────────────────────────┐");
        System.out.println("│               1. Testing the get material service                             │");
        System.out.println("│               2. Testing the storage material service                         │");
        System.out.println("└───────────────────────────────────────────────────────────────────────────────┘");
        System.out.println("");
    }
}
