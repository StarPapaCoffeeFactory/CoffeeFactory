package Settings.CoffeeFactory.areas.workeriterator;

import Settings.CoffeeFactory.personnel.staff.Staff;

import java.util.ArrayList;
import java.util.List;

/***
 * @author ZJX
 * @description The iterator of worker
 */
public class WorkerListIterator implements Iterator {

    /***
     * @author ZJX
     * @description worker list
     */
    private ArrayList<Staff> workerList = null;

    /***
     * @author ZJX
     * @description The current index
     */
    private int index = -1;

    public WorkerListIterator() {
        workerList = new ArrayList<Staff>();
    }

    public WorkerListIterator(ArrayList<Staff> workerList) {
        this.workerList = workerList;
    }

    /***
     * @return Staff
     * @author ZJX
     * @description Make the index point to the first element and return the first element
     */
    @Override
    public Staff first() {
        index = 0;
        return workerList.get(index);
    }

    /***
     * @return Staff
     * @author ZJX
     * @description Make the index point to the next element and return the next element
     */
    @Override
    public Staff next() {
        if (this.hasNext()) {
            index += 1;
            return workerList.get(index);
        }
        return null;
    }

    /***
     * @return Staff
     * @author ZJX
     * @description Make the index point to the previous element and return the previous element
     */
    public Staff previous() {
        index -= 1;
        return workerList.get(index);
    }

    /***
     * @return boolean
     * @author ZJX
     * @description Determines if there is another element in the iterator
     */
    @Override
    public boolean hasNext() {
        return index < workerList.size() - 1;
    }

    /***
     * @return Staff
     * @author ZJX
     * @description Make the index point to the last element and return the last element
     */
    public Staff last() {
        index = workerList.size() - 1;
        return workerList.get(index);
    }

    /***
     * @return Staff
     * @author ZJX
     * @description Get the current element
     */
    public Staff current(){
        return workerList.get(index);
    }

    /***
     * @return List<Staff>
     * @author ZJX
     * @description Returns the current staff list (a new space is opened)
     */
    public List<Staff> getWorkerList() {
        return new ArrayList<>(workerList);
    }

    /***
     * @param workerList
     * @return void
     * @author ZJX
     * @description Set up a list of workers
     */
    public void setWorkerList(ArrayList<Staff> workerList) {
        this.workerList = new ArrayList<Staff>(workerList);
    }

    /***
     * @return int
     * @author ZJX
     * @description Get current index
     */
    public int getIndex() {
        return index;
    }

    /***
     * @param index
     * @return void
     * @author ZJX
     * @description Set the current index
     */
    public void setIndex(int index) {
        this.index = index;
    }

    /***
     * @return String
     * @author ZJX
     * @description Returns which class implements the iterator interface
     */
    @Override
    public String toString() {
        return "class WorkerListIterator implements Iterator";
    }

}
