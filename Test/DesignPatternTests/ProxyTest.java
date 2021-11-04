package Test.DesignPatternTests;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

import Settings.CoffeeFactory.supplement.supplement;
import Settings.CoffeeFactory.supplement.powerBank.powerBank;
import Settings.CoffeeFactory.supplement.powerBank.powerBankProxy;

/**
 *
 * @return
 * @author ZPZ
 * @description Test for proxy design pattern
 * @date 2021/10/27 14:10
 */

public class ProxyTest {

    public static void runTest() {

        List<powerBankProxy> ChargingBunker = new ArrayList<powerBankProxy>();//store power banks

        while (true) {
            System.out.println("");
            System.out.println("┌─────────────────────────   Proxy Test   ───────────────────────────┐");
            System.out.println("│                      0 --- Exit                                    │");
            System.out.println("│                      1 --- Show power bank list                    │");
            System.out.println("│                      2 --- Add a new power bank                    │");
            System.out.println("│                      3 --- Take a power bank                       │");
            System.out.println("│                      4 --- Show port type & battery life           │");
            System.out.println("│                      5 --- Return a power bank                     │");
            System.out.println("└────────────────────────────────────────────────────────────────────┘");

            Scanner scn = new Scanner(System.in);
            System.out.println("");
            System.out.print("Enter the command [0 to exit]:");
            int command = 0;
            try {
                command = scn.nextInt();
            } catch (ArrayIndexOutOfBoundsException | InputMismatchException e) {
                System.out.println("Invalid command. Please try again.\n");
                System.out.println("");
            }
            switch (command) {
                case 1: {
                    for (int i = 0; i < ChargingBunker.size(); i++) {
                        String State;
                        powerBank powerBank = ChargingBunker.get(i).getPowerBankInstance();
                        if (powerBank.getUsageState()) {
                            State = "Unavailable";
                        } else {
                            State = "Available";
                        }
                        System.out.println("powerBank ID." + (i + 1) + ", State: " + State);
                    }
                    break;
                }
                case 2: {
                    powerBank powerBank = new powerBank();
                    powerBankProxy powerBankProxy = new powerBankProxy(powerBank);
                    ChargingBunker.add(powerBankProxy);
                    System.out.println("Successfully added a new powerBank! It's powerBank ID." + (ChargingBunker.size()));
                    break;
                }
                case 3: {
                    Scanner input = new Scanner(System.in);
                    System.out.print("Input the ID of the powerBank to take：");
                    try {
                        int tool_num = input.nextInt();
                        if (tool_num > 0 && tool_num <= ChargingBunker.size() + 1) {
                            ChargingBunker.get(tool_num - 1).get();
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
                    try {
                        powerBank powerBank = ChargingBunker.get(ChargingBunker.size()-1).getPowerBankInstance();
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
                    System.out.print("Input the ID of the powerBank to return：");
                    try {
                        int tool_num = input.nextInt();
                        if (tool_num > 0 && tool_num <= ChargingBunker.size() + 1) {
                            ChargingBunker.get(tool_num - 1).returnPowerBank();
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

