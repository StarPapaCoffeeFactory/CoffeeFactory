package Settings.CoffeeFactory.supplement.powerBank;

import Settings.CoffeeFactory.areas.Area;
import Settings.CoffeeFactory.supplement.supplement;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @return
 * @author ZPZ
 * @description class powerBank
 * @date 2021/10/27 14:10
 */

public class powerBank extends supplement {

    protected boolean isUsed;
    protected int id;
    private int stock=9999;//库存
    private int fixedStock=9999;//静态库存
    private int batteryLife;//电量
    public ArrayList<String> portType;//接口种类

    enum port{
        MICRO_USB,USB_A,USB_C,LIGHTNING
    }

    public powerBank(){
        this.type="powerBank";
        this.isUsed=false;
        fixedStock++;
        this.id=fixedStock;
        stock++;

        this.batteryLife=100;
        this.portType=new ArrayList<String>() {
            {
                add("MICRO_USB");
                add("USB_A");
                add("USB_C");
                add("LIGHTNING");
            }
        };
    }

    public ArrayList<String> getPortType()
    {
        return this.portType;
    }

    public boolean getUsageState()
    {
        return isUsed;
    }

    public int getBatteryLife(){
        return this.batteryLife;
    }

    public int getStock(){
        return this.stock;
    }

    public int getFixedStock(){
        return fixedStock;
    }

    public boolean getPowerBank(){
        if (this.isUsed) {
            System.out.println("This power bank is being used! You can't take it!");
            return false;
        }

        System.out.println("Ready to use!");
        this.isUsed = true;
        stock--;
        return true;
    }

    public boolean returnPowerBank(){
        if (!this.isUsed) {
            System.out.println("This powerBank is idle! You don't need to return!");
            return false;
        }

        System.out.println("Successfully returned!");
        this.isUsed = false;
        stock++;
        return true;
    }



    @Override
    public String toString() {
        return "class visitors extends Person";
    }

}
