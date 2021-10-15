package Settings.CoffeeFactory.supplement;

import Settings.CoffeeFactory.areas.Area;
import Settings.CoffeeFactory.personnel.visitlimit.LimitContext;

public abstract class supplement {

    //protected String model;//型号
    protected String id;//编号
    protected String type;//类别

    protected Area location;//当前所在区域
    protected LimitContext visitLimit;//可用区域限制

    public supplement() {
        //this.model=model;
        //this.id=id;
        this.type="abstractSupplement";
    }

    public String getType()
    {
        /*
         *
         * @return java.lang.String
         * @author YXJ
         * @description
         * @date 2021/10/15 11:50
         */
        return this.type;
    }


    public String toString() {
        return "abstract class Personnel";
    }

    public abstract void Goto(Area dest);

}
