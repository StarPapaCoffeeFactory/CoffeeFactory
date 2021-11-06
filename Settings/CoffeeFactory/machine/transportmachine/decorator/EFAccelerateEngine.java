package Settings.CoffeeFactory.machine.transportmachine.decorator;

/**
 * @description: EnvironmentFriendlyAcclerateEngine(环保)
 * @author: ShenBo
 * @date: 2021-10-31 22:38:15
 */
public class EFAccelerateEngine extends Decorator {

    public EFAccelerateEngine(Engine engine) {
        super(engine);
    }

    /**
     * @return void
     * @author ShenBo
     * @description specific features : save energy
     * @date 2021/10/31 23:57
     */
    public void saveEnergy() {
        System.out.println("Saving Energy...");
    }

    /**
     * @return void
     * @author ShenBo
     * @description execute accelerate and execute specific features
     * @date 2021/10/31 23:57
     */
    @Override
    public void accelerate() {
        super.accelerate();
        saveEnergy();
    }}
