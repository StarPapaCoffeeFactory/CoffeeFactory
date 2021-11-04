package Settings.CoffeeFactory.supplement;

import Settings.CoffeeFactory.areas.Area;
import Settings.CoffeeFactory.personnel.visitlimit.LimitContext;

/**
 *
 * @return
 * @author ZPZ
 * @description class supplement
 * @date 2021/10/27 14:10
 */

public abstract class supplement {

    protected String id;//编号
    protected String type;//类别

    protected Area location;//当前所在区域

    public supplement() {
        this.type="abstractSupplement";
    }

    public String getId(){
        return this.id;
    }

    public String getType()
    {
        return this.type;
    }


    public String toString() {
        return "abstract class Personnel";
    }


}
