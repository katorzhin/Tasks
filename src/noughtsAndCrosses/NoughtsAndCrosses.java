package noughtsAndCrosses;

import java.util.HashMap;
import java.util.Scanner;

public class NoughtsAndCrosses {
    static final char X = 'X';
    private static final char O = 'O';
    static final HashMap<Character, Integer> letterToCoord = new HashMap<Character, Integer>() {{
        put('A', 0);
        put('B', 1);
        put('C', 2);
    }};

    public static char currentPlayer = X;
    public static boolean winnerExists = false;

    public static void main(String[] args) {

        char[][] array = new char[3][3];
        Scanner sc = new Scanner(System.in);
        while (!winnerExists) {
            printSquare(array);
            nextTurn(array, sc);


        }
    }

    private static void nextTurn(char[][] array, Scanner scanner) {
        System.out.println("TURN of " + currentPlayer);
        final String turn = scanner.nextLine();
        final boolean isValid = validate(turn);
        if (!isValid) {
            return;
        }
        //todo: Use map
//        if (letter == 'A') {
//            letterCoord = 0;
//        } else if (letter == 'B') {
//            letterCoord = 1;
//        } else if (letter == 'C') {
//            letterCoord = 2;
//        }
        char letter = turn.charAt(0);
        int letterCoord = letterToCoord.get(letter);

        int numberCoord = -1;
        char number = turn.charAt(1);
        if (number == '1') {
            numberCoord = 0;
        } else if (number == '2') {
            numberCoord = 1;
        } else if (number == '3') {
            numberCoord = 2;
        }

        if (!(array[letterCoord][numberCoord] == 0)) {
            System.out.println("already filled");
            return;
        }
        array[letterCoord][numberCoord] = currentPlayer;
        if (currentPlayer == X) {
            currentPlayer = O;
        } else {
            currentPlayer = X;
        }
        //todo: check if someone won
        searchWinner(array);


    }

    public static void searchWinner(char[][] array) {

        for (int i = 0; i < 3; i++) {

            if (array[i][0] != 0) {

                if (array[i][0] == array[i][1] && array[i][1] == array[i][2]) {
                    System.out.println(array[i][0] + " win!");
                    winnerExists = true;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            if (array[0][i] != 0) {
                if (array[0][i] == array[1][i] && array[1][i] == array[2][i]) {
                    System.out.println(array[0][i] + " win!");
                    winnerExists = true;
                }
            }
        }
        if (array[1][1] != 0) {
            if (array[0][0] == array[1][1] && array[1][1] == array[2][2]) {
                System.out.println(array[1][1] + " win");
                winnerExists = true;
            }
            if (array[0][2] == array[1][1] && array[1][1] == array[2][0]) {
                System.out.println(array[1][1] + " win");
                winnerExists = true;
            }
        }
    }

    private static boolean validate(String turn) {
        if (turn.length() != 2) {
            System.out.println("please make correct turn");
            return false;
        }
        if (!validateFirst(turn.charAt(0))) {
            System.out.println("please make correct turn");
            return false;
        }
        if (!validateSecond(turn.charAt(1))) {
            System.out.println("please make correct turn");
            return false;
        }
        return true;
    }

    private static boolean validateFirst(char first) {
        if (letterToCoord.containsKey(first)) {
            return true;
        }
        return false;
    }

    private static boolean validateSecond(char second) {
        if (second == '1' || second == '2' || second == '3') {
            return true;
        }
        return false;
    }


    public static void printSquare(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                char cell = array[i][j] == 0 ? '-' : array[i][j];
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
    // todo: write to file
}