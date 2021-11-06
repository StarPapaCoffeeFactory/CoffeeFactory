package Settings.CoffeeFactory.machine.transportmachine.decorator;

/**
 * @description: FastAccelerateEngine
 * @author: ShenBo
 * @date: 2021-10-31 22:42:28
 */
public class FastAccelerateEngine extends Decorator {

    public FastAccelerateEngine(Engine engine) {
        super(engine);
    }

    /**
     * @return void
     * @author ShenBo
     * @description specific features : super accelerate
     * @date 2021/10/31 23:58
     */
    public void superAccelerate() {
        System.out.println("Super Accelerating...");
    }

    /**
     * @return void
     * @author ShenBo
     * @description execute accelerate and execute specific features
     * @date 2021/10/31 23:58
     */
    @Override
    public void accelerate() {
        super.accelerate();
        superAccelerate();
    }
}
