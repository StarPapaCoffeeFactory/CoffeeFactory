package Test.DesignPatternTests;

import Settings.CoffeeFactory.machine.processmachine.packmachine.PackMachine;
import Settings.CoffeeFactory.machine.processmachine.packmachine.strategy.LargeCupStrategy;
import Settings.CoffeeFactory.machine.processmachine.productmachine.BasicProductMachine;
import Settings.CoffeeFactory.product.Product;
import Settings.CoffeeFactory.product.coffeebeverage.Americano;
import Settings.CoffeeFactory.product.production.Packed;
import Settings.CoffeeFactory.product.production.Produced;
import Settings.CoffeeFactory.product.production.Producing;

import java.util.Scanner;

/**
 * @author LouTianyu
 * @description Test for State Pattern
 */
public class StateTest {

    public static void main(String[] args) {
        System.out.println("—————————————-------------------------------------———— Test[State]Pattern —————————————-------------------------------------————");

        System.out.println("");
        System.out.println("ProductState : nextStage() ...... Set the product to the next production stage.");
        System.out.println("Product : getStage() ...... Get the current production stage of the product.");
        System.out.println("");

        System.out.println("");
        System.out.println("┌──────────────────────────────────────   State Test   ────────────────────────────────┐");
        System.out.println("│              1. Produce the product: Set the product to produced stage               │");
        System.out.println("│              2. Pack the product: Set the product to packed stage                    │");
        System.out.println("│              3. Store the product: Set the product to Stored stage                   │");
        System.out.println("└──────────────────────────────────────────────────────────────────────────────────────┘");
        System.out.println("");

        Scanner input = new Scanner(System.in);
        int op;
        boolean flag = true;

        // Create a product here.
        Product product = new Americano(1);
        System.out.println("The initial production stage of product is \"" + product.getStage() + "\"");

        do {
            System.out.println("");
            System.out.print("Enter the order [0 to quit]:");
            op = input.nextInt();

            //Illustrate the product state change.
            if (op == 1 && !(product.getStage() instanceof Producing)
                    || op == 2 && !(product.getStage() instanceof Produced)
                    || op == 3 && !(product.getStage() instanceof Packed)) {
                System.out.println("Please inpute the order step by step!");
                continue;
            }

            switch (op) {
                case 0:
                    flag = false;
                    break;
                case 1: {
                    System.out.println("Let's produce a cup of Americano.");
                    System.out.println("Create a product machine...");
                    BasicProductMachine bpm = new BasicProductMachine("PR", "101");
                    product.setProduceMachine(bpm);
                    product.produce();

                    System.out.println("\nNow the production stage of the product is \"" + product.getStage() + "\"");
                    break;
                }
                case 2: {
                    System.out.println("Let's pack the Americano.");
                    System.out.println("Create a wrapper machine...");
                    PackMachine packMachine = new PackMachine("PA","101");
                    packMachine.setStrategy(new LargeCupStrategy());
                    product.setWrapperMachine(packMachine);
                    product.pack();

                    System.out.println("\nNow the production stage of the product is \"" + product.getStage() + "\"");
                    break;
                }
                case 3: {
                    product.store();
                    System.out.println("\nNow the production stage the product is \"" + product.getStage() + "\"");
                    break;
                }
                default: {
                    System.out.println("\nInvalid Input, Please input again!");
                    break;
                }
            }
        } while (flag);
        System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");
    }
}

