package Test.DesignPatternTests;

import Settings.CoffeeFactory.product.blendedcoffee.*;
import Settings.CoffeeFactory.product.originalcoffee.*;


import java.util.Scanner;

public class BridgeTest {
    static public void bridgeTest() {
        //测试流程
        System.out.println("");
        System.out.println("┌─────────────────────────   Bridge Test   ──────────────────────────┐");
        System.out.println("│                  1. Choose coffee bean                             │");
        System.out.println("│                  2. Choose manufacturing method                    │");
        System.out.println("│                  3. Wait for manufacturing                         │");
        System.out.println("└────────────────────────────────────────────────────────────────────┘");
        System.out.println("");
        //第一步：选择咖啡豆
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. choose coffee bean");
        System.out.println("Option: 1.Arabica 2.Robusta");
        BlendedCoffee blendedCoffee;
        int tmp;
        while (true) {
            try {
                tmp = scanner.nextInt();
                if (tmp == 1) {
                    blendedCoffee = new AutumnBlend();
                    System.out.println("选择夹心类型为：榛仁！");
                    break;
                } else if (tmp == 2) {
                    blendedCoffee = new PikePlace();
                    System.out.println("选择夹心类型为：酒心！");
                    break;
                } else {
                    System.out.println("请选择夹心类型:1.榛仁  2.酒心");
                }
            } catch (Exception e) {
                System.out.println("请重新选择夹心类型。");
            }
        }
        //第二步：选择制作方法
        System.out.println("2. choose manufacturing method");
        int cmd;
        while (true) {
            try {
                System.out.println("");
                System.out.println("选择你想放入的巧克力。");
                System.out.println("1.Arabica  2.Bourbon  3.Robusta");
                cmd = scanner.nextInt();
                System.out.println("获取夹心巧克力的名字:");
                Coffee coffee;
                if (cmd == 1) {
                    coffee = new Arabica();
                    System.out.println(coffee.getBlendedCoffeeName());
                } else if (cmd == 2) {
                    coffee = new Bourbon();
                    System.out.println(coffee.getBlendedCoffeeName());
                } else if (cmd == 3) {
                    coffee = new Robusta();
                    System.out.println(coffee.getBlendedCoffeeName());
                } else if (cmd == 4) {
                    break;
                } else {
                    System.out.println("输入指令无效，请重新输入。");
                }
            } catch (Exception e) {
                System.out.println("输入指令无效，请重新输入。");
            }
        }

    }

    public static void main(String[] args) {
        System.out.println("—————————————-------------------------------------———— Test[Bridge]Pattern —————————————-------------------------------------————");
        System.out.println("Chocolate : Chocolate() : Construct a Chocolate object with a sandwich object as a parameter to achieve decoupling of sandwich from the coffee itself.");
        System.out.println("MilkChocolate : MilkChocolate() : Construct a milk coffee to achieve decoupling of sandwich from the coffee itself.");
        System.out.println("MatchaChocolate : MatchaChocolate() : Construct a matcha coffee to achieve decoupling of sandwich from the coffee itself.");
        System.out.println("WhiteChocolate : WhiteChocolate() : Construct a white coffee to achieve decoupling of sandwich from the coffee itself.");
        System.out.println("BlackChocolate : BlackChocolate() : Construct a black coffee to achieve decoupling of sandwich from the coffee itself.");
        System.out.println("");

        bridgeTest();

        System.out.println("—————————————---------------------------------------------- End ————------—————————-------------------------------------————");

    }
}
