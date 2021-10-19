package Settings.CoffeeFactory.areas.WorkerIterator;

import Settings.CoffeeFactory.personnel.staff.Staff;

import java.util.ArrayList;
import java.util.List;

public class WorkerListIterator implements Iterator {

    /**
     * 工人列表
     */
    private ArrayList<Staff> workerList = null;

    /**
     * 当前索引
     */
    private int index = -1;

    public WorkerListIterator() {
        workerList = new ArrayList<Staff>();
    }

    public WorkerListIterator(ArrayList<Staff> workerList) {
        this.workerList = workerList;
    }


    /**
     * 令索引指向第一个元素
     *
     * @return 第一个元素
     */
    @Override
    public Staff first() {
        index = 0;
        return workerList.get(index);
    }

    /**
     * 令索引指向下一个元素
     *
     * @return 下一个元素
     */
    @Override
    public Staff next() {
        if (this.hasNext()) {
            return workerList.get(++index);
        }
        return null;
    }

    /**
     * 判断是否存在下一个元素
     *
     * @return 若有则返回true
     */
    @Override
    public boolean hasNext() {
        return index < workerList.size() - 1;
    }

    /**
     * 令索引指向最后一个元素
     *
     * @return 最后一个元素
     */
    public Staff last() {
        index = workerList.size() - 1;
        return workerList.get(index);
    }

    /**
     * 令索引指向前一个元素
     *
     * @return 前一个元素
     */
    public Staff previous() {
        return workerList.get(--index);
    }


    public List<Staff> getWorkerList() {
        return new ArrayList<>(workerList);
    }

    public void setWorkerList(ArrayList<Staff> workerList) {
        this.workerList = new ArrayList<Staff>(workerList);
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "class WorkerListIterator implements Iterator";
    }

}
