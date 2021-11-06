package Settings.CoffeeFactory.personnel.staff.Maintainer;

import Settings.CoffeeFactory.areas.Area;
import Settings.CoffeeFactory.personnel.Personnel;

/**
 * @author CZQ
 * @DesignPattern chain of responsibility
 * @date 2021/10/17
 */

public class FreshmanMaintainer extends Maintainer{

    public FreshmanMaintainer(String name, int age, Personnel.Gender gender, String phnum, double salary ) {
        super(name, age, gender ,phnum ,salary);
        this.Maintain_ability=50;
    }

    /**
     * @description set maintain ability
     * @param _Maintain_ability:个人维修能力，维修难度小于等于维修能力的维修请求可以被处理
     * @return
     */
    public void SetMaintainAbility(int _Maintain_ability)
    {
        this.Maintain_ability=_Maintain_ability;
        System.out.println();
    }


    public void Goto(Area dest){}
    public void setVisitLimit(){}

}
