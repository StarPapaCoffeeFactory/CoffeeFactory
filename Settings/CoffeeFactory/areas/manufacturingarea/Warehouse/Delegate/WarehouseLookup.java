package Settings.CoffeeFactory.areas.manufacturingarea.Warehouse.Delegate;

/***
 * @author ZJX
 * @description Find the warehouse service and return the corresponding object if found.
 */
public class WarehouseLookup {

    /***
     * @param serviceType
     * @return WarehouseService
     * @author ZJX
     * @description Returns the corresponding warehouse service object.
     */
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
