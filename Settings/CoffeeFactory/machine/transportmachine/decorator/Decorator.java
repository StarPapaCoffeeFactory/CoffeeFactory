package Settings.CoffeeFactory.machine.transportmachine.decorator;

/**
 * @ program: CoffeeFactory.iml
 * @ description: Decorator
 * @ author: ShenBo
 * @ date: 2021-10-31 21:31:54
 */
public abstract class Decorator implements Engine{
    private Engine engine;

    public Decorator(Engine engine) {
        this.engine = engine;
    }

    /*
     * @return void
     * @author ShenBo
     * @description execute accelerate
     * @date 2021/10/31 23:57
     */
    public void accelerate() {
        engine.accelerate();
    }
}
