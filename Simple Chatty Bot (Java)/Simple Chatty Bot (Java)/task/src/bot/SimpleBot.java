package bot;

import java.util.Scanner;

public class SimpleBot {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String botname = "bot001";
        String date = "2018";
        int ans;
        int ans1;
        int ans2;
        String name;
        int choice;


        System.out.println("Hello! My name is " + botname);
        System.out.println("I was created in " + date);
        System.out.println("Please, remind me your name : ");

        name = input.nextLine(); // input Name

        System.out.println("What a great name you have " + name);
        System.out.println("Let me guess your age:. ");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        ans = input.nextInt();          // input Reminder of dividing by 3
        ans1 = input.nextInt();             // input Reminder of dividing by 5
        ans2 = input.nextInt();         // input Reminder of dividing by 7


        int calAge = ((ans % 3) * 70 + (ans1 % 5) * 21 + (ans2 % 7) * 15) % 105;
        System.out.println("Your age is " + calAge + "; that's a good time to start programming!");

        System.out.println("Now I will prove to you that I can count to any number you want : ");
        int number = input.nextInt();
        for (int i = 0; i <= number; i++) {
            System.out.println(+i + "!");
        }

        //Printing Out Question
        System.out.println();
        System.out.println("Let's test your programming knowledge :");
        System.out.println("Why do we use methods : ");
        System.out.println("1. To repeat a statement multiple times. " +
                "\n2. To decompose a program into several small subroutines. " +
                "\n3. To determine the execution time of a program. " +
                "\n4. To interrupt the execution of a program.");
        System.out.println();

        // Do while loop for the questions
        do {
            choice = input.nextInt();

            if (choice != 2) {
                System.out.println("Please, try again.");
            }
        } while (choice != 2);
        System.out.println("Congratulations, have a nice day!");


    }


}

