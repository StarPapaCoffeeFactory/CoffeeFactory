package Settings.CoffeeFactory.management.logistics;

/**
 * @ program: coffeefactory
 * @ description: facade  后勤工作
 * @ author: YXJ
 * @ date: 2021-10-15 11:18:38
 */
import java.util.List;
import Settings.CoffeeFactory.machine.Machine;
import Settings.CoffeeFactory.supplement.handmadeTool.handmadeTool;

public class logisticsWork {
    private List<Machine> machines;//要检查的机器
    private boolean machineChecked;
    private String machineCheckReport;

    private List<handmadeTool> tools;//要检查的工具
    private boolean toolChecked;
    private String toolCheckReport;
    private int toolsMinStock;
    public logisticsWork(List<Machine> checkmachines , List<handmadeTool> checktools)
    {
        this.machineChecked = false;
        this.toolChecked = false;
        this.machines = checkmachines;
        this.tools = checktools;
        toolsMinStock = 5;
    }

    public void checkMachines() {
        System.out.println("Now start the routine inspection of the machines...");

        for (Machine machine : machines) {
            System.out.println("Now start check the No." + machine.getID() + " machine`s routine inspection");
            machine.fix();
            System.out.println("The No." + machine.getID() + " machine`s routine inspection completed");
            System.out.println();
        }
        System.out.println("All machines has been checked");
        machineChecked = true;

    }

    public void checkTools() {
        System.out.println("Now start the inventory check of the tools。");
        StringBuilder builder = new StringBuilder();
        for(handmadeTool tool : tools)
        {
            System.out.println("Now start check the " + tool.getBatchNumber() + "batch tools` inventory check");
            if(tool.getStock() < this.toolsMinStock)
            {
//                this.ToolCheckReport += "警告："+ tool.getType() + "库存不足，请及时补充\n";
                builder.append("Logistic Management Warning：The ").append(tool.getType()).append(" is insufficient , please replenish in time\n");
            }
            else{
                builder.append( tool.getType() + " has sufficient inventory capacity\n");
            }

        }
        this.toolCheckReport += builder.toString();
        this.toolChecked = true;
        System.out.println("All tools inventory check completed");
        machineChecked = true;
    }

    public void report() {

        System.out.println("The logistic inspection work is over, now start the report of this inspection:");

        System.out.println("The tools inventory check :" + (this.toolChecked ? "completed" : "uncompleted")  + ".");
        System.out.println("The tools inventory check report is as follows : ");
        System.out.print(toolCheckReport);
        System.out.println();

        System.out.println("The machines routine check :" + (this.machineChecked ? "completed" : "uncompleted") + ".");
        System.out.println("The machines routine check report is as follows ：");
        System.out.print("All machines  work well now");
        System.out.println();
    }

    public void checkClear()
    {
        this.machineChecked = false;
        this.machineCheckReport = null;
        this.toolChecked = false;
        this.toolCheckReport = null;
    }

    @Override
    public String toString() {
        return "class logisticsWork";
    }
}
