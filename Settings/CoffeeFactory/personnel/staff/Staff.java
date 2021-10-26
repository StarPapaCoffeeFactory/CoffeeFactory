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

    public StaffArea getDepartment() {
        return department;
    }

    public void setDepartment(StaffArea department) {
        this.department = department;
    }

    public Staff(String name, int age, Gender gender , String phnum ,double salary)
    {
        super(name, age, gender, phnum);
        this.salary = salary;
        this.department = null;
        this.Id = generate_ID();
    }

    public Staff(String name, int age, Gender gender , String phnum ,double salary, StaffArea area)
    {
        super(name, age, gender, phnum);
        this.salary = salary;
        this.department = null;
        this.Id = generate_ID();
        this.department = area;
    }

    protected String generate_ID()
    {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    public void getPaid()
    {
        this.payroll_card += this.salary;
        System.out.println( "The No." + this.getId() +"Worker :"+this.name +" has been paid："+ this.salary + " yuan as month salary , " +
                "current asset：" + String.valueOf(this.payroll_card) + " yuan");
    }

    public void updateSalary(double change)
    {
        this.salary += change;
        System.out.println("The No." + this.getId() +" Worker :"+this.name+ " has received the notice ，its salary changes to ："+ this.salary
         + " yuan");
    }

    public void display()
    {
        String gender_str;
        if(gender.toString()=="male")
            gender_str="男";
        else
            gender_str="女";

        System.out.println("Name："+name+" Gender："+gender_str+"  Age："+getAge()+"  Id:"+ Id+"  department:"+department.toString());
    }

    public String getId()
    {
        return this.Id;
    }

}
