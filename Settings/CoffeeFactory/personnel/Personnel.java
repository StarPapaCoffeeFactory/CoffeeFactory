

package Settings.CoffeeFactory.personnel;

import Settings.CoffeeFactory.areas.Area;
import Settings.CoffeeFactory.areas.PublicArea.PublicArea;
import Settings.CoffeeFactory.personnel.visitlimit.LimitContext;

/**
 * @ program: coffeefactory
 * @ description: personnel 基类
 * @ author: YXJ
 * @ date: 2021-10-12 12:12:45
 */
public abstract class Personnel {

    protected String identity;
    protected String name;
    protected int age;
    protected String phonenum;
    public enum Gender {male, female};
    protected Gender gender;

    //protected double account_balance;// 账户余额
    protected Area location;//当前所在区域
    protected LimitContext visitLimit;//区域访问限制

    public Personnel(String name, int age, Gender gender , String phnum) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phonenum = phnum;
        this.identity = "abstract person";
        this.SetVisitLimit();
        this.location = null;

    }
    public Personnel(String name, int age, Gender gender , String phnum , Area area) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phonenum = phnum;
        this.identity = "abstract person";
        this.SetVisitLimit();
        this.location = area;
    }

    public String getName(){
        return this.name;
    }
    
    public int getAge(){
        return this.age;
    }

    public void setName(String name) {
        
        this.name = name;
    }

    public void setAge(int age) {
        
        this.age = age;
    }

    public void setGender(Personnel.Gender gender) {
        this.gender = gender;
    }

    public Personnel.Gender getGender() {
        
        return this.gender;
    }

    public boolean canEnter(Area dest) {
        String moveinfo = this.identity + " access " + dest.toString();
        if (this.visitLimit.canAccess(moveinfo)) {
            return true;
        } else {
            return false;
        }
    }

    public void Goto(Area dest) {

        if (this.canEnter(dest)) {

            this.location = dest;

            System.out.println(this.identity + " " + this.name + "进入了" + dest.toString());

        } else {
            System.out.println("抱歉，" + this.identity + " " + this.name + "无访问权限，不能进入" + dest.toString());
        }
    }
    public abstract void SetVisitLimit();

//    public boolean HandleRequest(Message requestMessage) {
//   /*
//    *
//    * @param requestMessage
//    * @return boolean
//    * @author YXJ
//    * @description 由子类重载
//    * @date 2021/10/13 17:50
//    */
//        return false;
//    }

    public String toString() {
        
        return "abstract class Personnel";
    }

}
