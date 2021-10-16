package Settings.CoffeeFactory.supplement.handmadeTool;

import Settings.CoffeeFactory.supplement.supplement;
import Settings.CoffeeFactory.areas.Area;

public class handmadeTool extends supplement{

    private long batchNumber;//生产批号
    public String description;//描述
    private int stock;//库存

    public handmadeTool (){
        this.type="handmadeTool";
        this.batchNumber=getBatchNumber();
        this.description=getDescription();
        this.stock=getStock();
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
    public long getBatchNumber(){
        return this.batchNumber;
    }

    public String getDescription(){
        return this.description;
    }
    
    public int getStock(){
        /*
         *
         * @return int
         * @author YXJ
         * @description 改public
         * @date 2021/10/15 11:45
         */

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
