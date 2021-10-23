package Test.DesignPatternTests;

/**
 * @ program: coffeefactory
 * @ description:
 * @ author: YXJ
 * @ date: 2021-10-15 12:53:07
 */
import Settings.CoffeeFactory.areas.Area;
import Settings.CoffeeFactory.personnel.*;
import Settings.CoffeeFactory.personnel.visitor.Visitor;
import Settings.CoffeeFactory.personnel.staff.worker.worker;
import Settings.CoffeeFactory.personnel.visitor.Visitor;

import java.util.*;
public class InterpreterTest {
    public static void main(String[] args) {
        worker workera = new worker("zhangsan",18, Personnel.Gender.male , "15007124567" , 5000.0);
        Visitor visitora = new Visitor("lisi" , 19 , Personnel.Gender.female , "1234567895" );

        List<Area> testAreas = new ArrayList<>(){{
//            add(new Area)
        }};

        for(Area a: testAreas)
        {
            visitora.Goto(a);
        }

        for(Area a: testAreas)
        {
            workera.Goto(a);
        }
    }

}
