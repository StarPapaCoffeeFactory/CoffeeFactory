package Settings.CoffeeFactory.areas.ManufacturingArea.Warehouse.Delegate;

import Settings.CoffeeFactory.areas.ManufacturingArea.Warehouse.Warehouse;
import Settings.CoffeeFactory.material.Material;

//使用设计模式Business Delegate
//客户端可以通过这个委托类访问仓库的服务
public class WarehouseDelegate {
    /**
     * 创建查询服务（LookUp Service）
     */
    private WarehouseLookup lookupService = new WarehouseLookup();

    /**
     * 创建业务服务（Business Service）
     */
    private WarehouseService warehouseService;

    /**
     * 仓库和业务服务连接起来
     */
    private final Warehouse warehouse;

    /**
     * 服务类型
     */
    private String serviceType;

    public WarehouseDelegate(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    /**
     * set the current service of warehouse:
     * 1. GetMaterial
     * 2. StorageMaterial
     * 设置当前的服务类型
     */
    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    /**
     * 执行服务
     */
    public void doTask(Material material) {
        if (serviceType == null) {
            System.out.println("Please setting the type of service first.");
            return;
        }
        warehouseService = lookupService.getWarehouseService(serviceType);
        if (warehouseService != null) {
            warehouseService.doProcessing(warehouse, material);
        }
        else {
            System.out.println("There is no such service!");
        }
    }
}
