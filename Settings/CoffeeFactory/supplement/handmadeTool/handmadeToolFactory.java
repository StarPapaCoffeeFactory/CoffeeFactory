package Settings.CoffeeFactory.supplement.handmadeTool;

import Settings.CoffeeFactory.supplement.handmadeTool.handmadeTool;

/**
 * @author ZPZ
 * @description class handmadeToolFactory
 * @date 2021/10/27 14:10
 */

public class handmadeToolFactory {

    //tool warehouse
    private static handmadeTool handmadeTool = new handmadeTool();

    public static void reset() {
        handmadeTool = new handmadeTool();
    }

    //get handmadeTool from tool warehouse
    public static handmadeTool getHandMadeTool() {
        handmadeTool.ref();
        return handmadeTool;
    }

    public static handmadeTool getDefaultHandmadeTool() {
        return handmadeTool;
    }

    private handmadeToolFactory() {
    }
}
