package Settings.CoffeeFactory.areas.manufacturingarea.AssemblyLine;

/***
 * @author lc,ZJX
 * @description This class is used to get our specific coffee line
 */
public class CoffeeFactoryProducer {
    /***
     * @param factoryName
     * @return AssemblyLine
     * @author lc,ZJX
     * @description This method is used to obtain our specific coffee line
     */
    public static AssemblyLine newCoffeeMachine(String factoryName) {
        if(AssemblyLineName.ARABICA_COFFEE_FACTORY.equals(factoryName)) {
            return new ArabicaCoffeeAssemblyLine();
        }else if(AssemblyLineName.ROBUSTA_COFFEE_FACTORY.equals(factoryName)){
            return new RobustaCoffeeAssemblyLine();
        }else {
            throw new RuntimeException("factoryName is error");
        }
    }
}
