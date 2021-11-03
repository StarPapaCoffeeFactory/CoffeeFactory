package Settings.CoffeeFactory.supplement.receipt;

import Settings.CoffeeFactory.supplement.receipt.receipt;
import Settings.CoffeeFactory.supplement.receipt.provider.commonProvider;
import Settings.CoffeeFactory.supplement.receipt.provider.purchaseProvider;

/**
 * @author:zpz
 * @date 2021.10.16 星期六 20:12
 * @info :
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