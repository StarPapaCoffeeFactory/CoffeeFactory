package Settings.CoffeeFactory.material.packages;
import Settings.CoffeeFactory.material.Material;
public abstract class PackageInfo extends Material implements Cloneable{
    protected PackageInfo(double initialQuant) {
        super(initialQuant);
    }
    protected PackageInfo() {
        super(0);
    }
}