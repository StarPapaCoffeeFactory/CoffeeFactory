package Settings.CoffeeFactory.personnel.staff;

import Settings.CoffeeFactory.areas.StaffArea.StaffArea;
import Settings.CoffeeFactory.personnel.Personnel;

import java.util.Objects;
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
    {/*
     *
     * @return java.lang.String
     * @author YXJ
     * @description 生成一个八位数字的id
     * @date 2021/10/26 16:59
     */

        return UUID.randomUUID().toString().replaceAll("-|[a-z]", "").substring(0,8);
    }

    public void getPaid()
    {
        this.payroll_card += this.salary;
        System.out.println( "The No." + this.getId() +" worker :"+this.name +" has been paid："+ this.salary + " yuan as month salary , " +
                "current asset：" + String.valueOf(this.payroll_card) + " yuan");
    }

    public void updateSalary(double change)
    {
        this.salary += change;
        System.out.println("The No." + this.getId() +" Worker :"+this.name+ " has received the notice ，its salary changes to ："+ this.salary
         + " yuan");
    }

    public void display()
    {/*
     *
     * @return void
     * @author YXJ
     * @description  打印staff基本信息
     * @date 2021/10/26 17:00
     */

        String gender_str;
        if(Objects.equals(gender.toString(), "male"))
            gender_str="male";
        else
            gender_str="female";

        System.out.println("Name："+name+" Gender："+gender_str+"  Age："+getAge()+"  Id:"+ Id+"  department:"+
                (this.department == null ? "null" : this.department.toString()));
    }

    public String getId()
    {
        return this.Id;
    }

}
