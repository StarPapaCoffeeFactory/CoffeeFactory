package Test.DesignPatternTests;

import java.util.Scanner;

public class BridgeTest {
    static public void bridgeTest() {
        //测试流程
        System.out.println("");
        System.out.println("┌─────────────────────────   Bridge Test   ──────────────────────────┐");
        System.out.println("│                  1. choose coffee bean                             │");
        System.out.println("│                  2. choose manufacturing method                    │");
        System.out.println("│                  3. wait for manufacturing                         │");
        System.out.println("└────────────────────────────────────────────────────────────────────┘");
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        //第一步：选择咖啡豆
        System.out.println("1. choose coffee bean");
        System.out.println("Optional：1.榛仁  2.酒心");
        Sandwich sandwich;
        int tmp;
        while (true) {
            try {
                tmp = scanner.nextInt();
                if (tmp == 1) {
                    sandwich = new Hazelnut();
                    System.out.println("选择夹心类型为：榛仁！");
                    break;
                } else if (tmp == 2) {
                    sandwich = new Liqueur();
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
                System.out.println("1.牛奶巧克力  2.抹茶巧克力  3.黑巧克力  4.白巧克力  5.退出测试");
                cmd = scanner.nextInt();
                System.out.println("获取夹心巧克力的名字:");
                Coffee sandwichCoffee;
                if (cmd == 1) {
                    sandwichCoffee = new MilkCoffee(sandwich);
                    System.out.println(sandwichCoffee.getNameWithSandwich());
                } else if (cmd == 2) {
                    sandwichCoffee = new MatchaCoffee(sandwich);
                    System.out.println(sandwichCoffee.getNameWithSandwich());
                } else if (cmd == 3) {
                    sandwichCoffee = new DarkCoffee(sandwich);
                    System.out.println(sandwichCoffee.getNameWithSandwich());
                } else if (cmd == 4) {
                    sandwichCoffee = new WhiteCoffee(sandwich);
                    System.out.println(sandwichCoffee.getNameWithSandwich());
                } else if (cmd == 5) {
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
