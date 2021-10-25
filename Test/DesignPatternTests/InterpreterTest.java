package Test.DesignPatternTests;

/**
 * @ program: coffeefactory
 * @ description:
 * @ author: YXJ
 * @ date: 2021-10-15 12:53:07
 */

import Settings.CoffeeFactory.areas.Area;
import Settings.CoffeeFactory.areas.PublicArea.ExhibitionRoom;
import Settings.CoffeeFactory.areas.PublicArea.ExperienceRoom;
import Settings.CoffeeFactory.areas.StaffArea.DiningRoom;
import Settings.CoffeeFactory.areas.StaffArea.Office;
import Settings.CoffeeFactory.personnel.Personnel;
import Settings.CoffeeFactory.personnel.staff.worker.worker;
import Settings.CoffeeFactory.personnel.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;
public class InterpreterTest {
    public static void main(String[] args) {
        worker workera = new worker("zhangsan",18, Personnel.Gender.male , "15007124567" , 5000.0);
        Visitor visitora = new Visitor("lisi" , 19 , Personnel.Gender.female , "1234567895" );

        List<Area> testAreas = new ArrayList<Area>(){{
            add(new ExhibitionRoom("Coffee Memorial", 100.0,15,50 ));
            add(new ExhibitionRoom("Coffee Museum" , 150,25,100));
            add(new ExperienceRoom("Handmade Coffee Experience Room",160,16,50));
            add(new DiningRoom());
            add(new Office());

        }};

        System.out.println();
        System.out.println("┌──────────────────────── Interpreter Test ──────────────────────────┐");
        System.out.println("│                  1.  initialize the Area List to visit             │");
        System.out.println("│                  2.  let a visitor try to access all area          │");
        System.out.println("│                  3.  let a worker try to access all area           │");
        System.out.println("└────────────────────────────────────────────────────────────────────┘");
        System.out.println();

        for(Area a: testAreas)
        {
            visitora.Goto(a);
        }

        for(Area a: testAreas)
        {
            workera.Goto(a);
        }

        System.out.println("──────────────────────────   Interpreter Test End  ───────────────────");
    }

}
