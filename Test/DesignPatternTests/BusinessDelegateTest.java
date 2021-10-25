package Test.DesignPatternTests;

import Settings.CoffeeFactory.areas.ManufacturingArea.Warehouse.Delegate.WarehouseClient;
import Settings.CoffeeFactory.areas.ManufacturingArea.Warehouse.Delegate.WarehouseDelegate;
import Settings.CoffeeFactory.areas.ManufacturingArea.Warehouse.Warehouse;
import Settings.CoffeeFactory.material.Food.Milk;

import java.util.Scanner;

public class BusinessDelegateTest {
    public static void main(String[] args) {

        System.out.println("We will test the business delegate design model");
        System.out.println("");
        System.out.println("┌─────────────────────────   Business Delegate Test   ──────────────────────────┐");
        System.out.println("│               0. Exit!!!                                                      │");
        System.out.println("│               1. Testing the storage material service                         │");
        System.out.println("│               2. Testing the get material service                             │");
        System.out.println("└───────────────────────────────────────────────────────────────────────────────┘");
        System.out.println("");

        WarehouseDelegate warehouseDelegate;
        WarehouseClient warehouseClient;

        //Create a new warehouse
        Warehouse warehouse = new Warehouse();
        //Create a new warehouse delegate
        warehouseDelegate = new WarehouseDelegate(warehouse);
        //Create a new warehouse client
        warehouseClient = new WarehouseClient(warehouseDelegate);

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

                default:
                {
                    System.out.println("Invalid Input, Please input again.");
                }
            }
        }while(flag);

        System.out.println("Business delegate Design Mode Finished");

    }
}
