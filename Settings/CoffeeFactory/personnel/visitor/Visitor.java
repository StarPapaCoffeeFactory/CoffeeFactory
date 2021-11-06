package Settings.CoffeeFactory.personnel.visitor;

import Settings.CoffeeFactory.areas.*;
import Settings.CoffeeFactory.areas.publicarea.PublicArea;
import Settings.CoffeeFactory.personnel.Personnel;
import Settings.CoffeeFactory.personnel.visitlimit.LimitContext;
/**
 * @description: 实际意义上的游客/参观者  区别于设计模式中的visitor
 * @author: YXJ
 * @date: 2021-10-12 21:15:35
 */
public class Visitor extends Personnel {


    public Visitor(String name, int age, Personnel.Gender gender, String Phone_num) {
        super(name, age, gender, Phone_num);
        this.identity = "visitors";
        this.setVisitLimit();
    }



    public void get_visit_permission() {
        //获取进入权限
        //可使用visitor实现

    }
    public void setVisitLimit()
    {/**
     * @return void
     * @author YXJ
     * @description 设置visitor的访问权限
     * @date 2021/10/13 18:01
     */
        String[] persons = {this.identity};
        String[] publicAreas = {AreaName.PUBLIC_AREA,AreaName.EXHIBITION_AREA, AreaName.COFFEE_EXPERIENCE_ROOM};
        this.visitLimit = new LimitContext(persons, publicAreas);
    }

    /**
     * @description visit a public area
     * However, a visitor can only be allowed to visit some place when it is not full.
     * @param dest destination
     */
    public boolean visit(PublicArea dest) {
        if (!dest.isFull()) {
            System.out.println("visitors " + this.name + "visits" + dest.toString());
            this.Goto(dest);
            return true;
        } else {
            System.out.println("Sorry, the" + dest.toString() + "is already full.");
            return false;
        }
    }

//    public boolean canEnter(Area dest) {
//        String movestr = this.identity + " enter " + dest.toString();
//        if (this.visitLimit.canAccess(movestr)) {
//            return true;
//        } else {
//            return false;
//        }
//    }


//    public void transfer(Area dest) {
//        if (this.canEnter(dest.toString())) {
//            this.location = dest;
//            System.out.println(this.identity + " " + this.name + " moves to " + dest.toString());
//        } else {
//            System.out.println("Sorry, " + this.identity + " " + this.name + "can 't go to" + dest.toString());
//        }
//    }

//    @Override
//    public void Goto(Area dest) {
//
//        if (this.canEnter(dest)) {
//            this.location = dest;
//
//            System.out.println(this.identity + " " + this.name + " goes to " + dest.toString());
//
//        } else {
//            System.out.println("Sorry, " + this.identity + " " + this.name + "can 't go to" + dest.toString());
//        }
//    }

//    public int getVisitCode() {
//        return visitCode;
//    }

    public void Show_all_accessible_areas() {
        //待实现
        //for loop
        //System.out.print(this.visitLimit.canEnter(uniarea));
    }



    @Override
    public String toString() {
        return "class visitors extends Person";
    }
}
