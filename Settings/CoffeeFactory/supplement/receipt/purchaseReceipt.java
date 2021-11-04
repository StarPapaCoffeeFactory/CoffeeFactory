package Settings.CoffeeFactory.supplement.receipt;

import Settings.CoffeeFactory.supplement.receipt.receipt;
import Settings.CoffeeFactory.supplement.receipt.provider.commonProvider;
import Settings.CoffeeFactory.supplement.receipt.provider.purchaseProvider;

/**
 *
 * @return
 * @author ZPZ
 * @description class purchaseReceipt
 * @date 2021/10/27 14:10
 */

public final class purchaseReceipt extends receipt {


    /**
     * @param info:message of the receipt;
     */
    public purchaseReceipt(String info){
        // constructor redirection
        this(info, receiptType.purchaseReceipt);
    }

    /**
     * @param info : message of the receipt;
     * @param type : type of the receipt
     */
    protected purchaseReceipt(String info, receiptType type) {
        super(info, type, new purchaseProvider("purchaseProviderName","purchaseProviderTel","purchaseProviderAdd"));
    }


}