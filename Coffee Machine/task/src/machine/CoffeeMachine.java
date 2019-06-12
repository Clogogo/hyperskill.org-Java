package machine;

import java.util.Scanner;

public class CoffeeMachine {
    private static int water = 200;
    private static int milk = 50;
    private static int coffee = 15;



    public static void main(String[] args) {
        // define constant object with fixed values to
        // fit the requirements to make one cup of coffee as showned below
        // "Like in the previous stage, the coffee machine needs 200 ml of water,
        // 50 ml of milk, and 15 g of coffee beans to make one cup of coffee."



        // make an object that contain the result;
        // object should contain values suck as

        // variables decleared below can remain for Accepting user inputs
//        int cups;
//        int water = 200;
//        int milk = 50;
//        int coffee = 15;

        /// collect values for variables above
        Scanner input = new Scanner(System.in);



        System.out.print("Write how many cups of coffee you will need: ");
        cups = input.nextInt();
        water = cups * water;
        milk = cups * milk;
        coffee = cups * coffee;


        System.out.println("For " + cups + " cups of coffee you will need: " );
        System.out.println(water + " ml of Water");
        System.out.println(milk + " ml of milk");
        System.out.println(coffee + " g of coffee beans ");

    }
}
