package Test.DesignPatternTests;

import Settings.CoffeeFactory.machine.transportmachine.TransportMachine;
import Settings.CoffeeFactory.machine.transportmachine.adapter.Adapter;
import Settings.CoffeeFactory.machine.transportmachine.adapter.Aircraft;
import Settings.CoffeeFactory.machine.transportmachine.decorator.AccelerateEngine;
import Settings.CoffeeFactory.machine.transportmachine.decorator.EFAccelerateEngine;
import Settings.CoffeeFactory.machine.transportmachine.decorator.Engine;
import Settings.CoffeeFactory.machine.transportmachine.decorator.FastAccelerateEngine;
import Settings.CoffeeFactory.product.Product;

import java.util.Scanner;

/**
 * @ program: CoffeeFactory.iml
 * @ description: DecoratorTest
 * @ author: ShenBo
 * @ date: 2021-10-31 23:13:57
 */
public class DecoratorTest {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("┌──────────────────────   [Decorator] Test   ────────────────────────┐");
        System.out.println("│                   1. Create An Aircraft                            │");
        System.out.println("│                   2. Set the Attribute Value of the Aircraft       │");
        System.out.println("│                   3. Set the type of the Accelerate engine :       │");
        System.out.println("│                   ( 1. Common engine       2. Fast engine          │");
        System.out.println("│                   3. Environmentally-friendly engine )             │");
        System.out.println("│                   4. Start Working                                 │");
        System.out.println("└────────────────────────────────────────────────────────────────────┘");
        System.out.println("");

        Product product = new Product("product", 6, 5) {
            @Override
            protected void initIngredientList() {
            }
        };

        AdapterTest test=new AdapterTest();
        Aircraft plane=test.createAircraft();

        System.out.println("Please set the type of the Accelerate engine:");
        System.out.println("1. Common engine   2. Fast engine   3. Environmentally-friendly engine");

        Scanner scanner = new Scanner(System.in);

        int type;
        while(true)
        {
            type = scanner.nextInt();
            if(type==1||type==2||type==3)
                break;
        }

        plane.work(product);
        Engine engine=new AccelerateEngine(plane);
        if(type==1)
        {
            engine.accelerate();
        }else if(type==2)
        {
            Engine fastEngine=new FastAccelerateEngine(engine);
            fastEngine.accelerate();
        }else
        {
            Engine EFEngine=new EFAccelerateEngine(engine);
            EFEngine.accelerate();
        }


        System.out.println("────────────────────────────────────────────────────────────────────");
    }
}
