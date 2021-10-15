package Settings.CoffeeFactory.supplement.handmadeTool;

import Settings.CoffeeFactory.supplement.supplement;
import Settings.CoffeeFactory.areas.Area;

public class handmadeTool extends supplement{

    private long batchNumber;//生产批号
    private String description;//描述
    private int stock;//库存

    public handmadeTool (){
        this.type="handmadeTool";
        this.batchNumber=getBatchNumber();
        this.description=getDescription();
        this.stock=getStock();
    }



    private long getBatchNumber(){
        return this.batchNumber;
    }

    private String getDescription(){
        return this.description;
    }

    private int getStock(){
        return this.stock;
    }

    //
    private void ref() {
        this.stock++;
    }

    private void deref(){
        this.stock--;
    }

    public boolean canEnter(String dest) {
        String move = this.id + " enter " + dest;
        if (this.visitLimit.canAccess(move)) {
            System.out.println(this.type + " can enter" + dest);
            return true;
        } else {
            System.out.println("Sorry! " + this.type + " cannot enter " + dest);
            return false;
        }
    }


    @Override
    public void Goto(Area dest) {

        if (this.canEnter(dest.toString())) {
            this.location = dest;
            System.out.println(this.id + " " + this.type + " can be allocated to " + dest.toString());
        } else {
            System.out.println("Sorry, " + this.id + " " + this.type + "can not be allocated to" + dest.toString());
        }
    }

    @Override
    public String toString() {
        return "class Visitor extends Person";
    }

}
