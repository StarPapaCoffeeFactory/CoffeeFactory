package Settings.CoffeeFactory.personnel.staff.Maintainer;

import Settings.CoffeeFactory.personnel.Personnel;
import Settings.CoffeeFactory.personnel.staff.Staff;

/**
 * @author CZQ
 * @DesignPattern chain of responsibility
 * @date 2021/10/17
 */
public abstract class Maintainer extends Staff{

    private Maintainer next;
    protected int Maintain_ability;

    protected Maintainer(String name, int age, Personnel.Gender gender, String phnum, double salary ) {
        super(name, age, gender ,phnum ,salary);
    }

    public void setNext(Maintainer next)
    {
        this.next = next;
    }

    public Maintainer getNext()
    {
        return next;
    }

    /**
     * @description handle maintain request
     * @param Maintain_difficulty: difficulty,1~100
     * @return viable of maintain ,T or F
     */
    public boolean handle(int Maintain_difficulty)
    {
        if (Maintain_difficulty<=this.Maintain_ability) {
            System.out.println("Maintainer " + this.name +" handled and solved this problem.");
            return true;
        } else {
            if (getNext() != null) {
                System.out.println(this.name + " couldn't handle this problem. Call next maintainer called " + getNext().getName());
                if (getNext().handle(Maintain_difficulty)) {
                    return true;
                } else {
                    return false;
                }
            } else {
                System.out.println("No exists maintainer is able to handle this problem!");
                return false;
            }
        }
    }

    /**
     * @description set maintain ability
     * @param Maintain_ability:个人维修能力，维修难度小于等于维修能力的维修请求可以被处理
     * @return
     */
    public abstract void SetMaintainAbility(int Maintain_ability);


}
