package Settings.CoffeeFactory.supplement.handmadeTool;

import Settings.CoffeeFactory.supplement.supplement;

import java.util.Date;

public class handmadeTool extends supplement{

    private long batchNumber;//生产批号
    public String description;//描述
    private int stock=999;//库存

    public handmadeTool (){
        this.type="handmadeTool";
        this.batchNumber= new Date().getTime();
        this.description="Default Description";
        this.stock=getStock();
    }

    public handmadeTool(handmadeTool tool) {
        batchNumber = tool.batchNumber;
        description = tool.description;
        System.out.println("Copy Handmade Tool!");
    }

//    @Override
//    public String getType()
//    {/*
//     *
//     * @return java.lang.String
//     * @author YXJ
//     * @description
//     * @date 2021/10/15 11:55
//     */
//
//        return this.type;
//    }

    @Override
    public String getType(){
        return this.type;
    }

    public void setDescription(String description)
    {
        this.description=description;
    }

    public long getBatchNumber(){
        return this.batchNumber;
    }

    public String getDescription(){
        return this.description;
    }

    public int getStock(){
        return this.stock;
    }

    //
    public void ref() {
        stock++;
    }

    public void deref(){
        stock--;
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

    /*
    @Override
    public void Goto(Area dest) {

        if (this.canEnter(dest.toString())) {
            this.location = dest;
            System.out.println(this.id + " " + this.type + " can be allocated to " + dest.toString());
        } else {
            System.out.println("Sorry, " + this.id + " " + this.type + "can not be allocated to" + dest.toString());
        }
    }
     */

    @Override
    public String toString() {
        return "class Visitor extends Person";
    }

}
