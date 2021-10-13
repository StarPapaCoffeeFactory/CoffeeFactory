

package Settings.CoffeeFactory.personnel;

import Settings.CoffeeFactory.areas.Area;
import Settings.CoffeeFactory.personnel.visitlimit.LimitContext;


public abstract class Personnel {

    protected String identity;
    protected String name;
    protected int age;
    protected String phonenum;
    public enum Gender {male, female};
    protected Gender gender;

    private float asset;//???
    protected Area location;//当前所在区域
    protected LimitContext visitLimit;//区域访问限制

    public Personnel(String name, int age, Gender gender , String phnum) {


        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phonenum = phnum;
        this.identity = "abstract person";
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

    public abstract void Goto(Area dest);

    public boolean HandleRequest(Message requestMessage) {
        /*
         *
         *
         * @param requestMessage
         * @return boolean
         * @author YXJ
         * @description  由继承类重构
         * @date 2021/10/12 17:14
         */

        return false;
    }

    public String toString() {
        
        return "abstract class Personnel";
    }

}
