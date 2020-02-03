package tictactoe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {


    static char win;
    static int keepNumberX = 0;
    static int keepNumberO = 0;
    static int keepNumberSpace = 0;

    public static void main(String[] args) {

        String readXO = null;

        Scanner input = new Scanner(System.in);

        //Validating input
        do {

            System.out.print("Enter cells :");
            try {
                readXO = input.nextLine().toUpperCase();
                char[] read = readXO.toCharArray();
                for (char x : read
                     ) {
                    if(x != 'x' || x != 'O' ){
                        System.out.println("Try Again");
                    }
                    System.out.println();

                }

            } catch (Exception e) {

            }
        }
        while (readXO.length() < 9 || readXO.length() > 9);


        countXO(readXO);
        if ((keepNumberO == 3 && keepNumberX == 3 && keepNumberSpace <= 2)
                || (keepNumberO > keepNumberX && keepNumberSpace == 2)
                || (keepNumberX > keepNumberO && keepNumberSpace == 2)
                || (keepNumberX > keepNumberO && keepNumberSpace > 2)
                || keepNumberO > keepNumberX && keepNumberSpace > 2) {
            printOutput(readXO);
            System.out.println("Impossible");

        } else if (readXO.contains("_") && !(conditionWin(readXO))) {
            printOutput(readXO);
            System.out.println("Game not finished");

        } else if (!(readXO.contains("_")) && !(conditionWin(readXO))) {
            printOutput(readXO);
            System.out.println("Draw");

        } else if (keepNumberO == 3 || keepNumberX == 3 || !readXO.contains("_")) {
            printOutput(readXO);
            conditionWin(readXO);
            System.out.println(win + " wins");


        }


    }

    /*
    @
    @
    @ Parameter String readXO{}
    @ checking for win
    @
    @
     */
    static private Boolean conditionWin(String readXO) {
        char[] check = readXO.toCharArray();
        if (check[0] == check[1] && check[1] == check[2]) {
            win = check[1];
            return true;
        } else if (check[3] == check[4] && check[4] == check[5]) {
            win = check[3];
            return true;
        } else if (check[6] == check[7] && check[7] == check[8]) {
            win = check[6];
            return true;
        } else if (check[0] == check[4] && check[4] == check[8]) {
            win = check[0];
            return true;
        } else if (check[2] == check[4] && check[4] == check[6]) {
            win = check[2];
            return true;
        } else if (check[2] == check[5] && check[5] == check[8]) {
            win = check[2];
            return true;
        } else if (check[1] == check[4] && check[4] == check[7]) {
            win = check[1];
            return true;
        } else if (check[0] == check[3] && check[3] == check[6]) {
            win = check[0];
            return true;
        }
        return false;

    }

    //counting X and O
    static private void countXO(String readXO) {
        char[] check = readXO.toCharArray();
        for (int i = 0; i < readXO.length(); i++) {
            String count = String.valueOf(check[i]);
            if (count.equals("X")) {
                keepNumberX++;
            }
            if (count.equals("O")) {
                keepNumberO++;
            }
            if (count.equals("_")) {
                keepNumberSpace++;
            }
        }


    }


    //Priniting output
    static private void printOutput(String readXO) {
        char[] select = readXO.toCharArray();
        System.out.println("---------");
        System.out.println('|' + " " + select[0] + " " + select[1] + " " + select[2] + " " + '|');
        System.out.println('|' + " " + select[3] + " " + select[4] + " " + select[5] + " " + '|');
        System.out.println('|' + " " + select[6] + " " + select[7] + " " + select[8] + " " + '|');
        System.out.println("---------");
    }

}


