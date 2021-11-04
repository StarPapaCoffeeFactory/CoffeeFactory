package Settings.CoffeeFactory.supplement.receipt.provider;

/**
 *
 * @return
 * @author ZPZ
 * @description class provider
 * @date 2021/10/27 14:10
 */

public abstract class provider {

    private String providerName;//provider's name

    private String providerTel;//provider's telephone number

    private String providerAdd;//provider's address

    //constructor with no parameters
    public provider() {
    }

    //constructor with parameters
    public provider(String providerName, String providerTel, String providerAdd) {
        this.providerName = providerName;
        this.providerTel = providerTel;
        this.providerAdd = providerAdd;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderTel(String providerTel) {
        this.providerTel = providerTel;
    }

    public String getProviderTel() {
        return providerTel;
    }

    public void setProviderAdd(String providerAdd) {
        this.providerAdd = providerAdd;
    }

    public String getProviderAdd() {
        return providerAdd;
    }

    @Override
    public String toString() {
        return "Provider{" +
                "providerName='" + providerName + '\'' +
                ", providerTel='" + providerTel + '\'' +
                ", providerAdd='" + providerAdd + '\'' +
                '}';
    }
}