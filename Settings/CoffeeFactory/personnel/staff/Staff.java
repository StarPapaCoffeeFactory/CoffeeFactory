package Settings.CoffeeFactory.personnel.staff;

import Settings.CoffeeFactory.areas.StaffArea.StaffArea;
import Settings.CoffeeFactory.personnel.Personnel;
import java.util.UUID;
/**
 * @ program: coffeefactory
 * @ description: 基本职工
 * @ author: YXJ
 * @ date: 2021-10-14 17:30:55
 */
public abstract class Staff extends Personnel implements Observer{

    protected String Id;
    protected double salary;//月薪
    protected double payroll_card;//工资卡
    protected StaffArea department;//工作部门

    public Staff(String name, int age, Gender gender , String phnum ,double salary)
    {
        super(name, age, gender, phnum);
        this.salary = salary;
        this.department = null;
        this.Id = generate_ID();
    }
    protected String generate_ID()
    {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    public void getPaid()
    {
        this.payroll_card += this.salary;
    }

    public void updateSalary(double change)
    {
        this.salary += change;
        System.out.println(this.name + "收到通知 ， 当前工资变更为："+ this.salary);
    }


}