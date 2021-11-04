package Test.DesignPatternTests;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import Settings.CoffeeFactory.supplement.supplement;
import Settings.CoffeeFactory.supplement.powerBank.powerBank;
import Settings.CoffeeFactory.supplement.powerBank.powerBankProxy;


public class ProxyTest {

    public static void runTest() {


        List<powerBankProxy> ProxyList = new ArrayList<powerBankProxy>();

        while (true) {
            System.out.println("");
            System.out.println("┌─────────────────────────   Proxy Test   ───────────────────────────┐");
            System.out.println("│                      0 --- Quit                                    │");
            System.out.println("│                      1 --- Show all information                    │");
            System.out.println("│                      2 --- Create a powerBank                      │");
            System.out.println("│                      3 --- Take a powerBank                        │");
            System.out.println("│                      4 --- Show port type & battery life           │");
            System.out.println("│                      5 --- Return a powerBank                      │");
            System.out.println("└────────────────────────────────────────────────────────────────────┘");

            Scanner sc = new Scanner(System.in);
            System.out.println("");
            System.out.print("Enter the order [0 to quit]:");
            int order = 0;
            try {
                order = sc.nextInt();
            } catch (ArrayIndexOutOfBoundsException | InputMismatchException e) {
                System.out.println("Invalid command. Please try again.\n");
                System.out.println("");
            }
            switch (order) {
                case 1: {
                    for (int i = 0; i < ProxyList.size(); i++) {
                        String State;
                        powerBank powerBank = ProxyList.get(i).getPowerBankInstance();
                        if (powerBank.getUsageState()) {
                            State = "Used";
                        } else {
                            State = "Not Used";
                        }
                        System.out.println("powerBank No." + (i + 1) + ", State: " + State);
                    }
                    break;
                }
                case 2: {
                    powerBank powerBank = new powerBank();
                    powerBankProxy powerBankProxy = new powerBankProxy(powerBank);
                    ProxyList.add(powerBankProxy);
                    System.out.println("Create a new powerBank! It's powerBank No." + (ProxyList.size()));
                    break;
                }
                case 3: {
                    Scanner input = new Scanner(System.in);
                    System.out.print("Input the id of the powerBank to take：");
                    try {
                        int tool_num = input.nextInt();
                        if (tool_num > 0 && tool_num <= ProxyList.size() + 1) {
                            ProxyList.get(tool_num - 1).get();
                        } else {
                            System.out.println("Invalid command. Please try again.\n");
                        }
                    } catch (ArrayIndexOutOfBoundsException | InputMismatchException e) {
                        System.out.println("Invalid command. Please try again.\n");
                        System.out.println("");
                    }
                    break;
                }
                case 4: {
                    Scanner input = new Scanner(System.in);
                    //System.out.print(ProxyList.size());
                    try {
                        powerBank powerBank = ProxyList.get(ProxyList.size()-1).getPowerBankInstance();
                        System.out.print("The available ports for this power banks are：");
                        System.out.print(powerBank.getPortType());
                        System.out.print("\n");
                        System.out.print("The battery life of this power banks is：");
                        System.out.print(powerBank.getBatteryLife()+"%\n");
                    } catch (ArrayIndexOutOfBoundsException | InputMismatchException e) {
                        System.out.println("Invalid command. Please try again.\n");
                        System.out.println("");
                    }
                    break;
                }
                case 5: {
                    Scanner input = new Scanner(System.in);
                    System.out.print("Input the id of the powerBank to return：");
                    try {
                        int tool_num = input.nextInt();
                        if (tool_num > 0 && tool_num <= ProxyList.size() + 1) {
                            ProxyList.get(tool_num - 1).returnPowerBank();
                        } else {
                            System.out.println("Invalid command. Please try again.\n");
                        }
                    } catch (ArrayIndexOutOfBoundsException | InputMismatchException e) {
                        System.out.println("Invalid command. Please try again.\n");
                        System.out.println("");
                    }

                    break;
                }
                case 0: {
                    return;
                }
                default: {
                    System.out.println("Invalid command. Please try again.\n");
                }
            }
        }
    }

    public static void main(String[] args) {


        ProxyTest.runTest();

        System.out.println("————————————————————————————————— End ————————————————————————————————");
    }
}

