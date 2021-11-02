package Settings.CoffeeFactory.machine.transportmachine.decorator;

import Settings.CoffeeFactory.machine.transportmachine.TransportMachine;
import Settings.CoffeeFactory.machine.transportmachine.adapter.Aircraft;

/**
 * @ program: CoffeeFactory.iml
 * @ description: AccelerateEngine
 * @ author: ShenBo
 * @ date: 2021-10-31 22:33:48
 */
public class AccelerateEngine implements Engine{
    Aircraft aircraft;
    public AccelerateEngine(Aircraft aircraft)
    {
        this.aircraft=aircraft;
    }
    /*
     * @return void
     * @author ShenBo
     * @description accelerate the aircraft
     * @date 2021/10/31 22:45
     */
    @Override
    public void accelerate() {
        System.out.println("The Aircraft"+aircraft.getID() +" is accelerating...");
    }
}
