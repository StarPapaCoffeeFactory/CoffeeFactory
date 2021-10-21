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
import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class ObserverTest {
    List<Staff> obstaffList = new ArrayList<>(){{
        add(new worker("zhangsan",18, Personnel.Gender.male, "151515151", 2000));
        add(new worker("lisi",19, Personnel.Gender.male, "154655151", 2000));
        add(new worker("wangwu",20, Personnel.Gender.female, "145325151", 2000));
        add(new worker("heliu",21, Personnel.Gender.female, "151659851", 2000));
    }};

    SalaryPayment sp = new SalaryPayment();

    for(int i =0; i < obstaffList.size() ; i++ )
    {
//        System.out.println("s");
    }

}
