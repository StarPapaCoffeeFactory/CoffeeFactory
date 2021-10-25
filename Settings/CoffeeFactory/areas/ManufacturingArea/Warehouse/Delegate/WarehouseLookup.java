package Settings.CoffeeFactory.areas.ManufacturingArea.Warehouse.Delegate;

//查找仓库服务，若找到，则返回相应对象
public class WarehouseLookup {

    public WarehouseService getWarehouseService(String serviceType) {
        if (serviceType.equalsIgnoreCase("GetMaterial")) {
            return new GetMaterialService();
        }
        if (serviceType.equalsIgnoreCase("StorageMaterial")) {
            return new StorageMaterialService();
        }
        return null;
    }
}
