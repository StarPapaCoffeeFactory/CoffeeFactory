package Test.DesignPatternTests;

import Settings.CoffeeFactory.machine.processmachine.packmachine.PackMachine;
import Settings.CoffeeFactory.machine.processmachine.packmachine.strategy.LargeCupStrategy;
import Settings.CoffeeFactory.machine.processmachine.packmachine.strategy.MiddleCupStrategy;
import Settings.CoffeeFactory.machine.processmachine.packmachine.strategy.SmallCupStrategy;
import Settings.CoffeeFactory.product.Product;
import Settings.CoffeeFactory.product.coffeebeverage.*;
import Settings.CoffeeFactory.product.production.Produced;

import java.util.Scanner;

/**
 * @author ShenBo
 * @description test for Strategy
 */
public class StrategyTest {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("┌───────────────────────   [Strategy] Test   ────────────────────────┐");
        System.out.println("│               First, choose the kind of product you want to pack   │");
        System.out.println("│               0. Quit the System                                   │");
        System.out.println("│               1. Americano       2. CaramelMacchiato               │");
        System.out.println("│               3. HazelnutLatte   4. Latte   5. Mocha               │");
        System.out.println("│               Then, please choose the pack strategy                │");
        System.out.println("│               0. Quit the System                                   │");
        System.out.println("│               1.Use LargeCup strategy to pack                      │");
        System.out.println("│               2.Use MiddleCup strategy to pack                     │");
        System.out.println("│               3.Use SmallCup strategy to pack                      │");
        System.out.println("└────────────────────────────────────────────────────────────────────┘");
        Scanner input = new Scanner(System.in);
        int op;
        boolean flag1 = true;
        boolean chooseOK=true;
        Product packProduct;
        StrategyTest packTest=new StrategyTest();
        do{
            System.out.println("\nPlease choose the product you want to pack [0 to quit]:");
            op = input.nextInt();
            switch (op) {
                case 0:
                    System.out.println("Quit successfully!");
                    flag1 = false;
                    chooseOK=false;
                    break;
                case 1:
                    packProduct=new Americano(1);
                    chooseOK=packTest.doPack(packProduct);
                    break;
                case 2:
                    packProduct=new CaramelMacchiato(1);
                    chooseOK=packTest.doPack(packProduct);
                    break;
                case 3:
                    packProduct=new HazelnutLatte(1);
                    chooseOK=packTest.doPack(packProduct);
                    break;
                case 4:
                    packProduct=new Latte(1);
                    chooseOK=packTest.doPack(packProduct);
                    break;
                case 5:
                    packProduct=new Mocha(1);
                    chooseOK=packTest.doPack(packProduct);
                    break;
                default:
                    System.out.println("Invalid Input, Please input again.");
                    break;
            }
        }while(flag1&&chooseOK);
    }

    public boolean doPack(Product packProduct)
    {
        Scanner input = new Scanner(System.in);
        int op;
        boolean flag2 = true;
        //        System.out.println("Firstly, we need to create a pack machine.");
        PackMachine PackMachine1 = new PackMachine("WP", "605", 5.0, 50,0.1);
        do {
            System.out.println("Please choose the pack strategy [0 to quit]:");
            op = input.nextInt();
            if(op==0)
            {
                System.out.println("Quit successfully!");
                return false;
            }
            else if(op==1||op==2||op==3)
            {
                if(op==1)
                {
                    System.out.println("\nUse a Large Cup to pack the "+ packProduct.getProductName() +"...");
                    packProduct.setStage(new Produced());
                    PackMachine1.setStrategy(new LargeCupStrategy());
                    PackMachine1.process(packProduct, 1);
                }else if(op==2)
                {
                    System.out.println("\nUse a Middle Cup to pack the "+ packProduct.getProductName() +"...");
                    packProduct.setStage(new Produced());
                    PackMachine1.setStrategy(new MiddleCupStrategy());
                    PackMachine1.process(packProduct, 1);
                }else if(op==3)
                {
                    System.out.println("\nUse a Small Cup to pack the "+ packProduct.getProductName() +"...");
                    packProduct.setStage(new Produced());
                    PackMachine1.setStrategy(new SmallCupStrategy());
                    PackMachine1.process(packProduct, 1);
                }
                return true;
            }else
                System.out.println("Invalid Input, Please input again.");
        } while (flag2);
        return true;
    }
}
