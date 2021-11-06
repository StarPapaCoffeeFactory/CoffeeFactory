package Settings.CoffeeFactory.material.Package;

/**
 * @author WangLing
 * @description the package material
 */
public class LargeCup extends PackageInfo {
    /**
     * @description ctor of LargeCup
     * @param initialQuant initial quantity
     */
    public LargeCup(double initialQuant) {
        super(initialQuant);
    }

    public LargeCup() {
        this(1);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("Successfully copy a LargeCup!");
        return (LargeCup) super.clone();
    }
}
