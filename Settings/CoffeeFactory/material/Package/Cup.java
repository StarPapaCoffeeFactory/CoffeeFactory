package Settings.CoffeeFactory.material.Package;

public class Cup extends PackageInfo {
    /**
     * ctor of Cup
     *
     * @param initialQuant initial quantity
     */
    public Cup(double initialQuant) {
        super(initialQuant);
    }

    public Cup() {
        this(1);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("Successfully copy a cup!");
        return (Cup) super.clone();
    }
}

