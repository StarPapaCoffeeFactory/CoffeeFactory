package Settings.CoffeeFactory.supplement.handmadeTool;

import Settings.CoffeeFactory.supplement.supplement;

import java.util.Date;

/**
 *
 * @return
 * @author ZPZ
 * @description
 * @date 2021/10/27 14:10
 */

public class handmadeTool extends supplement{

    private long serialNumber;//序列号
    public String description;//描述
    private int stock=999;//库存

    public handmadeTool (){
        this.type="handmadeTool";
        this.serialNumber= new Date().getTime();
        this.description="Default Description";
    }

    public handmadeTool(handmadeTool tool) {
        type= tool.type;
        serialNumber = tool.serialNumber;
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

    public long getSerialNumber(){
        return this.serialNumber;
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



    @Override
    public String toString() {
        return "class handmadeTool extends supplement";
    }

}
