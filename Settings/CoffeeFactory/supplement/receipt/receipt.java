package Settings.CoffeeFactory.supplement.receipt;

import Settings.CoffeeFactory.areas.Area;
import Settings.CoffeeFactory.supplement.supplement;

public class receipt extends supplement {

    enum receiptType{
        commonReceipt,purchaseReceipt,taxReceipt
    }

    private receiptType type;
    private String info;

    public receipt(String model,String id,receiptType type,String info){
        super(model, id);
        this.type=type;
        this.info=info;
    }

    private receiptType getReceiptType(){
        return type;
    }

    private String getInfo(){
        return this.info;
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

}
