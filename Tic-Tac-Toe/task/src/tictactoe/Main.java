package tictactoe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {


    char win;
    int keepNumberX = 0;
    int keepNumberO = 0;
    int keepNumberSpace = 0;

    public static void main(String[] args) {

        boolean ans = false;

        Main s3c = new Main();
        String readXO;

        Scanner input = new Scanner(System.in);


        System.out.print("Enter cells :");
        readXO = input.nextLine().toUpperCase();
        s3c.countXO(readXO);
        if ((s3c.keepNumberO == 3 && s3c.keepNumberX == 3 && s3c.keepNumberSpace <= 2) || (s3c.keepNumberO > s3c.keepNumberX && s3c.keepNumberSpace == 2) || (s3c.keepNumberX > s3c.keepNumberO && s3c.keepNumberSpace == 2) ||
                (s3c.keepNumberX > s3c.keepNumberO && s3c.keepNumberSpace > 2) || s3c.keepNumberO > s3c.keepNumberX && s3c.keepNumberSpace > 2) {
            s3c.print_Output(readXO);
            System.out.println("Impossible");
        } else if (readXO.contains("_") && !(s3c.condition_win(readXO))) {
            s3c.print_Output(readXO);
            System.out.println("Game not finished");
        } else if (!(readXO.contains("_")) && !(s3c.condition_win(readXO))) {
            s3c.print_Output(readXO);
            System.out.println("Draw");


        } else if (s3c.keepNumberO == 3 || s3c.keepNumberX == 3 || !readXO.contains("_")) {
            s3c.print_Output(readXO);
            s3c.condition_win(readXO);
            System.out.println(s3c.win + " wins");


        }


    }


    /*
    @
    @
    @ Parameter String readXO{}
    @ checking for win or draw
    @
    @
     */
    public Boolean condition_win(String readXO) {
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
    public void countXO(String readXO) {
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
    private void print_Output(String readXO) {
        char[] select = readXO.toCharArray();
        System.out.println("---------");
        System.out.println('|' + " " + select[0] + " " + select[1] + " " + select[2] + " " + '|');
        System.out.println('|' + " " + select[3] + " " + select[4] + " " + select[5] + " " + '|');
        System.out.println('|' + " " + select[6] + " " + select[7] + " " + select[8] + " " + '|');
        System.out.println("---------");
    }

}


