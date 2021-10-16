package Test.DesignPatternTests;

import java.util.Scanner;

public class MementoTest {
    public static void main(String[] args) {
        //TODO：相关场景
        System.out.println("------------------------------------ [Memento] Test ------------------------------------");
        System.out.println("");
        System.out.println("Product : createMemento() : create a memento for the product to store message of quantity of single item");
        System.out.println("Product : restoreMemento(memento : Memento) : restore message from the memento");
        System.out.println("ProductMemento : setWeight(quantity : int) : set the quantity of product in the memento");
        System.out.println("ProductMemento : getWeight() : get the quantity of product in the memento");
        System.out.println("ProductCaretaker : setProductMemento(productMemento : ProductMemento） : " +
                "set the concrete memento in the product caretaker");
        System.out.println("ProductCaretaker : getProductMemento() : get the concrete product memento");
        System.out.println("");
        //测试流程
        System.out.println("");
        System.out.println("┌─────────────────────────   Memento Test   ─────────────────────────┐");
        System.out.println("│              1. Set the initial quantity of products               │");
        System.out.println("│              2. Store the quantity in the memento                  │");
        System.out.println("│              3. Set new quantity of products                       │");
        System.out.println("│              4. Get the old quantity from memento                  │");
        System.out.println("└────────────────────────────────────────────────────────────────────┘");
        System.out.println("");
        //第一步：设置产品的初始数量
        Scanner input = new Scanner(System.in);
        int quantity;
        System.out.println("Let's make a chocolate cake!");
        System.out.print("Step 1: Input the size of the chocolate cake" +
                "(quantity = 100*size*size):");
        quantity = input.nextInt();

        ChocolateCake cake = new ChocolateCake(quantity);
        System.out.println("");
        System.out.println("Successfully create a chocolate cake of " + cake.getWeight() + " grams");
        System.out.println("");

        System.out.println("Step 2: Create a memento to store the quantity of the chocolate cake");
        System.out.println("Create a product memento...");
        ProductCaretaker caretaker = new ProductCaretaker();
        caretaker.setProductMemento(cake.createMemento());
        System.out.println("Message in the memento:    The quantity of chocolate cake in the memento is " +
                caretaker.getProductMemento().getWeight() + " grams.");
        System.out.println("");

        System.out.println("Step 3: Set a new quantity of the chocolate cake");
        System.out.print("Input the new quantity:");
        quantity = input.nextInt();
        cake.setWeight(quantity);
        System.out.println("");
        System.out.println("Now the quantity of chocolate cake is " + cake.getWeight() + " grams");
        System.out.println("");

        System.out.println("Step 4: Get the old quantity from memento");
        cake.restoreMemento(caretaker.getProductMemento());
        System.out.println("Now the quantity of chocolate cake is " + cake.getWeight() + " grams");
    }
}
