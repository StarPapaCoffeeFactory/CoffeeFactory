package Settings.CoffeeFactory.personnel.staff;

/**
 * @ program: coffeefactory
 * @ description: ob
 * @ author: YXJ
 * @ date: 2021-10-14 19:27:51
 */
public interface Observer {
    void getPaid();
    void updateSalary(double change);
}
