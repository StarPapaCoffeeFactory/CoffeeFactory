package Settings.CoffeeFactory.personnel.staff.Maintainer;

import Settings.CoffeeFactory.areas.Area;
import Settings.CoffeeFactory.personnel.Personnel;
import Settings.CoffeeFactory.personnel.staff.Maintainer.Maintainer;
/**
 * @author CZQ
 * @project CoffeeFactory
 * @classname ${}
 * @description
 * @DesignPattern chain of responsibility
 * @date 2021/10/17
 */

public class SeasonedMaintainer  extends Maintainer{


    protected SeasonedMaintainer(String name, int age, Personnel.Gender gender, String phnum, double salary ) {
        super(name, age, gender ,phnum ,salary);
        this.Maintain_ability=100;
    }

    /**
     * 设置维修能力
     * @param _Maintain_ability:个人维修能力，维修难度小于等于维修能力的维修请求可以被处理
     * @return
     */
    public void SetMaintainAbility(int _Maintain_ability)
    {
        this.Maintain_ability=_Maintain_ability;
    }


    public void Goto(Area dest){}
    public void SetVisitLimit(){}


}
