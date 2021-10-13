package Settings.CoffeeFactory.product.originalcoffeebean;

public class Robusta {
    protected double milkContent;
    private double coffeeBeanNum = 100;
    private double sugarNum = 5;
    private double milkNum = 0.5;

    //constructor
    public MilkCoffee() {
        super("Milk Coffee", 18, 15, 0.3);
    }

    //constructor
    public MilkCoffee(Sandwich sandwich) {
        super("Milk Coffee", 18, 15, 0.3, sandwich);
        this.milkContent = 0.4;
        this.initIngredientList();
    }

    /**
     * @return milk's content
     */
    public double getMilkContent() {
        return this.milkContent;
    }

    /**
     * how many grams' milk is needed;
     *
     * @return
     */
    public double getMilkWeight() {
        return this.milkContent * this.weight;
    }

    /**
     * initialize the ingredient list of the milk coffee
     */
    @Override
    protected void initIngredientList() {
        super.ingredientList.add(new CoffeeBean());
        super.ingredientList.add(new Sugar());
        super.ingredientList.add(new Milk());
    }

    /**
     * return the coffee's name with the sandwich it contains
     * @return
     */
    public String getNameWithSandwich() {
        return sandwich.getSandwich() + " MilkCoffee";
    }

    /**
     * override the toString method
     *
     * @return
     */
    @Override
    public String toString() {
        return "subclass : Milk Coffee";
    }


    public void setCoffeeBeanNum(double coffeeBeanNum) {
        this.coffeeBeanNum = coffeeBeanNum;
    }

    public void setSugarNum(double sugarNum) {
        this.sugarNum = sugarNum;
    }

    public void setMilkNum(double milkNum) {
        this.milkNum = milkNum;
    }

    public double getCoffeeBeanNum() {
        return coffeeBeanNum;
    }

    public double getMilkNum() {
        return milkNum;
    }

    public double getSugarNum() {
        return sugarNum;
    }

    @Override
    public void dispaly() {
        System.out.println("this is MilkCoffee!!");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean equals(MilkCoffee milkCoffee) {
        return this.coffeeBeanNum == milkCoffee.getCoffeeBeanNum() && this.sugarNum == milkCoffee.getSugarNum() && this.milkNum == milkCoffee.getMilkNum();
    }
}
