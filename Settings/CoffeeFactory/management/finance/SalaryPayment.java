package Settings.CoffeeFactory.management.finance;


import Settings.CoffeeFactory.personnel.staff.Staff;
import Settings.CoffeeFactory.areas.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
/**
 * @ program: coffeefactory
 * @ description: 基本工资发放
 * @ author: YXJ
 * @ date: 2021-10-14 18:36:12
 */
public class SalaryPayment {

    protected ArrayList<Staff> staffList;
    private int payDay;
    protected Calendar curDate;


    protected SalaryPayment() {
        staffList = new ArrayList<Staff>();
        curDate = Calendar.getInstance();
        payDay = 28;
    }


    public void addStaff(Staff staff) {
//        if(staffList.stream().findAny(staff) )
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

    public void setCurDate(Date date)
    {/*
     *
     * @param date
     * @return void
     * @author YXJ
     * @description 设置当前日期后判断 若当月日期大于或等于payday 则为员工发工资
     * @date 2021/10/14 22:20
     */

        this.curDate.setTime(date);
        if( this.curDate.get(Calendar.DAY_OF_MONTH) + 1 >= payDay)
        {
            this.payOut();

        }
    }

    private void payOut() {
        for (Staff staff : staffList) {
            staff.getPaid();
        }
        System.out.println("已向所有员工发送通知：工资已发送");
    }

    public void changeSalary(double change)
    {
        for (Staff staff : staffList) {

            staff.updateSalary(change);
        }
        System.out.println("已向所有员工发送通知：工资已修改");
    }

}
