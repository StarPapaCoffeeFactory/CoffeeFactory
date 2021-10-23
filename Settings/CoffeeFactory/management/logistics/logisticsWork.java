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
        System.out.println("现在开始对机器进行常规检查...");

        for (Machine machine : machines) {
            System.out.println("现在开始对" + machine.getID() + "号机器设备进行检查。");
            machine.fix();
            System.out.println("已完成对机器设备" + machine.getID() + "号的安全检查。");
        }
        System.out.println("所有机器设备检查完毕。");
        machineChecked = true;

    }

    public void checkTools() {
        System.out.println("现在开始对工具进行库存盘查。");
        StringBuilder builder = new StringBuilder(this.toolCheckReport);
        for(handmadeTool tool : tools)
        {
            System.out.println("现在开始对" + tool.getBatchNumber() + "批工具进行库存盘查。");
            if(tool.getStock() < this.toolsMinStock)
            {
//                this.ToolCheckReport += "警告："+ tool.getType() + "库存不足，请及时补充\n";
                builder.append("警告："+ tool.getType() + "库存不足，请及时补充\n");
            }
            else{
                builder.append( tool.getType() + "库存容量充足\n");
            }

        }
        this.toolChecked = true;
        System.out.println("所有工具库存检查完毕。");
        machineChecked = true;
    }

    public void report() {

        System.out.println("后勤检查工作结束，开始汇报本次检查情况：");

        System.out.println("后勤工具库存检查:" + (this.toolChecked ? "已完成" : "未完成")  + "。");
        System.out.println("工具库存检查报告如下：");
        System.out.print(toolCheckReport);

        System.out.println("生产机器安全检查:" + (this.machineChecked ? "已完成" : "未完成") + "。");
        System.out.println("生产机器检查报告如下：");
        System.out.print(machineCheckReport);
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
