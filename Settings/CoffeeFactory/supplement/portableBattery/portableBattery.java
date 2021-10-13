package Settings.CoffeeFactory.supplement.portableBattery;

import Settings.CoffeeFactory.areas.Area;
import Settings.CoffeeFactory.supplement.supplement;

public class portableBattery extends supplement{

    private int stock;
    private int batteryLife;

    public portableBattery(String model,String id,int stock,int batteryLife){
        super(model, id);
        this.stock=stock;
        this.batteryLife=batteryLife;
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
            System.out.println(this.model + " can enter" + dest);
            return true;
        } else {
            System.out.println("Sorry! " + this.model + " cannot enter " + dest);
            return false;
        }
    }

    @Override
    public void Goto(Area dest) {

        if (this.canEnter(dest.toString())) {
            this.location = dest;
            System.out.println(this.id + " " + this.model + " can be allocated to " + dest.toString());
        } else {
            System.out.println("Sorry, " + this.id + " " + this.model + "can not be allocated to" + dest.toString());
        }
    }

    @Override
    public String toString() {
        return "class Visitor extends Person";
    }

}
