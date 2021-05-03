package Unit1_fundamentals;

import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
public class TicTacToe {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        char[] positions = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};

        do{
            checkWinner(positions);
            availSpaces(positions);
            displayBoard(positions);
            player1(positions);

            if (checkWinner(positions)){
                displayBoard(positions);
                break;
            };
            displayBoard(positions);

            player2(positions);
            if (checkWinner(positions)){
                displayBoard(positions);
                break;
            };
        }
        while (availSpaces(positions) > 0);



    }
    public static void displayBoard(char[] pos) {

            System.out.println(" " + pos[6] + " | " + pos[7] + " | " + " " + pos[8] + " "  );
            System.out.println("---+---+---");
            System.out.println(" " + pos[3] + " | " + pos[4] + " | " + " " + pos[5] + " "  );
            System.out.println("---+---+---");
            System.out.println(" " + pos[0] + " | " + pos[1] + " | " + " " + pos[2] + " "  );


        }
    public static void player1(char[] pos){
        System.out.println("Enter a position, Player1: ");
        int p1Pos = sc.nextInt();
        if (pos[p1Pos - 1] == ' '){
            pos[p1Pos - 1] = 'x';
        }
        else {
            System.out.println("That Position is filled.");
            player1(pos);
        }

    }

    public static void player2(char[] pos){
        System.out.println("Enter a position, Player2: ");
        int p2Pos = sc.nextInt();
        if (pos[p2Pos - 1] == ' '){
            pos[p2Pos - 1] = 'o';
        }
        else {
            System.out.println("That Position is filled.");
            player2(pos);
        }
    }

    public static int availSpaces(char[] pos){
        int count = 0;
        for (int i = 0; i < pos.length ; i ++ ){
            if (pos[i] == ' '){
                count++;
            }
        }
        return count;
    }

    public static boolean checkWinner(char[] pos){
        if (    (pos[0] == 'x' && pos[1] == 'x' && pos[2] == 'x') ||
                (pos[3] == 'x' && pos[4] == 'x' && pos[5] == 'x') ||
                (pos[6] == 'x' && pos[7] == 'x' && pos[8] == 'x') ||
                (pos[0] == 'x' && pos[4] == 'x' && pos[8] == 'x') ||
                (pos[0] == 'x' && pos[3] == 'x' && pos[6] == 'x') ||
                (pos[3] == 'x' && pos[5] == 'x' && pos[8] == 'x')
            ) {
            System.out.println("Player 1 wins!");
            return true;
        }
        else if (   (pos[0] == 'o' && pos[1] == 'o' && pos[2] == 'o') ||
                    (pos[3] == 'o' && pos[4] == 'o' && pos[5] == 'o') ||
                    (pos[6] == 'o' && pos[7] == 'o' && pos[8] == 'o') ||
                    (pos[0] == 'o' && pos[4] == 'o' && pos[8] == 'o') ||
                    (pos[0] == 'o' && pos[2] == 'o' && pos[6] == 'o') ||
                    (pos[3] == 'o' && pos[5] == 'o' && pos[8] == 'o')
            ){
            System.out.println("Player 2 wins!");
            return true;
        }
        return false;
    }








}
