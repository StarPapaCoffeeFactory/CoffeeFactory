package Settings.CoffeeFactory.material.Package;

public class SmallCup extends PackageInfo {
    /**
     * @description ctor of SmallCup
     * @param initialQuant initial quantity
     */
    public SmallCup(double initialQuant) {
        super(initialQuant);
    }

    public SmallCup() {
        this(1);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("Successfully copy a SmallCup!");
        return (SmallCup) super.clone();
    }
}

