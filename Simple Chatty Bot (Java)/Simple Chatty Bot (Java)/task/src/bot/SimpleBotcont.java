package tic-tac-toe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String readXO;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter cells :");
        readXO = input.nextLine().toUpperCase();

        if (readXO.length() >= 2
                && readXO.charAt(0) == '"'
                && readXO.charAt(readXO.length() - 1) == '"' && readXO.length() <= 11) {
            readXO = readXO.substring(1, readXO.length() - 1);

            char[] select = readXO.toCharArray();
            System.out.println("---------");
            System.out.println('|' + " " + select[0] + " " + select[1] + " " + select[2] + " " + '|');
            System.out.println('|' + " " + select[3] + " " + select[4] + " " + select[5] + " " + '|');
            System.out.println('|' + " " + select[6] + " " + select[7] + " " + select[8] + " " + '|');
            System.out.println("---------");
        } else {
            System.out.println("Try Again");
        }
    }
}
