package Settings.CoffeeFactory.areas.ManufacturingArea.Warehouse.Delegate;

import Settings.CoffeeFactory.areas.ManufacturingArea.Warehouse.Warehouse;
import Settings.CoffeeFactory.material.Material;

//仓库服务的接口
public interface WarehouseService {
    public void doProcessing(Warehouse warehouse, Material Material);
}
