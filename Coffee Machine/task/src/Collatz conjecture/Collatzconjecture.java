package machine;

import java.util.Scanner;

public class Collatzconjecture {

    public static void main(String[] args) {

        int number;


        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();

        while (number != 1) {
            System.out.print(number + " ");

            if (number % 2 == 0) {
                number = number / 2;
            } else {
                number = number * 3 + 1;
            }
        }

        System.out.print(number);
    }

}
