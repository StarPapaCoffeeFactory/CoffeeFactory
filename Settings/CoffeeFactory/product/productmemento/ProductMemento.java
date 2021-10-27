package Settings.CoffeeFactory.product.productmemento;

/**
 * @ program: CoffeeFactory.iml
 * @ description: ProductMemento
 * @ author: Kaiyu Huang
 * @ date: 2021-10-27 08:31:25
 */

public class ProductMemento {

    private int weight;

    public ProductMemento(int weight) {
        /*
         * @param weight
         * @return
         * @author Kaiyu Huang
         * @description constructor for ProductMemento
         * @date 2021/10/27 9:01
         */
        this.weight = weight;
    }

    public void setWeight(int weight) {
        /*
         * @param weight(product weight)
         * @return void
         * @author Kaiyu Huang
         * @description set product weight
         * @date 2021/10/27 8:15
         */
        this.weight = weight;
    }

    public int getWeight() {
        /*
         * @param
         * @return int
         * @author Kaiyu Huang
         * @description get product weight
         * @date 2021/10/27 8:15
         */
        return weight;
    }
}
