package Settings.CoffeeFactory.supplement.receipt;

import Settings.CoffeeFactory.areas.Area;
import Settings.CoffeeFactory.supplement.supplement;

public class receipt extends supplement {

    enum receiptType{
        commonReceipt,purchaseReceipt,taxReceipt
    }

    private receiptType receiptType;
    private String info;

    public receipt(){
        this.type="receipt";
        this.receiptType=getReceiptType();
        this.info=getInfo();
    }

    private receiptType getReceiptType(){
        return receiptType;
    }

    private String getInfo(){
        return this.info;
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

}
