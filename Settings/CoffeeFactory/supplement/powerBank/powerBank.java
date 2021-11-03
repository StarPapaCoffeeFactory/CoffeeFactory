package Settings.CoffeeFactory.supplement.powerBank;

import Settings.CoffeeFactory.areas.Area;
import Settings.CoffeeFactory.supplement.supplement;

import java.util.ArrayList;
import java.util.Arrays;

public class powerBank extends supplement {

    protected boolean isUsed;
    protected int id;
    private int stock=9999;//库存
    private int batteryLife;//电量
    public ArrayList<String> portType;//接口种类

    enum port{
        MICRO_USB,USB_A,USB_C,LIGHTNING
    }

    public powerBank(){
        this.type="powerBank";
        this.isUsed=false;
        this.id=stock;
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

    public boolean getPowerBank(){
        if (this.isUsed) {
            System.out.println("This supplement is being used!");
            return false;
        }

        System.out.println("Ready to use!");
        this.isUsed = true;
        stock--;//or this.stock?
        return true;
    }

    public boolean returnPowerBank(){
        if (!this.isUsed) {
            System.out.println("This powerBank is idle!");
            return false;
        }

        System.out.println("Successfully returned!");
        this.isUsed = false;
        stock++;//same above
        return true;
    }



    @Override
    public String toString() {
        return "class visitors extends Person";
    }

}
