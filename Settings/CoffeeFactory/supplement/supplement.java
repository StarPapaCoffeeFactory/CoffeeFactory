package Settings.CoffeeFactory.supplement;

import Settings.CoffeeFactory.areas.Area;
import Settings.CoffeeFactory.personnel.visitlimit.LimitContext;

public abstract class supplement {

    protected String model;//型号
    protected String id;//编号

    protected Area location;//当前所在区域
    protected LimitContext visitLimit;//可用区域限制

    public supplement(String model,String id) {
        this.model=model;
        this.id=id;
    }

    public void setModel(String model) {
        this.model=model;
    }

    public String getModel() {
        return this.model;
    }

    public String toString() {
        return "abstract class Personnel";
    }

    public abstract void Goto(Area dest);

}
