package Test.DesignPatternTests;

import Settings.CoffeeFactory.areas.ManufacturingArea.Warehouse.Warehouse;
import Settings.CoffeeFactory.areas.ManufacturingArea.Workshop.CoffeeWorkshop;
import Settings.CoffeeFactory.areas.PublicArea.ExhibitionRoom;
import Settings.CoffeeFactory.areas.PublicArea.ExperienceRoom;
import Settings.CoffeeFactory.areas.StaffArea.DiningRoom;
import Settings.CoffeeFactory.areas.StaffArea.Office;
import Settings.CoffeeFactory.areas.Visitor.useVisitor;
import java.util.Scanner;

public class VisitorTest {
    public VisitorTest() {
    }

    public static void main(String[] args) {

        System.out.println("We will test the \"Visitor\" design pattern using the methods represented by the \"useVisitor\" class");
        System.out.println("");
        System.out.println("┌──────────────────────────────────────   Visitor Test   ────────────────────────────────┐");
        System.out.println("│              0. Exit!!!                                                                │");
        System.out.println("│              1. Test the \"Warehouse\" class                                           │");
        System.out.println("│              2. Test the \"CoffeeWorkshop\" class                                      │");
        System.out.println("│              3. Test the \"ExhibitionRoom\" class                                      │");
        System.out.println("│              4. Test the \"ExperienceRoom\" class                                      │");
        System.out.println("│              5. Test the \"DiningRoom\" class                                          │");
        System.out.println("│              6. Test the \"Office\" class                                              │");
        System.out.println("└────────────────────────────────────────────────────────────────────────────────────────┘");
        System.out.println("");

        useVisitor test_Visitor_use = new useVisitor();
        Scanner input = new Scanner(System.in);
        int op;
        boolean flag = true;

        do{
            System.out.println("");
            System.out.print("Enter the order [0 to 6]:");
            op = input.nextInt();
            switch(op){
                case 0:
                {
                    flag=false;
                    break;
                }
                case 1:
                {
                    System.out.println("Let's test method \"useVisitor\" of Warehouse");
                    Warehouse warehouse = new Warehouse();
                    warehouse.accept(test_Visitor_use);
                }
                case 2:
                {
                    System.out.println("Let's test method \"useVisitor\" of CoffeeWorkshop");
                    CoffeeWorkshop coffeeWorkshop = new CoffeeWorkshop();
                    coffeeWorkshop.accept(test_Visitor_use);
                }
                case 3:
                {
                    System.out.println("Let's test method \"useVisitor\" of ExhibitionRoom");
                    ExhibitionRoom exhibitionRoom = new ExhibitionRoom("exhibitionroom1",1000,500,100);
                    exhibitionRoom.accept(test_Visitor_use);
                }
                case 4:
                {
                    System.out.println("Let's test method \"useVisitor\" of ExperienceRoom");
                    ExperienceRoom experienceRoom = new ExperienceRoom();
                    experienceRoom.accept(test_Visitor_use);
                }
                case 5:
                {
                    System.out.println("Let's test method \"useVisitor\" of DiningRoom");
                    DiningRoom diningRoom = new DiningRoom();
                    diningRoom.accept(test_Visitor_use);
                }
                case 6:
                {
                    System.out.println("Let's test method \"useVisitor\" of Office");
                    Office office = new Office();
                    office.accept(test_Visitor_use);
                }
            }
        }while (flag);
        System.out.println("Visior Design Mode Finished");
    }
}