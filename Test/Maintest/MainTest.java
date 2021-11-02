package Test.Maintest;

import Test.DesignPatternTests.*;
import java.util.*;

/**
 * @author CZQ
 * @project CoffeeFactory
 * @description Main test for all design pattern
 * @date 2021/11/2
 */

public class MainTest {
    //所有test名称，顺序对应显示的序号
    private static String[] test_Arr = {
            "Abstract Factory",
            "Adapter",
            "Bridge",
            "Builder",
            "Business Delegate",
            "Chain Of Responsibility",
            "Command",
            "Composite",
            "COW",
            "Decorator",
            "Facade",
            "Factory Method",
            "Flyweight",
            "Immutable",
            "Interpreter",
            "IOC",
            "Iterator",
            "Mediator",
            "Memento",
            "Monostate",
            "Multiton",
            "Null Object",
            "Observer",
            "Prototype",
            "Proxy",
            "Singleton",
            "State",
            "Strategy",
            "Template Method",
            "Visitor"
    };


    //main
    public static void main(String[] args) {

        while(true) {
            showlist();
            int op = getinput();
            if(op==0)
                break;
            exectests(op);
        }
    }

    //显示菜单
    public static void showlist() {
        System.out.println("┌────────────   Coffee Factory Design Pattern Test   ────────────────┐");
        for (int i = 0; i < test_Arr.length; i++) {
            System.out.printf("│                     %2d - %-24s                  │\n", i + 1, test_Arr[i]);
        }
        System.out.println("└────────────────────────────────────────────────────────────────────┘");
    }

    //键盘输入
    public static int getinput() {

        while (true) {
            try {
                System.out.printf("Please choose a design pattern [0 to exit]:");
                Scanner input = new Scanner(System.in);
                int num = input.nextInt();
                if (0 <= num && num <= test_Arr.length) {
                    System.out.println("");
                    return num;
                }

            } catch (Exception ex) {
            }
        }
    }

    //执行test
    public static void exectests(int op) {
        try {
            switch (op) {
                case 1:
                    AbstractFactoryTest.main(new String[]{});
                    break;
                case 2:
                    AdapterTest.main(new String[]{});
                    break;
                case 3:
                    BridgeTest.main(new String[]{});
                    break;
                case 4:
                    BuilderTest.main(new String[]{});
                    break;
                case 5:
                    BusinessDelegateTest.main(new String[]{});
                    break;
                case 6:
                    ChainOfResponsibilityTest.main(new String[]{});
                    break;
                case 7:
                    CommandTest.main(new String[]{});
                    break;
                case 8:
                    CompositeTest.main(new String[]{});
                    break;
                case 9:
                    COWTest.main(new String[]{});
                    break;
                case 10:
                    DecoratorTest.main(new String[]{});
                    break;
                case 11:
                    FacadeTest.main(new String[]{});
                    break;
                case 12:
                    FactoryMethodTest.main(new String[]{});
                    break;
                case 13:
                    FlyweightTest.main(new String[]{});
                    break;
                case 14:
                    ImmutableTest.main(new String[]{});
                    break;
                case 15:
                    InterpreterTest.main(new String[]{});
                    break;
                case 16:
                    IOCTest.main(new String[]{});
                    break;
                case 17:
                    IteratorTest.main(new String[]{});
                    break;
                case 18:
                    MediatorTest.main(new String[]{});
                    break;
                case 19:
                    MementoTest.main(new String[]{});
                    break;
                case 20:
                    MonostateTest.main(new String[]{});
                    break;
                case 21:
                    MultitonTest.main(new String[]{});
                    break;
                case 22:
                    NullObjectTest.main(new String[]{});
                    break;
                case 23:
                    ObserverTest.main(new String[]{});
                    break;
                case 24:
                    PrototypeTest.main(new String[]{});
                    break;
                case 25:
                    ProxyTest.main(new String[]{});
                    break;
                case 26:
                    SingletonTest.main(new String[]{});
                    break;
                case 27:
                    StateTest.main(new String[]{});
                    break;
                case 28:
                    StrategyTest.main(new String[]{});
                    break;
                case 29:
                    TemplateMethodTest.main(new String[]{});
                    break;
                case 30:
                    VisitorTest.main(new String[]{});
                    break;
                default:
                    System.out.println("INPUT out of range.");
                    break;
            }
        }
        catch(Exception ex){

        }
    }
}
