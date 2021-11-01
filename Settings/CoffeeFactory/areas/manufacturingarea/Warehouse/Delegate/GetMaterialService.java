package Settings.CoffeeFactory.areas.manufacturingarea.Warehouse.Delegate;

import Settings.CoffeeFactory.areas.manufacturingarea.Warehouse.Warehouse;
import Settings.CoffeeFactory.material.Material;

/***
 * @author ZJX
 * @description A warehouse service that assists in picking up materials from a warehouse.
 */
public class GetMaterialService implements WarehouseService{

    /***
     * @param warehouse
     * @param Material
     * @return void
     * @author ZJX
     * @description Take materials from the warehouse
     */
    @Override
    public void doProcessing(Warehouse warehouse, Material Material)
    {
        boolean judge = warehouse.useMaterial(Material.getClass().getName(), 1.0);
        if(judge == true) {
            System.out.println("Finish pickup service for " + Material.getClass().getName());
        }
        else{
            System.out.println("Getting material failed!!!");
        }
    }
}
