package Test.DesignPatternTests;

//被包装的产品的问题
public class StrategyTest {
    /*
    public static void main(String[] args) {
        System.out.println("------------------------------------ [Strategy] Test ------------------------------------");

        System.out.println("");
        System.out.println("PackStrategy : packaging(product: Product) : each kind of pack strategy must implement this" +
                "method, which executes specific operation of packing.");
        System.out.println("PackMachine : process(product: Product) : perform the packing operation of the packmachine");
        System.out.println("PackMachine : setStrategy(strategy: Strategy) : set the pack strategy");
        System.out.println("PackMachine : getStrategy() : get the pack strategy");
        System.out.println("");

        System.out.println("");
        System.out.println("**************************** Strategy Test ****************************");
        System.out.println("***             1. Use box pack strategy for coffee                 ***");
        System.out.println("***             2. Use bag pack strategy for coffee                 ***");
        System.out.println("***             3. Use cup pack strategy for coffee                 ***");
        System.out.println("***             4. Error test                                       ***");
        System.out.println("***                                                                 ***");
        System.out.println("***********************************************************************");
        System.out.println("");

        Scanner input = new Scanner(System.in);
        int op;
        boolean flag = true;

        System.out.println("Firstly, we need to create a pack machine.");
        PackMachine PackMachine1 = new PackMachine("WP", "605", 5.0, 50,0.1);

        do {
            System.out.print("Please enter the order [0 to quit]:");
            op = input.nextInt();

            switch (op) {
                case 0:
                    flag = false;
                    break;
                case 1: {
                    System.out.println("\nLet's use a box to pack the chocolate cake.\n");
                    System.out.println("Create a chocolate cake...");
                    ChocolateCake chocolateCake = new ChocolateCake(1);
                    chocolateCake.setState(new ProducedState());// 假装生产完成了
                    PackMachine1.setStrategy(new BoxStrategy());
                    PackMachine1.process(chocolateCake, 1);
                    break;
                }
                case 2: {
                    System.out.println("\nLet's use a bag to pack the chocolate cookie.\n");
                    System.out.println("Create a chocolate cookie...");
                    ChocolateCookie chocolateCookie = new ChocolateCookie(ChocolateCookie.Shape.CAT);
                    chocolateCookie.setState(new ProducedState());
                    PackMachine1.setStrategy(new BagStrategy());
                    PackMachine1.process(chocolateCookie, 1);
                    break;
                }
                case 3: {
                    System.out.println("\nLet's use a cup to pack the chocolate ice-cream.\n");
                    System.out.println("Create a chocolate ice-cream...");
                    ChocolateIceCream chocolateIceCream = new ChocolateIceCream();
                    chocolateIceCream.setState(new ProducedState());
                    PackMachine1.setStrategy(new CupStrategy());
                    PackMachine1.process(chocolateIceCream, 1);
                    break;
                }
                case 4: {
                    System.out.println("\nIf using a pack machine without setting its strategy...\n");
                    PackMachine PackMachine2 = new PackMachine("WP", "601", 5.0, 50,0.1);
                    DarkChocolate darkChocolate = new DarkChocolate();
                    PackMachine2.process(darkChocolate, 1);
                    break;
                }
                default:{
                    System.out.println("Invalid Input, Please input again.");
                }
            }
        } while (flag);
        
    }*/
}
