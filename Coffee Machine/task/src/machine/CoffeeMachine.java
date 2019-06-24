package machine;

import java.util.Scanner;

public class CoffeeMachine {

    private static Scanner input = new Scanner(System.in);


    private static int water = 1200;
    private static int milk = 540;
    private static int coffee = 120;
    private static int disposable = 9;
    private static int money = 550;


    public static int getWater() {
        return water;
    }

    public static void setWater(int water) {
        CoffeeMachine.water = water;
    }

    public static int getMilk() {
        return milk;
    }

    public static void setMilk(int milk) {
        CoffeeMachine.milk = milk;
    }

    public static int getCoffee() {
        return coffee;
    }

    public static void setCoffee(int coffee) {
        CoffeeMachine.coffee = coffee;
    }

    public static int getDisposable() {
        return disposable;
    }

    public static void setDisposable(int disposable) {
        CoffeeMachine.disposable = disposable;
    }

    public static int getMoney() {
        return money;
    }

    public static void setMoney(int money) {
        CoffeeMachine.money = money;
    }

    public static void main(String[] args) {
        String action;
        CoffeeMachine machine = new CoffeeMachine();

        machine.showInfo();


        System.out.println();
        System.out.print("Write action (buy, fill, take): ");

        action = input.nextLine().toLowerCase();

        if (action.contains("fill")) {
            machine.fill();
        } else if (action.contains("buy")) {
            machine.buy();
        } else if (action.contains("take")) {
            machine.take();
        } else {
            System.out.println("Wrong entry ");
        }

    }

    // Showing information about the machine
    public final void showInfo() {
        System.out.println();
        System.out.print("The Coffee Machine has :  ");
        System.out.println("\n" + getWater() + " of water " + "\n" + getMilk() + " of milk" + "\n" + getCoffee() + " of coffee beans "
                + "\n" + getDisposable() + "  of Disposable cups" + "\n" + getMoney() + " of money");
    }

    // filling the machine with Needed items

    public final void fill() {
        int waterEntered;
        int milkEntered;
        int coffeeEntered;
        int disposableEntered;

        System.out.print("Write how many ml of water do you want to add: ");
        waterEntered = input.nextInt();

        water +=waterEntered;
        setWater(water);
        System.out.print("Write how many ml of milk do you want to add: ");
        milkEntered = input.nextInt();
        milk += milkEntered;
        setMilk(milk);
        System.out.print("Write how many grams of coffee beans do you want to add:");
        coffeeEntered = input.nextInt();
        coffee += coffeeEntered;
        setCoffee(coffee);
        System.out.print("Write how many disposable cups of coffee do you want to add:");
        disposableEntered = input.nextInt();
        disposable += disposableEntered;
        setDisposable(disposable);

        showInfo();


    }

    // Taking money from the machine

    public final void take() {
        System.out.println("I gave you $" + getMoney());
        int moneyTotal = 0;
        setMoney(moneyTotal);
        showInfo();

    }

    public final void buy() {
        int typeOfCoffee;
        int dispo;
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        typeOfCoffee = input.nextInt();
        disposable--;
        setDisposable(disposable);
        if (typeOfCoffee == 1) {
            espresso();
        } else if (typeOfCoffee == 2) {
            latte();

        } else if (typeOfCoffee == 3) {
            cappuccino();
        }
        showInfo();
    }

    // Coffee type 1
    private static void espresso() {
        int moneyPaid;
        water -= 250;
        setWater(water);
        coffee -= 16;
        setCoffee(coffee);
        moneyPaid = getMoney() + 4;
        setMoney(moneyPaid);

    }

    // Coffee type 2
    private static void latte() {
        int moneyPaid;
        water -= 350;
        setWater(water);
        coffee -= 20;
        setCoffee(coffee);
        milk -= 75;
        setMilk(milk);
        moneyPaid = getMoney() + 7;
        setMoney(moneyPaid);


    }

    //Coffee type 3
    private static void cappuccino() {
        int moneyPaid;

        water -= 200;
        setWater(water);
        coffee -= 12;
        setCoffee(coffee);
        milk -= 100;
        setMilk(milk);
        moneyPaid = getMoney() + 6;
        setMoney(moneyPaid);

    }


}