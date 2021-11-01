package Settings.CoffeeFactory.areas.workeriterator;

/***
 * @author ZJX
 * @description The interface class of Iterator
 */
public interface Iterator {
    /***
     * @return Object
     * @author ZJX
     * @description Returns the first element of the iterator
     */
    Object first();

    /***
     * @return Object
     * @author ZJX
     * @description Returns the next element of the iterator
     */
    Object next();

    /***
     * @return Object
     * @author ZJX
     * @description Determines if there is another element in the iterator
     */
    boolean hasNext();
}
