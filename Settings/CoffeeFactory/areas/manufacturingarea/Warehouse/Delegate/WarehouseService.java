package Settings.CoffeeFactory.areas.manufacturingarea.Warehouse.Delegate;

import Settings.CoffeeFactory.areas.manufacturingarea.Warehouse.Warehouse;
import Settings.CoffeeFactory.material.Material;

/***
 * @author ZJX
 * @description Interface to the warehouse service
 */
public interface WarehouseService {
    public void doProcessing(Warehouse warehouse, Material material);
}
