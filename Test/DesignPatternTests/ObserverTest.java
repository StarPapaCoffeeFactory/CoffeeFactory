package Test.DesignPatternTests;



import Settings.CoffeeFactory.management.finance.SalaryPayment;
import Settings.CoffeeFactory.personnel.Personnel;
import Settings.CoffeeFactory.personnel.staff.Staff;
import Settings.CoffeeFactory.personnel.staff.worker.Worker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Yuan XinJie
 * @description Test for Observer
 */
public class ObserverTest {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("┌─────────────────────────   Observer Test ──────────────────────────┐");
        System.out.println("│                  1.  Initialize Worker list (as observers)         │");
        System.out.println("│                  2.  change current date                           │");
        System.out.println("│                  3.  Pay and notify all workers in the list        │");
        System.out.println("│                  4.  Modify Worker salary and notify               │");
        System.out.println("└────────────────────────────────────────────────────────────────────┘");
        System.out.println();

        List<Staff> obstaffList = new ArrayList<Staff>(){{
            add(new Worker("ZhangSan",18, Personnel.Gender.male, "151515151", 2000));
            add(new Worker("LiSi",19, Personnel.Gender.male, "154655151", 2000));
            add(new Worker("WangWu",20, Personnel.Gender.female, "145325151", 2000));
            add(new Worker("HeLiu",21, Personnel.Gender.female, "151659851", 2000));
        }};

        SalaryPayment salaryPay = new SalaryPayment();

        for (Staff staff : obstaffList) {
            salaryPay.addStaff(staff);
        }
        System.out.println();


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
        System.out.println("set current date to："+ curDate.toString());
        salaryPay.setCurDate(curDate);
        System.out.println();

        try {
            curDate = dateFormat.parse("2021-10-28");

        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("set current date to："+ curDate.toString());
        salaryPay.setCurDate(curDate);

        System.out.println();
        double salaryChange =  1000.0;
        System.out.println("Due to the satisfactory performance in this quarter, the salary of all workers increased "
                + String.valueOf(salaryChange) + " yuan");
        System.out.println();
        salaryPay.changeSalary(salaryChange);

        System.out.println();
        System.out.println("──────────────────────────   Observer Test End  ──────────────────────");
    }


}
