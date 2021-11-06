package Settings.CoffeeFactory.product.productmemento;

/**
 * @description: ProductCaretaker
 * @author: Kaiyu Huang
 * @date: 2021-10-27 08:31:25
 */

public class ProductCaretaker {

    private ProductMemento productMemento;

    public void setProductMemento(ProductMemento productMemento) {
        /*
         * @param productMemento
         * @return void
         * @author Kaiyu Huang
         * @description store information to product memento
         * @date 2021/10/27 9:02
         */
        this.productMemento = productMemento;
    }

    public ProductMemento getProductMemento() {
        /*
         * @param
         * @return Settings.CoffeeFactory.product.productmemento.ProductMemento
         * @author Kaiyu Huang
         * @description get product memento
         * @date 2021/10/27 9:02
         */
        return productMemento;
    }
}
