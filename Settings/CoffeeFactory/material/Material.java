package Settings.CoffeeFactory.material;

/**
 * @author wangling
 * @date 2021-10-17
 */
public abstract class Material {

    private double inventory;

    public Material(double inventory){this.inventory = inventory;}
    public Material(){this(0.00f);}

    public double getInventory(){return this.inventory;}
    public void setInventory(double inventory){this.inventory = inventory;}
    public void addInventory(double increment){this.inventory += increment;}

    public void acquire(double addQuant) {inventory += addQuant;}
    public double consume(double minusQuant) {
        double quantConsumed = minusQuant;

        if (inventory - minusQuant <= 0) {
            quantConsumed = inventory;
            inventory = 0.00f;
            // notifyOnExhaustion();
        }
        inventory -= minusQuant;
        return quantConsumed;
    }

    public boolean checkMaterialQuantity(Material obj, double needQuant) {
        return this.inventory==obj.inventory;
    }
    public boolean checkExpirationDate(Material obj)//还没写完
    {
        return this.inventory==obj.inventory;
    }

}
