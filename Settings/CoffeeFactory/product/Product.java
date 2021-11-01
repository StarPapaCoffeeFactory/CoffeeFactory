package Settings.CoffeeFactory.product;

import Settings.CoffeeFactory.machine.processmachine.ProcessMachine;
import Settings.CoffeeFactory.machine.processmachine.packmachine.PackMachine;
import Settings.CoffeeFactory.machine.processmachine.productmachine.BasicProductMachine;
import Settings.CoffeeFactory.material.Material;
import Settings.CoffeeFactory.material.packages.PackageInfo;
import Settings.CoffeeFactory.product.production.Packed;
import Settings.CoffeeFactory.product.production.Producing;
import Settings.CoffeeFactory.product.production.ProductionStage;
import Settings.CoffeeFactory.product.productmemento.ProductMemento;

import java.util.ArrayList;

/**
 * @author LouTianyu
 * @description The basic abstract class for all products. All basic elements for a product is defined here.
 */

public abstract class Product {
    private String productName;
    private String productionDate;
    public int shelfLife;
    public int weight;
    public ProcessMachine produceMachine, wrapperMachine;
    protected ProductionStage stage;
    protected PackageInfo pack;
    public ArrayList<Material> ingredientList;

    protected Product() {}

    protected abstract void initIngredientList();


    public Product(String name, int shelfLife, int weight) {
        this.productName = name;
        this.shelfLife = shelfLife;
        this.productionDate = null;
        this.stage = new Producing();
        this.weight = weight;
        this.ingredientList = new ArrayList<Material>();
        this.produceMachine = new BasicProductMachine("PR", "220");
        this.wrapperMachine = new PackMachine("PA", "118", 40, 1, 500);
    }

    protected void setProductName(String name) {
        this.productName = name;
    }
    public String getProductName() {
        return this.productName;
    }

    //Methods ment for the State pattern in ProductionStage
    public ProductionStage getStage() {
        return stage;
    }
    public void setStage(ProductionStage stage) {
        this.stage = stage;
    }
    public void nextStage() {
        stage.nextState(this);
    }

    public void setProductionDate(String date) {
        if (this.productionDate == null) {
            this.productionDate = date;
        }
        else {
            System.out.println("Warning! The production date CAN NOT be modified!");
        }
    }
    public String getProductionDate() {
        return this.productionDate;
    }

    protected void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }
    public int getShelfLife() {
        return this.shelfLife;
    }

    public void setWeight(int weight) {
        /*
         * @param weight(product weight)
         * @return void
         * @author Kaiyu Huang
         * @description set product weight
         * @date 2021/10/27 8:15
         */
        this.weight = weight;
    }
    public int getWeight() {
        /*
         * @param
         * @return int
         * @author Kaiyu Huang
         * @description get product weight
         * @date 2021/10/27 8:15
         */
        return this.weight;
    }

    public void setPackage(PackageInfo pack) {this.pack = pack;}

    public void setWrapperMachine(ProcessMachine wrapperMachine) {
        this.wrapperMachine = wrapperMachine;
    }
    public void setProduceMachine(ProcessMachine produceMachine) {
        this.produceMachine = produceMachine;
    }

    public void produce() {
        this.produceMachine.process(this, 1);
    }
    public void pack() {
        this.wrapperMachine.process(this, 1);
    }

    /*
     * @return void
     * @description Store the product, when and only when it's packaged
     */
    public void store() {
        if (!(this.stage instanceof Packed)) {
            System.out.println("The product has not been packaged!");
            return;
        }
        System.out.println("Transporting " + getProductName() + " to the warehouse.");
        this.nextStage();
    }

    public ProductMemento createMemento() {
        /*
         * @param
         * @return Settings.CoffeeFactory.product.productmemento.ProductMemento
         * @author Kaiyu Huang
         * @description create product memento
         * @date 2021/10/27 8:14
         */
        return new ProductMemento(this.weight);
    }

    public void restoreMemento(ProductMemento memento) {
        /*
         * @param memento(a product memento)
         * @return void
         * @author Kaiyu Huang
         * @description get weight from product memento
         * @date 2021/10/27 8:14
         */
        this.weight = memento.getWeight();
    }











}
