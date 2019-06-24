package machine;

import java.util.Scanner;

public class CoffeeMachine {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int water = 1200;
        int milk = 540;
        int coffeeBeans = 120;
        int cups = 9;
        int money = 550;

        System.out.println("The coffee machine has:");
        System.out.println(water +" of water");
        System.out.println(milk + " of milk");
        System.out.println(coffeeBeans +" of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(money + " of money");

        System.out.println();
        System.out.print("Write action (buy, fill, take): ");
        String action = scanner.nextLine();
        switch(action){
            case "buy":{
                System.out.print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
                int action1 = scanner.nextInt();
                System.out.println();
                switch (action1) {
                    case 1:{
                        water -= 250;
                        coffeeBeans -= 16;
                        cups--;
                        money += 4;
                        break;
                    }
                    case 2:{
                        water -= 350;
                        milk -= 75;
                        coffeeBeans -= 20;
                        cups--;
                        money += 7;
                        break;
                    }
                    case 3:{
                        water -=200;
                        milk -= 100;
                        coffeeBeans -= 12;
                        cups--;
                        money += 6;
                        break;
                    }
                }
                break;
            }
            case "fill":{
                System.out.print("Write how many ml of water do you want to add: ");
                int water1 = scanner.nextInt();
                System.out.print("Write how many ml of milk do you want to add: ");
                int milk1 = scanner.nextInt();
                System.out.print("Write how many grams of coffee beans do you want to add: ");
                int coffeeBeans1 = scanner.nextInt();
                System.out.print("Write how many disposable cups of coffee do you want to add: ");
                int cups1 = scanner.nextInt();

                water += water1;
                milk += milk1;
                coffeeBeans += coffeeBeans1;
                cups += cups1;
                break;
            }
            case "take":{
                System.out.println("I gave you $"+ money);
                money = 0;
                break;
            }
        }
        System.out.println();
        System.out.println("The coffee machine has:");
        System.out.println(water +" of water");
        System.out.println(milk + " of milk");
        System.out.println(coffeeBeans +" of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(money + " of money");
    }
}
U4