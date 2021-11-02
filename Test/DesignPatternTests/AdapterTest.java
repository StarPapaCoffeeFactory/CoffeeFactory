package Test.DesignPatternTests;

import Settings.CoffeeFactory.machine.transportmachine.TransportMachine;
import Settings.CoffeeFactory.machine.transportmachine.adapter.Adapter;
import Settings.CoffeeFactory.machine.transportmachine.adapter.Aircraft;
import Settings.CoffeeFactory.product.Product;

import java.util.Scanner;

/**
 * @author ShenBo
 * @description test for Adapter
 */
public class AdapterTest {
    public Aircraft createAircraft()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please set the id of the aircraft:");
        String machineNum = scanner.nextLine();
        System.out.println("Please set the lifeSpan:");
        double lifeSpan = scanner.nextDouble();
        System.out.println("Please set the baseLoss(A decimal between 0 and 1):");
        double baseLoss = scanner.nextDouble();
        System.out.println("Please set the max capacity:");
        int maxCapacity = scanner.nextInt();

        TransportMachine transportMachine = new TransportMachine("Aircraft", machineNum, lifeSpan, baseLoss, maxCapacity) {
            @Override
            protected void load(Product product) {
            }

            @Override
            protected void arrive(Product product) {
            }
        };

        Aircraft plane = new Adapter(transportMachine);
        plane.setAimProcessNum(1);
        plane.setID(transportMachine.getID());
        return plane;
    }

    public static void main(String[] args) {
        System.out.println("");
        System.out.println("┌────────────────────────   [Adapter] Test   ────────────────────────┐");
        System.out.println("│                  1. Create An Aircraft                             │");
        System.out.println("│                  2. Set the Attribute Value of the Aircraft        │");
        System.out.println("│                  3. Start Working                                  │");
        System.out.println("└────────────────────────────────────────────────────────────────────┘");
        System.out.println("");

        Product product = new Product("product", 5, 5) {
            @Override
            protected void initIngredientList() {
            }
        };
        AdapterTest test=new AdapterTest();
        test.createAircraft().work(product);

        System.out.println("────────────────────────────────────────────────────────────────────");
        }
}
