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
            index += 1;
            return workerList.get(index);
        }
        return null;
    }

    /**
     * 令索引指向前一个元素
     *
     * @return 前一个元素
     */
    public Staff previous() {
        index -= 1;
        return workerList.get(index);
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
     * 获取当前元素
     *
     * @return 当前元素
     */
    public Staff current(){
        return workerList.get(index);
    }

    /**
    * 返回当前的工作人员列表（新开一个空间）
    */
    public List<Staff> getWorkerList() {
        return new ArrayList<>(workerList);
    }

    /**
     * 设置一个工作人员列表
     */
    public void setWorkerList(ArrayList<Staff> workerList) {
        this.workerList = new ArrayList<Staff>(workerList);
    }

    /**
     * 获取当前索引
     */
    public int getIndex() {
        return index;
    }

    /**
     * 设置当前索引
     */
    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "class WorkerListIterator implements Iterator";
    }

}
