package Test.DesignPatternTests;

import Settings.CoffeeFactory.product.coffeebeverage.*;
import Settings.CoffeeFactory.product.productmemento.*;

import java.util.Scanner;

/**
 * @ program: CoffeeFactory.iml
 * @ description: Test for Memento
 * @ author: Kaiyu Huang
 * @ date: 2021-10-27 08:31:25
 */

public class MementoTest {
    public static void main(String[] args) {
        /*
         * @param args
         * @return void
         * @author Kaiyu Huang
         * @description main function for MementoTest
         * @date 2021/10/27 8:10
         */
        System.out.println("─────────────────────────   [Memento] Test   ─────────────────────────");
        System.out.println("");
        System.out.println("Product : createMemento() : create a memento for the product to store message of totalWeight of single item");
        System.out.println("Product : restoreMemento(memento : ProductMemento) : restore message from the memento");
        System.out.println("ProductMemento : setWeight(weight : int) : set the weight of product in the memento");
        System.out.println("ProductMemento : getWeight() : get the weight of product in the memento");
        System.out.println("ProductCaretaker : setProductMemento(productMemento : ProductMemento） : " +
                "set the concrete memento in the product caretaker");
        System.out.println("ProductCaretaker : getProductMemento() : get the concrete product memento");
        System.out.println("");
        //test process
        System.out.println("");
        System.out.println("┌─────────────────────────   Memento Test   ─────────────────────────┐");
        System.out.println("│              1. Set the initial quantity of products               │");
        System.out.println("│              2. Store the weight in the memento                    │");
        System.out.println("│              3. Set the change of product quantity                 │");
        System.out.println("│              4. Get the old weight from memento                    │");
        System.out.println("└────────────────────────────────────────────────────────────────────┘");
        System.out.println("");
        //Set the initial quantity of products
        Scanner input = new Scanner(System.in);
        int quantity;
        System.out.print("1. Set the initial quantity of Americano : ");
        quantity = input.nextInt();
        Americano americano = new Americano(quantity);
        System.out.println("");
        System.out.println("Successfully create a batch of Americano products weighing " + americano.getWeight() + " grams");
        System.out.println("");
        //Store the weight in the memento
        System.out.println("2. Store the weight in the memento : ");
        System.out.println("Create a product memento...");
        ProductCaretaker caretaker = new ProductCaretaker();
        caretaker.setProductMemento(americano.createMemento());
        System.out.println("Message in the memento : The weight of Americano in the memento is " +
                caretaker.getProductMemento().getWeight() + " grams.");
        System.out.println("");
        //Set the change of product quantity
        System.out.println("3. Set the change of product quantity : ");
        int change;
        change = input.nextInt();
        americano.setWeight(americano.getWeight() * (quantity + change) / quantity);
        System.out.println("");
        System.out.println("Now the weight of Americano is " + americano.getWeight() + " grams");
        System.out.println("");
        //Get the old weight from memento
        System.out.println("4. Get the old weight from memento : ");
        americano.restoreMemento(caretaker.getProductMemento());
        System.out.println("The weight of Americano in memento is " + americano.getWeight() + " grams");
    }
}
