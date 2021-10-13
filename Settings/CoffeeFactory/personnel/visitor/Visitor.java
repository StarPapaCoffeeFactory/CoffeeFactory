package Settings.CoffeeFactory.personnel.visitor;

import Settings.CoffeeFactory.areas.*;
import Settings.CoffeeFactory.personnel.Personnel;
import Settings.CoffeeFactory.personnel.visitlimit.LimitContext;

public class Visitor extends Personnel {

    public boolean is_permitted = false;
    public int visitCode;//maybe string

    public Visitor(String name, int age, Personnel.Gender gender, String Phone_num) {


        super(name, age, gender, Phone_num);
        this.identity = "Visitor";
        this.SetVisitLimit();
    }


    public Visitor(String name, int age, Personnel.Gender gender, String Phone_num, int visitCode) {


        super(name, age, gender, Phone_num);
        this.identity = "Visitor";
        this.SetVisitLimit();
        this.visitCode = visitCode;
        is_permitted = true;
    }

    public void get_visit_permission() {
        //获取进入权限
        //可使用visitor实现

    }
    public void SetVisitLimit()
    {/*
     *
     * @return void
     * @author YXJ
     * @description 设置visitor的访问权限
     * @date 2021/10/13 18:01
     */
        String[] persons = {this.identity};
        String[] publicAreas = {"publicArea", "experienceRoom", "exhibitionRoom"};
        this.visitLimit = new LimitContext(persons, publicAreas);
    }

    /**
     * visit a public area
     * However, a visitor can only be allowed to visit some place when it is not full.
     *
     * @param dest destination
     */
    public boolean visit(PublicArea dest) {
        if (!dest.isFull()) {
            System.out.println("Visitor " + this.name + "visits" + dest.toString());
            this.Goto(dest);
            return true;
        } else {
            System.out.println("Sorry, the" + dest.toString() + "is already full.");
            return false;
        }
    }

    public boolean canEnter(String dest) {
        String movestr = this.identity + " enter " + dest;
        if (this.visitLimit.canAccess(movestr)) {
            //System.out.println(this.name + " can enter" + dest);
            return true;
        } else {
            //System.out.println("Sorry! " + this.name + " cannot enter " + dest);
            return false;
        }
    }


//    public void transfer(Area dest) {
//        if (this.canEnter(dest.toString())) {
//            this.location = dest;
//            System.out.println(this.identity + " " + this.name + " moves to " + dest.toString());
//        } else {
//            System.out.println("Sorry, " + this.identity + " " + this.name + "can 't go to" + dest.toString());
//        }
//    }

    @Override
    public void Goto(Area dest) {

        if (this.canEnter(dest.toString())) {
            this.location = dest;

            System.out.println(this.identity + " " + this.name + " goes to " + dest.toString());

        } else {
            System.out.println("Sorry, " + this.identity + " " + this.name + "can 't go to" + dest.toString());
        }
    }

    public int getVisitCode() {
        return visitCode;
    }

    public void Show_all_accessible_areas() {
        //待实现
        //for loop
        //System.out.print(this.visitLimit.canEnter(uniarea));
    }

    /**
     * set the initial asset of the visitor;
     */
    @Override
    protected void setInitialAsset() {
        this.asset = 1000;
    }

    @Override
    public String toString() {
        return "class Visitor extends Person";
    }
}
