package Settings.CoffeeFactory.areas.ManufacturingArea.Warehouse.Delegate;

import Settings.CoffeeFactory.areas.ManufacturingArea.Warehouse.Warehouse;
import Settings.CoffeeFactory.material.Material;

/***
 * @author ZJX
 * @description Interface to the warehouse service
 */
public interface WarehouseService {
    public void doProcessing(Warehouse warehouse, Material material);
}
