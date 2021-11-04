package Settings.CoffeeFactory.supplement.receipt;

import Settings.CoffeeFactory.supplement.receipt.receipt;
import Settings.CoffeeFactory.supplement.receipt.provider.commonProvider;

/**
 *
 * @return
 * @author ZPZ
 * @description class commonReceipt
 * @date 2021/10/27 14:10
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