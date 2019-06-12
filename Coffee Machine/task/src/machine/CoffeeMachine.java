package machine;

import java.util.Scanner;

public class CoffeeMachine {
    private static int waterRequirement = 200;
    private static int milkRequirement = 50;
    private static int coffeeRequirement = 15;



    public static void main(String[] args) {
        // define constant object with fixed values to
        // fit the requirements to make one cup of coffee as showned below
        // "Like in the previous stage, the coffee machine needs 200 ml of water,
        // 50 ml of milk, and 15 g of coffee beans to make one cup of coffee."



        // make an object that contain the result;
        // object should contain values suck as

        // variables decleared below can remain for Accepting user inputs
        int cups;
        int water;
        int milk;
        int coffee;

        int caculationResult;
        int cupsOfCoffeePossible;

        /// collect values for variables above
        Scanner input = new Scanner(System.in);

// accept input

        System.out.print("Write how many ml of water the coffee machine has: ");
        water = input.nextInt();
        System.out.print("Write how many ml of milk the coffee machine has: ");
        milk = input.nextInt();
        System.out.print("Write how many grams of coffee beans the coffee machine has: ");
        coffee = input.nextInt();
        System.out.print("Write how many cups of coffee you will need: ");
        cups = input.nextInt();




   // calculate


        // check if adequate requirement

        if(water => waterRequirement){
            calculationResult = true;
        }else{
            calculationResult = false;
        }
        if(milk => milkRequirement){
            calculationResult = true;
        }else{
            calculationResult = false;
        }
        if(coffee => coffeeRequirement){
            calculationResult = true;
        }else{
            calculationResult = false;
        }


/// results

        if(calculationResult){
            System.out.println("Yes, I can make that amount of coffee ");

        }else{
            System.out.println("No, I can make only" +cupsOfCoffeePossible+ "cup(s) of coffee");
        }

    }


}
