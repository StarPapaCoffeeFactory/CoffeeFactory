package Settings.CoffeeFactory.management.finance;


import Settings.CoffeeFactory.personnel.staff.Staff;
import Settings.CoffeeFactory.areas.*;
import java.util.ArrayList;

/**
 * @ program: coffeefactory
 * @ description: 基本工资发放
 * @ author: YXJ
 * @ date: 2021-10-14 18:36:12
 */
public class SalaryPayment {
    protected ArrayList<Staff> staffList;
    protected double salary_change ;

    protected SalaryPayment() {
        staffList = new ArrayList<Staff>();
        this.salary_change = 0;
    }


    public void addStaff(Staff staff) {
        staffList.add(staff);
        System.out.println("Add " + staff.getName() + " successfully.");
    }


    public void addAllStaffs(StaffArea staffArea) {
        ArrayList<Worker> list = staffArea.getWorkerList();
        staffList.addAll(list);
        System.out.println("Add all staffs in " + staffArea.toString() + " successfully.");
    }

    public void removeStaff(Staff staff) {
        staffList.remove(staff);
    }

    public void removeStaff(String name) {
        if (staffList.removeIf(worker -> worker.getName().equals(name))) {
            System.out.println("Remove " + name + " successfully.");
        } else {
            System.out.println(name + " is not in the staff list of this payroll.");
        }

    }



    public void payOut() {
        for (Staff staff : staffList) {
            staff.getPaid();
        }
    }



}
