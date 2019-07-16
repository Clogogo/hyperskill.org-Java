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


        System.out.println("Hello! My name is " + botname);
        System.out.println("I was created in " + date);
        System.out.println("Please, remind me your name : ");

        name = input.nextLine();

        System.out.println("What a great name you have " + name);
        System.out.println("Let me guess your age:. ");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        ans = input.nextInt();
        ans1 = input.nextInt();
        ans2 = input.nextInt();


        int calAge = ((ans % 3) * 70 + (ans1 % 5) * 21 + (ans2 % 7) * 15) % 105;
        System.out.println("Your age is " + calAge + "; that's a good time to start programming!");

        System.out.println("Now I will prove to you that I can count to any number you want : ");
        int number = input.nextInt();
        for (int i = 0; i <= number; i++) {
            System.out.println(+i + "!");
        }
        System.out.println("completed, have a nice day!");

    }
}
