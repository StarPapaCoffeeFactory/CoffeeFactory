package Test.DesignPatternTests;

/**
 * @ program: coffeefactory
 * @ description:
 * @ author: YXJ
 * @ date: 2021-10-15 12:53:54
 */
import Settings.CoffeeFactory.management.finance.SalaryPayment;
import Settings.CoffeeFactory.personnel.Personnel;
import Settings.CoffeeFactory.personnel.staff.*;
import Settings.CoffeeFactory.personnel.staff.worker.worker;

import java.io.OutputStream;
import java.text.*;
import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class ObserverTest {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("┌─────────────────────────   Observer Test ──────────────────────────┐");
        System.out.println("│                  1.  初始化员工列表                                 │");
        System.out.println("│                  2.  修改当前日期                                   │");
        System.out.println("│                  3.  为列表中所有员工发工资并通知                     │");
        System.out.println("│                  4.  修改员工月薪并通知                              │");
        System.out.println("└────────────────────────────────────────────────────────────────────┘");
        System.out.println("");

        List<Staff> obstaffList = new ArrayList<>(){{
            add(new worker("zhangsan",18, Personnel.Gender.male, "151515151", 2000));
            add(new worker("lisi",19, Personnel.Gender.male, "154655151", 2000));
            add(new worker("wangwu",20, Personnel.Gender.female, "145325151", 2000));
            add(new worker("heliu",21, Personnel.Gender.female, "151659851", 2000));
        }};

        SalaryPayment salaryPay = new SalaryPayment();

        for (Staff staff : obstaffList) {
            salaryPay.addStaff(staff);
        }



//        SimpleDateFormat simFormat = new SimpleDateFormat("yyyy-MM-dd");
//        try {
//            curdate = simFormat.parse("2021-10-23");
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date curDate = new Date();
        try {
             curDate = dateFormat.parse("2021-10-23");

        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("当前日期设置为："+ curDate.toString());
        salaryPay.setCurDate(curDate);

        try {
            curDate = dateFormat.parse("2021-10-28");

        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("当前日期设置为："+ curDate.toString());
        salaryPay.setCurDate(curDate);

        System.out.println();
        double salaryChange =  1000.0;
        System.out.println("因本季度绩效喜人，所有员工工资增加" + String.valueOf(salaryChange) + "元");
        System.out.println();
        salaryPay.changeSalary(salaryChange);

        System.out.println();
        System.out.println("───────────  Observer Test End  ──────────");
    }


}
