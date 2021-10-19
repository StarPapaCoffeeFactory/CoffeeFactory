package Settings.CoffeeFactory.material.Package;
import Settings.CoffeeFactory.material.Material;
public abstract class PackageInfo extends Material{
    protected PackageInfo(double initialQuant) {
        super(initialQuant);
    }
    protected PackageInfo() {
        super(0);
    }
}