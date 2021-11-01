package Settings.CoffeeFactory.areas.manufacturingarea.warehouse.delegate;

import Settings.CoffeeFactory.areas.manufacturingarea.warehouse.Warehouse;
import Settings.CoffeeFactory.material.Material;

/***
 * @author ZJX
 * @description Interface to the warehouse service
 */
public interface WarehouseService {
    public void doProcessing(Warehouse warehouse, Material material);
}
