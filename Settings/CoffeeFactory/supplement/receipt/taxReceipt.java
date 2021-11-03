package Settings.CoffeeFactory.supplement.receipt;

import Settings.CoffeeFactory.supplement.receipt.receipt;
import Settings.CoffeeFactory.supplement.receipt.provider.taxProvider;

/**
 * @author:zpz
 * @date 2021.10.16 星期六 20:12
 * @info :
 */

public final class taxReceipt extends receipt {

    /**
     * @param info:message of the receipt;
     */
   public taxReceipt(String info){
       // constructor redirection
       this(info, receiptType.taxReceipt);
   }

    /**
     * @param info : message of the receipt;
     * @param type : type of the receipt
     */
   protected taxReceipt(String info, receiptType type) {
       super(info, type,new taxProvider("taxProviderName","taxProviderTel","taxProviderAdd"));
   }

}