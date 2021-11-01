package Test.DesignPatternTests;

import Settings.CoffeeFactory.areas.manufacturingarea.warehouse.delegate.WarehouseDelegate;
import Settings.CoffeeFactory.areas.manufacturingarea.warehouse.Warehouse;
import Settings.CoffeeFactory.material.food.Milk;
import java.util.Scanner;

/***
 * @author ZJX
 * @description Test for business delegate design model
 */
public class BusinessDelegateTest {
    public static void main(String[] args) {

        System.out.println("We will test the business delegate design model");
        System.out.println("");
        System.out.println("┌────────────────────   Business Delegate Test   ────────────────────┐");
        System.out.println("│               0. Exit!!!                                           │");
        System.out.println("│               1. Testing the storage material service              │");
        System.out.println("│               2. Testing the get material service                  │");
        System.out.println("│               3. Testing the wrong service                         │");
        System.out.println("└────────────────────────────────────────────────────────────────────┘");
        System.out.println("");

        WarehouseDelegate warehouseDelegate;

        //Create a new warehouse
        Warehouse warehouse = new Warehouse();
        //Create a new warehouse delegate
        warehouseDelegate = new WarehouseDelegate(warehouse);

        Scanner input = new Scanner(System.in);
        int op;
        boolean flag = true;

        do{
            System.out.println("");
            System.out.print("Enter the order [0 to 3]:");
            op = input.nextInt();

            switch(op) {
                case 0:
                {
                    flag = false;
                    break;
                }
                case 1:
                {

                    warehouseDelegate.setServiceType("StorageMaterial");
                    warehouseDelegate.doTask(new Milk());
                    break;
                }
                case 2:
                {
                    warehouseDelegate.setServiceType("GetMaterial");
                    warehouseDelegate.doTask(new Milk());
                    break;
                }
                case 3:
                {
                    warehouseDelegate.setServiceType("WrongMaterial");
                    warehouseDelegate.doTask(new Milk());
                    break;
                }
                default:
                {
                    System.out.println("Invalid Input, Please input again.");
                }
            }
        }while(flag);

        System.out.println("Business delegate Design Mode Finished");

    }
}
