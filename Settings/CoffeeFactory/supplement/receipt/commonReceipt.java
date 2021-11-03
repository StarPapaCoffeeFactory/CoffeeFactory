package Settings.CoffeeFactory.supplement.receipt;

import Settings.CoffeeFactory.supplement.receipt.receipt;
import Settings.CoffeeFactory.supplement.receipt.provider.commonProvider;

/**
 * @author:zpz
 * @date 2021.10.16 星期六 20:12
 * @info :common receipt, once determined, is immutable, so use final for a modification.
 */

public final class commonReceipt extends receipt {


    /**
     * @param info:message of the receipt;
     */
    public commonReceipt(String info){
        this(info, receiptType.commonReceipt);
    }

    /**
     * @param info : message of the receipt;
     * @param type : type of the receipt
     */
    protected commonReceipt(String info, receiptType type) {
        super(info, type, new commonProvider("commonProviderName","commonProviderTel","commonProviderAdd"));
    }


}