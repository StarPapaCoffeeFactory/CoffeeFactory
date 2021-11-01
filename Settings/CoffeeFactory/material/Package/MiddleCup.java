package Settings.CoffeeFactory.material.Package;

public class MiddleCup extends PackageInfo {
    /**
     * ctor of MiddleCup
     *
     * @param initialQuant initial quantity
     */
    public MiddleCup(double initialQuant) {
        super(initialQuant);
    }

    public MiddleCup() {
        this(1);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("Successfully copy a MiddleCup!");
        return (MiddleCup) super.clone();
    }
}
