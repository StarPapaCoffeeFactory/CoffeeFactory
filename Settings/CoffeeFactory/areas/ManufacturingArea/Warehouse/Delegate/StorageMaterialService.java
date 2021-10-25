package Settings.CoffeeFactory.areas.ManufacturingArea.Warehouse.Delegate;

import Settings.CoffeeFactory.areas.ManufacturingArea.Warehouse.Warehouse;
import Settings.CoffeeFactory.material.Material;

//一种帮助将材料储存在仓库里的仓储服务
public class StorageMaterialService implements WarehouseService {
    @Override
    public void doProcessing(Warehouse warehouse, Material Material)
    {
        boolean judge = warehouse.addMaterial(Material.toString(), 1.0);
        if(judge == true){
            System.out.println("Finish storage service for " + Material.toString());
        }
        else{
            System.out.println("Adding material failed!!!");
        }
    }
}
