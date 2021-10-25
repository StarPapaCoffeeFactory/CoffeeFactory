package Settings.CoffeeFactory.areas.ManufacturingArea.Warehouse.Delegate;

import Settings.CoffeeFactory.areas.ManufacturingArea.Warehouse.Warehouse;
import Settings.CoffeeFactory.material.Material;
import Settings.CoffeeFactory.personnel.staff.Manager;

//一种帮助从仓库取材料的仓库服务
public class GetMaterialService implements WarehouseService{
    @Override
    public void doProcessing(Warehouse warehouse, Material Material)
    {
        boolean judge = warehouse.useMaterial(Material.toString(), 1.0);
        if(judge == true) {
            System.out.println("Finish pickup service for " + Material.toString());
        }
        else{
            System.out.println("Getting material failed!!!");
        }
    }
}
