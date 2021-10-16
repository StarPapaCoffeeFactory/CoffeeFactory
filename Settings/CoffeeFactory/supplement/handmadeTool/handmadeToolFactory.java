package Settings.CoffeeFactory.supplement.handmadeTool;

import Settings.CoffeeFactory.supplement.handmadeTool.handmadeTool;

public class handmadeToolFactory {

    /**
     * tool pool
     */
    private static handmadeTool handmadeTool = new handmadeTool();

    public static void reset() {
        handmadeTool = new handmadeTool();
    }

    /**
     * Get a hand made tool (reference) from tool pool.
     *
     * @return tool ref
     */
    public static handmadeTool getHandMadeTool() {
        handmadeTool.ref();
        return handmadeTool;
    }

    /**
     * @return the default handmade tool
     */
    public static handmadeTool getDefaultHandmadeTool() {
        return handmadeTool;
    }

    /**
     * hide defalut ctor
     */
    private handmadeToolFactory() {
    }
}
