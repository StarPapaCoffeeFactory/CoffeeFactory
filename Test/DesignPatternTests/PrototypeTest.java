package Test.DesignPatternTests;

import Settings.CoffeeFactory.material.Material;
import Settings.CoffeeFactory.material.Food.Milk;
import Settings.CoffeeFactory.material.Package.LargeCup;

import java.util.Scanner;
import java.util.Calendar;

/**
 * @author wangling
 * @project CoffeeFactory
 * @classname PrototypeTest
 * @description Test for prototype pattern1
 * @date 2021/10/26 15:46
 */

public class PrototypeTest {
    public static void testPrototype(Material obj1, Material obj2, String name) {

        System.out.printf("\nNow we check whether the 2 %s instances are the same one: ", name);
        System.out.println(obj1 == obj2);
        //System.out.printf("Now we check whether the attributes of the 2 %s instances are the same one: ", name);
        //System.out.println(obj1.checkQuantityEqualOnStorage(obj2));
        System.out.printf("Now check whether the value of the attributes in the 2 %s instances are the same: ", name);
        System.out.println(obj1.checkMaterialQuantity(obj2));

        System.out.printf("\nNow we change the quantity of the second %s instance but make its value unchanged.\n", name);
        obj2.acquire(0);

        //System.out.print("\nNow we check whether the attributes of the 2 instances are the same one again: ");
        //System.out.println(obj1.checkQuantityEqualOnStorage(obj2));
        System.out.print("Now check whether the value of the attributes are the same: ");
        System.out.println(obj1.checkMaterialQuantity(obj2));

    }


    public static void main(String[] args) throws CloneNotSupportedException {

        System.out.println("—————————————-------------------------------------———— Test[Prototype]Pattern —————————————-------------------------------------————");
        System.out.println("");
        System.out.println("LargeCup : clone() :  clone a LargeCup instance");
        System.out.println("Milk : clone() :  clone a Milk instance");
        System.out.println("Method named \"clone\" exists in every subclass of Material");
        System.out.println("");

        System.out.println("");
        System.out.println("┌─────────────────────────   Prototype Test   ──────────────────────────┐");
        System.out.println("│                     1. LargeCup (Package)                                  │");
        System.out.println("│                     2. Milk (Food)                                    │");
        System.out.println("│                                                                       │");
        System.out.println("│               Input the object you want to clone.                     │");
        System.out.println("└───────────────────────────────────────────────────────────────────────┘");
        System.out.println("");

        Scanner input = new Scanner(System.in);
        int op;
        boolean flag = true;

        while (flag) {
            System.out.println("");
            System.out.print("Enter the order [0 to quit]:");
            op = input.nextInt();
            switch (op) {
                case 0: {
                    flag = false;
                    break;
                }
                case 1: {
                    System.out.println("\nFirst we create 2 cup instances using prototype pattern: ");
                    LargeCup cup1 = new LargeCup(10);
                    LargeCup cup2 = (LargeCup) cup1.clone();
                    testPrototype(cup1, cup2, "cup");
                    break;
                }
                case 2: {
                    System.out.println("\nFirst we create 2 Milk instances using prototype pattern: ");
                    Calendar cl=Calendar.getInstance();
                    cl.add(Calendar.DAY_OF_WEEK, 2);
                    Milk milk1 = new Milk(10, cl);
                    Milk milk2 = (Milk) milk1.clone();
                    testPrototype(milk1, milk2, "milk");
                    break;
                }
                default: {
                    System.out.println("Invalid Input, Please input again.");
                }
            }
        }
        System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");
    }
}
