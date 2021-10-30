package Settings.CoffeeFactory.personnel.staff;

import Settings.CoffeeFactory.management.logistics.logisticsWork;
import Settings.CoffeeFactory.areas.Area;
import Settings.CoffeeFactory.personnel.visitlimit.LimitContext;

import java.util.List;

/**
 * @ program: coffeefactory
 * @ description: facade  后勤管理员
 * @ author: YXJ
 * @ date: 2021-10-15 12:12:45
 */
public class LogisticsAdministrator extends Staff{
    private logisticsWork works;//facade of work

    public LogisticsAdministrator(String name, int age, Gender gender , String phnum ,double salary)
    {
        super(name, age, gender, phnum,salary);
        this.identity = "LogisticsAdministrator";

    }

    public void setWorks(logisticsWork work)
    {
        this.works = work;
    }

    /*              for facade              */

    public void checkMachines()
    {
        this.works.checkMachines();
    }

    public void checkTools(){
        this.works.checkTools();
    }

    public void submitReport(){
        this.works.report();
    }

    /*              end for facade              */

//    public void Goto(Area dest)
//    {
//
//    }
    @Override
    public void SetVisitLimit()
    {/*
     *
     * @return void
     * @author YXJ
     * @description 设置LogisticsManager的访问权限
     * @date 2021/10/13 18:01
     */
        String[] persons = {this.identity};
        String[] publicAreas = {"publicArea", "experienceRoom", "exhibitionRoom", "etc"};
        this.visitLimit = new LimitContext(persons, publicAreas);
    }
    @Override
    public String toString()
    {
        return "class LogisticsManager extends Staff";
    }
}
