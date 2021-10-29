package Test.DesignPatternTests;

import Settings.CoffeeFactory.machine.transportmachine.TransportMachine;
import Settings.CoffeeFactory.machine.transportmachine.adapter.Adapter;
import Settings.CoffeeFactory.machine.transportmachine.adapter.Aircraft;
import Settings.CoffeeFactory.product.Product;

import java.util.Scanner;

public class AdapterTest {
    public static void main(String[] args) {
        System.out.println("—————————————-------------------------------------———— Test[Adapter]Pattern —————————————-------------------------------------————");
        System.out.println("Adapter : work() : Use adapter to implement work function in Aircraft.");
        System.out.println("Adapter : navigate() : Use adapter to implement navigate function in Aircraft.");
        System.out.println("Machine : work() : Abstract work function in Machine base class.");
        System.out.println("Aircraft : work() : Interface that Aircraft should have work function.");
        System.out.println("Aircraft : navigate() : Interface that Aircraft should have navigate function.");
        System.out.println("");

        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("***************************   Adapter Test   **************************");
        System.out.println("***                 1. 创建一个无人机对象                             ***");
        System.out.println("***                 2. 设置无人机属性                                 ***");
        System.out.println("***                 3. 无人机开始工作！                               ***");
        System.out.println("***********************************************************************");
        System.out.println("");

        System.out.println("请为该架无人机设置机器编号（ID）:");
        String machineNum = scanner.nextLine();
        System.out.println("请以此输入该机器使用年限、baseLoss(0~1之间的小数)、最大容量（以空格为终止符）。");
        double lifeSpan = scanner.nextDouble();
        double baseLoss = scanner.nextDouble();
        int maxCapacity = scanner.nextInt();
        TransportMachine transportMachine = new TransportMachine("TR", machineNum, lifeSpan, baseLoss, maxCapacity) {
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
        System.out.println("无人机的机器编号为：" + plane.getID());

        System.out.println("");
        Product product = new Product("product", 5, 5) {
            @Override
            protected void initIngredientList() {
            }
        };

        System.out.println("Start Working……");
        plane.work(product);

        System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");
    }
}
