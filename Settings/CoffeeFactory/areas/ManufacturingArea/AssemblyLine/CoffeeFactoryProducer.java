package Settings.CoffeeFactory.areas.ManufacturingArea.AssemblyLine;

/***
 * @author ZJX
 * @description This class is used to get our specific coffee line
 */
public class CoffeeFactoryProducer {
    /***
     * @param factoryName
     * @return AssemblyLine
     * @author ZJX
     * @description This method is used to obtain our specific coffee line
     */
    public static AssemblyLine newChocoMachine(String factoryName) {
        return new CoffeeAssemblyLine();
    }
}
