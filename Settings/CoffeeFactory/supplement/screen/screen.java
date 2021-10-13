package Settings.CoffeeFactory.supplement.screen;

import Settings.CoffeeFactory.areas.Area;
import Settings.CoffeeFactory.supplement.supplement;

public abstract class screen extends supplement {

    private String context;//屏幕内容

    public screen(String model,String id,String context){
        super(model, id);
        this.context=context;
    }

    private String getContext(){
        return this.context;
    }

    @Override
    public String toString() {
        return "class Visitor extends Person";
    }

}
