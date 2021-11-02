package Test.DesignPatternTests;

import Settings.CoffeeFactory.machine.processmachine.qualifymachine.qualifysystem.QualifyPanel;
import Settings.CoffeeFactory.machine.processmachine.qualifymachine.qualifysystem.QualifyPanelGroup;
import Settings.CoffeeFactory.machine.processmachine.qualifymachine.qualifysystem.QualifySystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author YSX
 * @description test for Composite,combined with Command pattern
 * @date 2021/10/27 21:01
 */
public class CompositeTest {
    private static Map<String, QualifyPanelGroup> PanelGroups = new HashMap();
    private static Map<String, QualifyPanel> Panels = new HashMap();

    public CompositeTest() {
    }

    public static void createGroup() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the name of qualify machines of group you want to create（numbers except'#'）：\n");

        String no;
        for(no = sc.next(); no.equals("#"); no = sc.next()) {
            System.out.println("Invalid Input, Please input again.（numbers except'#'）：\n");
        }

        while(PanelGroups.get(no) != null) {
            System.out.println("The  qualify machine has been used, ");
            System.out.println("please input again.（numbers except'#'）：\n");
            no = sc.next();
        }

        QualifyPanelGroup node = new QualifyPanelGroup(no);
        PanelGroups.put(no, node);
        System.out.println("Group " + no + " has been created");
    }

    public static void createPanel() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the name of the panel you want to create（A-Z except'#'）：");

        String name;
        for(name = sc.next(); name.equals("#"); name = sc.next()) {
            System.out.println("The name is invalid,");
            System.out.println("please input again（A-Z except'#'）：\n");
        }

        while(Panels.get(name) != null) {
            System.out.println("The name has been used,");
            System.out.println("please input again（A-Z except'#'）：\n");
            name = sc.next();
        }

        QualifyPanel node = new QualifyPanel(name);
        Panels.put(name, node);
        System.out.println("Panel " + name + " has been created");
    }

    public static void addLeaf() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the name of qualify machines of group you want to enlarge（numbers except'#'）：");
        String root = sc.next();
        if (!root.equals("#")) {
            QualifyPanelGroup rootNode;
            for(rootNode = (QualifyPanelGroup) PanelGroups.get(root); rootNode == null; rootNode = (QualifyPanelGroup) PanelGroups.get(root)) {
                System.out.println("The group does not exist");
                System.out.println("Please input again:(numbers except '#')\n");
                root = sc.next();
                if (root.equals("#")) {
                    return;
                }
            }

            QualifySystem leafNode;
            while(true) {
                System.out.println("Please input which kind of system you want to add to enlarge the group you choose（numbers,'#' to quit）：");
                System.out.println("[0 Group | 1 Panel] ");
                String choice = sc.next();
                if (choice.equals("#")) {
                    return;
                }

                String name;
                String cho;
                if (choice.equals("0")) {
                    System.out.println("Please input the name of qualify machines of group you want to add to Group " + root + "（numbers,'#' to quit）：");
                    name = sc.next();
                    if (name.equals("#")) {
                        return;
                    }

                    leafNode = (QualifySystem) PanelGroups.get(name);
                    if (leafNode == null) {
                        System.out.println("The group does not exist,you must create it first!");
                        System.out.println("Do you want to create it now? (y=yes/#=no)\n");
                        cho = sc.next();
                        if (cho.equals("y")) {
                            QualifyPanelGroup node = new QualifyPanelGroup(name);
                            PanelGroups.put(name, node);
                        }

                        if (name.equals("#")) {
                            return;
                        }

                        leafNode = (QualifySystem) PanelGroups.get(name);
                        System.out.println("Group " + name + " has been created");
                        System.out.println("Group " + name + " has been added to Group " + root);
                    }
                    break;
                }

                if (choice.equals("1")) {
                    System.out.println("Please input the name of the panel you want to add to Group " + root + "（A-Z'#' to quit）：");
                    name = sc.next();
                    if (name.equals("#")) {
                        return;
                    }

                    leafNode = (QualifySystem) Panels.get(name);
                    if (leafNode == null) {
                        System.out.println("The panel does not exist, you must create it first! ");
                        System.out.println("Do you want to create it now? (y=yes/#=no)\n");
                        cho = sc.next();
                        if (cho.equals("y")) {
                            QualifyPanel node = new QualifyPanel(name);
                            Panels.put(name, node);
                            System.out.println("Panel " + name + " has been created");
                        }

                        if (name.equals("#")) {
                            return;
                        }

                        leafNode = (QualifySystem) Panels.get(name);
                        System.out.println("Panel " + name + " has been added to Group " + root);
                    }
                    break;
                }

                System.out.println("Invalid Input\n");
            }

            rootNode.add(leafNode);
        }
    }

    public static void showLeaf() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the name of qualify machines of group you want to know（numbers,'#' to quit）：");
        String root = sc.next();
        if (!root.equals("#")) {
            QualifyPanelGroup rootNode;
            for(rootNode = (QualifyPanelGroup) PanelGroups.get(root); rootNode == null; rootNode = (QualifyPanelGroup) PanelGroups.get(root)) {
                System.out.println("The group does not exist ");
                System.out.println("Please input again:（'#' to quit）：\n");
                root = sc.next();
                if (root.equals("#")) {
                    return;
                }
            }

            System.out.println("The result ：");
            rootNode.show();
        }
    }

    public static void main(String[] args) {
        System.out.println("────────────────────────   [Composite] Test   ────────────────────────");
        System.out.println("QualityPanelGroup : add : Add a element to the list of group.");
        System.out.println("QualityPanelGroup : show : Show all elements in the list of group.");
        System.out.println("QualityPanel : add : Add a element to the list of panel.");
        System.out.println("QualityPanel : show : Show all elements in the list of panel.");
        System.out.println(" ");

        System.out.println(" ");
        System.out.println("┌───────────────────────   [Composite] Test   ───────────────────────┐");
        System.out.println("│        1. Create a QualityInspection Panel Group(Multiple)         │");
        System.out.println("│        2. Create a QualityInspection Panel (Single)                │");
        System.out.println("│        3. Enlarge the existing Group                               │");
        System.out.println("│        4. Show the  QualityTestSystem  structure                   │");
        System.out.println("└────────────────────────────────────────────────────────────────────┘");
        System.out.println(" ");
        System.out.println("Enter the order [0 to quit]:");
        System.out.println("──────────────────────────────────────────────────────────────────────");
        while(true) {
            while(true) {
                Scanner sc = new Scanner(System.in);

                String choice = sc.next();
                if (choice.equals("1")) {
                    createGroup();
                } else if (choice.equals("2")) {
                    createPanel();
                } else if (choice.equals("3")) {
                    addLeaf();
                } else if (choice.equals("4")) {
                    showLeaf();
                } else {
                    if (choice.equals("0")) {
                        System.out.println("───────────────────────────────  End  ────────────────────────────────");
                        return;
                    }
                    System.out.println("Invalid Input, Please input again.\n");
                }
            }
        }
    }
}
