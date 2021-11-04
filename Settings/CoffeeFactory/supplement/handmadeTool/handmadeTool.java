package Settings.CoffeeFactory.supplement.handmadeTool;

import Settings.CoffeeFactory.supplement.supplement;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @return
 * @author ZPZ
 * @description class handmadeTool
 * @date 2021/10/27 14:10
 */

public class handmadeTool extends supplement{

    private long serialNumber;//工具序列号
    public String description;//描述
    private int usageCount=0;//使用次数
    private int stock=999;

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

    public int getUsageCount(){
        return this.usageCount;
    }

    //
    public void ref() {
        usageCount++;
    }

    public void deref(){
        usageCount--;
    }



    @Override
    public String toString() {
        return "class handmadeTool extends supplement";
    }

}
