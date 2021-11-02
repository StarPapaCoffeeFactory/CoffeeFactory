package Settings.CoffeeFactory.areas.manufacturingarea.Workshop;

import Settings.CoffeeFactory.areas.manufacturingarea.AssemblyLine.ArabicaCoffeeAssemblyLine;
import Settings.CoffeeFactory.areas.manufacturingarea.AssemblyLine.RobustaCoffeeAssemblyLine;

/**
 * @author lc
 * @description a class to create specific workshop
 */
public class WorkshopProducer {
    public static Workshop newWorkshop(String workshopName) {
        if("CoffeeProductWorkshop".equals(workshopName)) {
            return new CoffeeProductWorkshop();
        }else if("CoffeeWorkshop".equals(workshopName)){
            return new CoffeeWorkshop();
        }else {
            throw new RuntimeException("workshopName is error");
        }
    }
}
