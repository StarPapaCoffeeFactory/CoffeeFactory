package Settings.CoffeeFactory.areas.manufacturingarea.Warehouse.Delegate;

import Settings.CoffeeFactory.areas.manufacturingarea.Warehouse.Warehouse;
import Settings.CoffeeFactory.material.Material;

/***
 * @author ZJX
 * @description Use the design pattern Business Delegate
 * The client can access the warehouse's services through this delegate class
 */
public class WarehouseDelegate {
    /***
     * @author ZJX
     * @description Creating LookUp Service
     */
    private WarehouseLookup lookupService = new WarehouseLookup();

    /***
     * @author ZJX
     * @description Creating Business Service
     */
    private WarehouseService warehouseService;

    /***
     * @author ZJX
     * @description The warehouse is connected to the business service
     */
    private final Warehouse warehouse;

    /***
     * @author ZJX
     * @description Service type
     */
    private String serviceType;

    public WarehouseDelegate(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    /***
     * @param serviceType
     * @return
     * @author ZJX
     * @description
     * set the current service of warehouse:
     * 1. GetMaterial
     * 2. StorageMaterial
     */
    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    /***
     * @param material
     * @return
     * @author ZJX
     * @description Perform the service
     */
    public void doTask(Material material) {
        if (serviceType == null) {
            System.out.println("Please setting the type of service first.");
            return;
        }
        warehouseService = lookupService.getWarehouseService(serviceType);
        if (warehouseService != null) {
            warehouseService.doProcessing(warehouse, material);
        }
        else {
            System.out.println("There is no such service!");
        }
    }
}
