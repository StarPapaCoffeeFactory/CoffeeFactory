package Settings.CoffeeFactory.supplement.portableBattery;

import Settings.CoffeeFactory.areas.Area;
import Settings.CoffeeFactory.supplement.supplement;

import java.util.ArrayList;

public class portableBattery extends supplement{

    private int stock;
    private int batteryLife;//电量
    public ArrayList<port> portType;//接口种类

    enum port{
        MICRO_USB,USB_A,USB_C,LIGHTNING
    }

    public portableBattery(){
        this.type="portableBattery";
        this.stock=10;
        this.batteryLife=100;
        this.portType=new ArrayList<port>();
    }


    private int getBatteryLife(){
        return this.batteryLife;
    }

    private int getStock(){
        return this.stock;
    }

    private void getPortableBattery(){
        stock--;
    }

    private void returnPortableBattery(){
        stock++;
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
