package coffeeMachine_project;

import java.util.Scanner;

public class CoffeeMachine {

    static Scanner scanner = new Scanner(System.in);
    static String sugar = "";
    static String milk = "";
    static String cupSize = "";
    static String coffee = "";
    static int option;

    public static void main(String[] args) {
        entry();
    }

    private static void entry() {
        System.out.println("Would you like to drink a cup of coffee?" +
                "\nPlease select from the table below:" +
                "\n1). Turkish Coffee" +
                "\n2). Filter Coffee" +
                "\n3). Espresso");
        option = scanner.nextInt();
        scanner.nextLine();
        switch (option) {
            case 1: {
                coffee = "Turkish coffee";
                sugar();
                exit();
            }
            case 2: {
                coffee = "Filter coffee";
                milk();
                sugar();
                cupSize();
                exit();
            }
            case 3: {
                coffee = "Espresso";
                sugar();
                exit();
            }
            default: {
                System.out.println("Wrong decision!" +
                        "\nTry again...");
                entry();
            }
        }
    }

    private static void sugar() {
        System.out.println("Do you want sugar in your coffee?\nYes or No");
        String wantSugar = scanner.nextLine().toLowerCase();
        switch (wantSugar) {
            case "yes": {
                System.out.println("How many?");
                int amount = scanner.nextInt();
                sugar = "with " + amount + " spoon of sugar";
                break;
            }
            case "no": {
                sugar = "without sugar";
                break;
            }
            default: {
                System.out.println("Didn't understand..." +
                        "\nPlease enter one more time:");
                sugar();
            }
        }
    }

    private static void milk() {
        System.out.println("Do you want milk in your coffee?\nYes or No");
        String wantMilk = scanner.nextLine().toLowerCase();
        switch (wantMilk) {
            case "yes": {
                milk = "with milk";
                break;
            }
            case "no": {
                milk = "without milk";
                break;
            }
            default: {
                System.out.println("Didn't understand..." +
                        "\nPlease enter one more time:");
                milk();
            }
        }
    }

    private static void cupSize() {
        System.out.println("In which cup do you want?" +
                "\n1).Tall\n2).Grande\n3).Venti");
        int size = scanner.nextInt();
        switch (size) {
            case 1: {
                cupSize = "Tall";
            }
            case 2: {
                cupSize = "Grande";
            }
            case 3: {
                cupSize = "Venti";
            }
        }
    }

    public static void exit() {

        System.out.println("Your order is ready..." +
                "\n" + cupSize + " " + coffee + " " + milk + " and " + sugar);
        System.out.println("Enjoy!");
        System.exit(0);
    }
}
