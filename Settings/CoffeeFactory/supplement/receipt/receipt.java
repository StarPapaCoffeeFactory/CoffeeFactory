package Settings.CoffeeFactory.supplement.receipt;

import Settings.CoffeeFactory.supplement.receipt.provider.provider;


public abstract class receipt {

    public enum receiptType{
        commonReceipt,taxReceipt,purchaseReceipt
    }

    /**
     * Amount of invoice
     */
    private Double money = 9999.91;

    /**
     * Provider information of invoice
     */
    private provider provider;


    /**
     * Details of the receipt
     */
    private String info;


    /**
     * type of receipt,
     * It is divided into three parts:TAXRECEIPT, COMMONRECEIPT, PURCHASERECEIPT;
     */
    private receiptType type;

    /**
     *
     * @param info: message of the receipt;
     * @param type: type of the receipt
     */
    protected receipt(String info, receiptType type, provider provider) {
        this.provider = provider;
        this.info = info;
        this.type = type;
    }

    /**
     * @return: String type of this Receipt;
     */
    @Override
    public String toString() {
        return "receipt{" +
                "money=" + money +
                ", provider=" + provider +
                ", info='" + info + '\'' +
                ", type=" + type +
                '}';
    }


    //may need annotation
    public void displayAll() {
        System.out.println("----------------------------------------------------------"+ this.type +"--------------------------------------------------------------");
        System.out.printf("%-10s%-30s%-20s%-30s%-30s%-30s", "|money", "|info", "|type", "|providerName", "|providerTel", "|providerAdd");
        System.out.println();
        System.out.printf("%-10s%-30s%-20s%-30s%-30s%-30s", "|" + this.money, "|" + this.info, "|" + this.type, "|" + this.provider.getProviderName(),"|" + this.provider.getProviderTel(),"|" + this.provider.getProviderAdd());
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
    }
}