package Settings.CoffeeFactory.machine.processmachine.productmachine.coffeemachine;

import Settings.CoffeeFactory.product.originalcoffee.Coffee;

public class CoffeeMachineController {
    public CoffeeBasicMachine coffeeBasicMachine;

    public CoffeeMachineController(CoffeeBasicMachine coffeeBasicMachine) {
        this.coffeeBasicMachine = coffeeBasicMachine;
        String name = coffeeBasicMachine.getID();
        System.out.println(name + " is ready.\n");
        coffeeBasicMachine.setAimProcessNum(50);
    }


    public int startProduce() {
        coffeeBasicMachine.useCoffeeBean();
        int outNum = coffeeBasicMachine.run(coffeeBasicMachine.getCoffee());
        if (outNum == 0) {
            System.out.println("Failing producing coffee!");
        } else {
            // System.out.println("Successfully producing " + outNum + " MilkChocolate!");
        }
        return outNum;
    }
    public Coffee getCoffee() {
        return coffeeBasicMachine.getCoffee();
    }

}
