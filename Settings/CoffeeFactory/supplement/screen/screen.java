package Settings.CoffeeFactory.supplement.screen;

import Settings.CoffeeFactory.supplement.supplement;

public class screen extends supplement {
    private static String context = "Hello! StarpapaCoffee!";//屏幕内容
    public screen() {
        this.type = "screen";
    }

    public void setContent(String context) {
        this.context = context;
    }
    public String getContext(){
        return this.context;
    }

    @Override
    public String toString() {
        return "class visitors extends Person";
    }

}
