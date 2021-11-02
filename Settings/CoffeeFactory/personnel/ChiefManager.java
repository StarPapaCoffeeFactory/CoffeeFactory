package Settings.CoffeeFactory.personnel;

import Settings.CoffeeFactory.areas.Area;
import Settings.CoffeeFactory.personnel.staff.Manager;

import java.util.ArrayList;

/**
 * @author CZQ
 * @project CoffeeFactory
 * @classname ChiefManager
 * @description ChiefManager class
 * @DesignPattern Singleton
 * @date 2021/10/15
 */

public class ChiefManager extends Personnel {
    public String identity;/// = "Chief Manager";

    private static ChiefManager instance = null;

    public ArrayList<Manager> managerList;

    /**
     *取得唯一ChiefManager对象
     * @return instance of Chief manager
     */
    public static ChiefManager getInstance() {
        if (instance == null) {
            //System.out.println("\n-》A Chief manager has been created! ---- MESSAGE FROM <class ChiefManager> ----");
            instance = new ChiefManager("Chief Lee", 50, Gender.male, "15858885888");
        }
        return instance;
    }

    /**
     * 获取并解决一个反馈的问题
     */
    public void getFeedBack() {
        System.out.println("Chief Manager \""+this.name+"\" has gotten the feedback and solve it.");
    }

    /**
     * 添加一个经理
     * @param manager manager
     */
    public void addManager(Manager manager) {
        if (manager != null) {
            this.managerList.add(manager);
        }
    }

    /**
     * 为经理分配任务
     */
    public void distributeWork() {
        if (managerList.isEmpty()) {
            System.out.println("There's no manager. Please add some managers first.");
        }
        for (Manager manager : managerList) {
            System.out.println("Work has been distributed to " + manager.name);
            manager.dispatchTask();
        }
    }


    @Override
    public String toString() {
        return "public class ChiefManager extends Personnel";
    }


    /**
     * ChiefManager can move to anywhere.
     * @param dest destination
     */
    public void Goto(Area dest) {
        this.location = dest;
        System.out.println("The Chief Manager " + this.name + "moves to " + dest.toString());
    }

    public void setVisitLimit()
    {

    }
    /**
     * show basic info
     */
    public void display()
    {
        String gender_str;
        if(gender.toString()=="male")
            gender_str="man";
        else
            gender_str="woman";

        System.out.println("name："+name+"  sex："+gender_str+"  age："+getAge()+"  identity:"+ identity);
    }

    /**
     *私有构造函数
     * @param name 姓名
     * @param age  年龄
     * @param gender 性别
     * @param phnum 手机号
     */
    private ChiefManager(String name, int age, Gender gender, String phnum) {
        super(name, age, gender, phnum);
        managerList = new ArrayList<Manager>();
        identity = "Chief Manager";
    }

}
