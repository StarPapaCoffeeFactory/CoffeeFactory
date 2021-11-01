package Settings.CoffeeFactory.areas.manufacturingarea.Warehouse.Delegate;

import Settings.CoffeeFactory.areas.manufacturingarea.Warehouse.Warehouse;
import Settings.CoffeeFactory.material.Material;

/***
 * @author ZJX
 * @description A warehousing service that helps store materials in a warehouse.
 */
public class StorageMaterialService implements WarehouseService {

    /***
     * @param warehouse
     * @param Material
     * @return void
     * @author ZJX
     * @description Store materials in the warehouse
     */
    @Override
    public void doProcessing(Warehouse warehouse, Material Material)
    {
        boolean judge = warehouse.addMaterial(Material.getClass().getName(), 1.0);
        if(judge == true){
            System.out.println("Finish storage service for " + Material.getClass().getName());
        }
        else{
            System.out.println("Adding material failed!!!");
        }
    }
}
