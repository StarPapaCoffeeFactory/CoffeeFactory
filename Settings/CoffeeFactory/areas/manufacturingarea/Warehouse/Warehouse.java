package Settings.CoffeeFactory.areas.manufacturingarea.Warehouse;

import Settings.CoffeeFactory.areas.AreaName;
import Settings.CoffeeFactory.areas.manufacturingarea.ManufacturingArea;
import Settings.CoffeeFactory.areas.visitors.Visitor;
import Settings.CoffeeFactory.personnel.staff.Manager;

import java.util.HashMap;

/***
 * @author ZJX
 * @description This area is used to store raw materials and products
 *
 */
public class Warehouse extends ManufacturingArea{
    protected HashMap<String, Double> materialAmount;
    protected HashMap<String, Integer> productionAmount;

    public Warehouse(String location, double cost, double area)
    {
        super(location, cost, area, Manager.getWarehouseManager());
        Manager.getWarehouseManager().addDepartment(this);
        materialAmount = new HashMap<String, Double>();
        productionAmount = new HashMap<String, Integer>();
    }

    public Warehouse()
    {
        this("Warehouse1", 20000, 2000);
    }


    /**
     * @return String
     * @author ZJX
     * @description Return area name
     */
    @Override
    public String toString() {
        return AreaName.WAREHOUSE;
    }

    /***
     * @param amount
     * @param type
     * @return boolean
     * @author ZJX
     * @description This method is called to reduce the amount of material when other classes need to use it.
     */
    public boolean useMaterial(String type, Double amount) {
        if (!materialAmount.containsKey(type))
        {
            System.out.println("There is no such kind material");
            return false;
        }
        else if (materialAmount.get(type) < amount)
        {
            System.out.println("Amount of the material is not enough");
            return false;
        }
        else
        {
            materialAmount.put(type, materialAmount.get(type) - amount);
            return true;
        }
    }

    /***
     * @param amount
     * @param type
     * @return boolean
     * @author ZJX
     * @description This method is called to add the amount of material.
     */
    public boolean addMaterial(String type, Double amount) {
        if (materialAmount.containsKey(type) && amount >= 0)
        {
            materialAmount.put(type, materialAmount.get(type) + amount);
            System.out.println("Successfully add " + amount + " " + type + " in the warehouse.");
            return true;
        }
        else if(amount >= 0)
        {
            materialAmount.put(type, amount);
            System.out.println("Successfully add " + amount + " " + type + " in the warehouse.");
            return true;
        }
        else
        {
            System.out.println("Adding failed because the amount < 0!");
            return false;
        }
    }

    /***
     * @param kind
     * @return boolean
     * @author ZJX
     * @description This method is called to add a new material to the warehouse.
     */
    public boolean createMaterialKind(String kind) {
        if (materialAmount.containsKey(kind))
        {
            System.out.println("The material already exists.");
            return false;
        }
        else
        {
            materialAmount.put(kind, 0.0);
            return true;
        }
    }

    /***
     * @param kind
     * @return boolean
     * @author ZJX
     * @description This method is called to remove a material from a warehouse that already exists.
     */
    public boolean deleteMaterialKind(String kind)
    {
        if (!materialAmount.containsKey(kind))
        {
            System.out.println("The material not exists.");
            return false;
        }
        else
        {
            materialAmount.remove(kind);
            return true;
        }
    }

    /***
     * @return HashMap<String, Double>
     * @author ZJX
     * @description This method is called to get the quantity of each material.
     */
    public HashMap<String, Double> getMaterialList() {
        return new HashMap<>(materialAmount);
    }

    /***
     * @param v
     * @author ZJX
     * @description The basic function of visitor design model
     */
    public void accept(Visitor v) {
        v.visit(this);
    }
}
