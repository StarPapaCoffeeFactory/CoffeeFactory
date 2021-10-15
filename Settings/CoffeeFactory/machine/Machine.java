package Settings.CoffeeFactory.machine;

import Settings.CoffeeFactory.product.Product;
public abstract class Machine {

    private String type;
    private String ID;
    private int age = 0;
    private int lifeSpan = 0;
    private double maxProcessNum = 0;
    private boolean isFunctional = false;
    //基础损耗时间
    private double baseLoss = 0.5;
    //基础损耗时间+根据产量确定的损耗时间
    private double totalLoss = 0.5;

    protected int aimProcessNum = 0;
    protected int breakLevel = 0;

    protected abstract int work(Product product);
}
