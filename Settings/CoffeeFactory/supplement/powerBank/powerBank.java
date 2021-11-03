package Settings.CoffeeFactory.supplement.powerBank;

import Settings.CoffeeFactory.areas.Area;
import Settings.CoffeeFactory.supplement.supplement;

import java.util.ArrayList;

public class powerBank extends supplement {

    protected boolean isUsed;
    protected int id;
    private int stock=9999;//库存
    private int batteryLife;//电量
    public ArrayList<port> portType;//接口种类

    enum port{
        MICRO_USB,USB_A,USB_C,LIGHTNING
    }

    public powerBank(){
        this.type="powerBank";
        this.isUsed=false;
        this.id=stock;
        stock++;
        this.batteryLife=100;
        this.portType=new ArrayList<port>();
    }

    public ArrayList<port> getPortType()
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

    /*
    public boolean canEnter(String dest) {
        String move = this.id + " enter " + dest;
        if (this.visitLimit.canAccess(move)) {
            System.out.println(this.type + " can enter" + dest);
            return true;
        } else {
            System.out.println("Sorry! " + this.type + " cannot enter " + dest);
            return false;
        }
    }*/

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
        return "class visitors extends Person";
    }

}
