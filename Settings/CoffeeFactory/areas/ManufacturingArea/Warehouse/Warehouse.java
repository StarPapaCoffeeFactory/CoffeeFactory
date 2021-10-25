package Settings.CoffeeFactory.areas.ManufacturingArea.Warehouse;

import Settings.CoffeeFactory.areas.AreaName;
import Settings.CoffeeFactory.areas.ManufacturingArea.ManufacturingArea;
import Settings.CoffeeFactory.areas.Visitor.Visitor;
import Settings.CoffeeFactory.personnel.staff.Manager;

import java.util.HashMap;

//存放原料和产品的仓库
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


    //返回区域的名字
    @Override
    public String toString() {
        return AreaName.WAREHOUSE;
    }

    //当其他类需要使用材料时，将调用该方法来修改材料的数量
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

    //增加材料的数量
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

    //在仓库里增加一种新的材料
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

    //删除仓库中的一种材料
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

    //得到每种材料的数量
    public HashMap<String, Double> getMaterialList() {
        return new HashMap<>(materialAmount);
    }

    //Visitor
    public void accept(Visitor v) {
        v.visit(this);
    }
}
