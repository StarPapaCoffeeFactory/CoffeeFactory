package Test.DesignPatternTests;

/**
 * @ program: coffeefactory
 * @ description:
 * @ author: YXJ
 * @ date: 2021-10-15 12:53:07
 */

import Settings.CoffeeFactory.areas.Area;
import Settings.CoffeeFactory.areas.publicarea.ExhibitionRoom;
import Settings.CoffeeFactory.areas.publicarea.ExperienceRoom;
import Settings.CoffeeFactory.areas.staffarea.DiningRoom;
import Settings.CoffeeFactory.areas.staffarea.Office;
import Settings.CoffeeFactory.personnel.Personnel;
import Settings.CoffeeFactory.personnel.staff.worker.Worker;
import Settings.CoffeeFactory.personnel.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;
public class InterpreterTest {
    public static void main(String[] args) {
        Worker workera = new Worker("zhangsan",18, Personnel.Gender.male , "15007124567" , 5000.0);
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
        System.out.println("│                  3.  let a Worker try to access all area           │");
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

        System.out.println("──────────────────────────   Interpreter Test End  ─────────────────────────");
    }

}
