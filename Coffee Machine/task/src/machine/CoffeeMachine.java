package machine;

import java.util.Scanner;

public class CoffeeMachine {
  Scanner scanner = new Scanner(System.in);

  private static int water = 400;
  private static int milk = 540;
  private static int coffee = 120;
  private static int disposable = 9;
  private static int money = 550;
  private static String action;

  public static String getAction() {
    return action;
  }

  public static void setAction(String action) {
    CoffeeMachine.action = action;
  }

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

  private static final String ACTION_1 =
      "I have enough resources, making you a coffee! "; // Compliant
  private static final String ACTION_2 = "Sorry, not enough water!"; // Compliant  

  public static void main(String[] args) {

    CoffeeMachine mac = new CoffeeMachine();
    Scanner input = new Scanner(System.in);

    do {
      System.out.println();
      System.out.print("Write action (buy, fill, take, remaining, exit): ");
      setAction(input.nextLine().toLowerCase());
      mac.machineAction(getAction());
    } while (!action.equals("exit"));
  }

  public void machineAction(String action) {
    CoffeeMachine machine = new CoffeeMachine();

    if (action.contains("fill")) {
      machine.fill();
    } else if (action.contains("buy")) {
      machine.buy();
    } else if (action.contains("take")) {
      machine.take();
    } else if (action.contains("remaining")) {
      machine.remaining();
    } else if (action.contains("exit")) {
      machine.exit();
    } else {
      System.out.println(" Try again");
    }
  }

  public final void showinfo() {
    System.out.println();
    System.out.print("The Coffee Machine has :  ");
    System.out.println(
        "\n"
            + getWater()
            + " of water "
            + "\n"
            + getMilk()
            + " of milk"
            + "\n"
            + getCoffee()
            + " of coffee beans "
            + "\n"
            + getDisposable()
            + "  of Disposable cups"
            + "\n"
            + "$"
            + getMoney()
            + " of money");
    System.out.println();
  }

  // Exiting the Coffeemachine
  public final void exit() {
    System.out.println("Thanks");
  }

  // filling the machine with Needed items

  public final void fill() {
    Scanner input = new Scanner(System.in);

    int waterEntered;
    int milkEntered;
    int coffeeEntered;
    int disposableEntered;

    System.out.print("Write how many ml of water do you want to add: ");
    waterEntered = input.nextInt();

    water += waterEntered;
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
  }

  // Showing remaining Items
  public final void remaining() {
    showinfo();
  }

  // Taking money from the machine

  public final void take() {
    System.out.println("I gave you $" + getMoney());
    int moneyTotal = 0;
    setMoney(moneyTotal);
    remaining();
  }

  // Buying Coffee from the Machine
  public final void buy() {
    String typeOfCoffee;

    System.out.println(
        "What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
    typeOfCoffee = scanner.nextLine();

    if (typeOfCoffee.equals("1")) {
      espresso();
    } else if (typeOfCoffee.equals("2")) {
      latte();

    } else if (typeOfCoffee.equals("3")) {
      cappuccino();
    }
  }

  // Coffee type 1
  private static void espresso() {
    int moneyPaid;
    if (getCoffee() > 16 && getWater() > 250) {
      System.out.println(ACTION_1);
      water -= 250;
      setWater(water);
      coffee -= 16;
      setCoffee(coffee);
      moneyPaid = getMoney() + 4;
      setMoney(moneyPaid);
      disposable--;
      setDisposable(disposable);
    } else {
      System.out.println(ACTION_2);
    }
  }

  // Coffee type 2
  private static void latte() {
    int moneyPaid;
    if (getCoffee() > 20 && getWater() > 350 && getMilk() > 75) {
      System.out.println("ACTION_1 ");
      water -= 350;
      setWater(water);
      coffee -= 20;
      setCoffee(coffee);
      milk -= 75;
      setMilk(milk);
      moneyPaid = getMoney() + 7;
      setMoney(moneyPaid);
      disposable--;
      setDisposable(disposable);
    } else {
      System.out.println(ACTION_2);
    }
  }

  // Coffee type 3
  private static void cappuccino() {
    int moneyPaid;
    if (getCoffee() > 12 && getWater() > 200 && getMilk() > 100) {
      System.out.println("ACTION_1 ");
      water -= 200;
      setWater(water);
      coffee -= 12;
      setCoffee(coffee);
      milk -= 100;
      setMilk(milk);
      moneyPaid = getMoney() + 6;
      setMoney(moneyPaid);
      disposable--;
      setDisposable(disposable);
    } else {
      System.out.println(ACTION_2);
    }
  }
}
