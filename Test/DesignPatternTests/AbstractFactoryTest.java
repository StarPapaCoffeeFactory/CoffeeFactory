package Test.DesignPatternTests;

import Settings.CoffeeFactory.areas.ManufacturingArea.Workshop.CoffeeProductWorkshop;
import Settings.CoffeeFactory.areas.ManufacturingArea.Workshop.CoffeeWorkshop;

import java.util.Random;
import java.util.Scanner;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        System.out.println("------------------------------------ [Abstract Factory] Test ------------------------------------");
        System.out.println("");
        System.out.println("CoffeeWorkshop : Let the specific workshop produce specific coffee");
        System.out.println("CoffeeProductWorkshop : Let the specific workshop produce specific coffee products");
        System.out.println("");

        System.out.println("Create a new workshop producing coffee...");
        CoffeeWorkshop coffeeWorkshop=new CoffeeWorkshop();
        System.out.println("Create a new workshop producing coffee products...");
        CoffeeProductWorkshop productWorkshop=new CoffeeProductWorkshop();


        Scanner input = new Scanner(System.in);
        int op;
        boolean flag = true;

        do {
            System.out.println("");
            System.out.println("┌─────────────────────────   Abstract Factory Test   ──────────────────────────┐");
            System.out.println("│                            0. Exit                                           │");
            System.out.println("│                            1. Test Coffee Workshop                           │");
            System.out.println("│                            2. Test Product Workshop                          │");
            System.out.println("│                            3. Test All                                       │");
            System.out.println("└──────────────────────────────────────────────────────────────────────────────┘");
            System.out.println("");
            op = input.nextInt();
            switch (op) {
                case 0:
                    flag = false;
                    break;
                case 1: {
                    System.out.println("Let Coffee Workshop start producing Arabica coffee...");
                    coffeeWorkshop.produceArabicaProduct();
                    System.out.println("Let Coffee Workshop start producing Robusta coffee...");
                    coffeeWorkshop.produceRobustaProduct();
                    break;
                }
                case 2:{
                    System.out.println("Let Product Workshop start producing Arabica coffee products...");
                    productWorkshop.produceArabicaProduct();
                    System.out.println("Let Product Workshop start producing Arabica coffee products...");
                    productWorkshop.produceRobustaProduct();
                    break;
                }
                case 3: {
                    System.out.println("Let Coffee Workshop start producing Arabica coffee...");
                    coffeeWorkshop.produceArabicaProduct();
                    System.out.println("Let Coffee Workshop start producing Robusta coffee...");
                    coffeeWorkshop.produceRobustaProduct();
                    System.out.println("Let Product Workshop start producing Arabica coffee products...");
                    productWorkshop.produceArabicaProduct();
                    System.out.println("Let Product Workshop start producing Arabica coffee products...");
                    productWorkshop.produceRobustaProduct();
                    break;
                }
                default:{
                    System.out.println("Invalid Input, Please input again.");
                }
            }
        } while (flag);
    }
}
