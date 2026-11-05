package recursion_and_backtracking;

import java.util.Scanner;

public class NQueens {

    static int N;

    static int[] board;

    static boolean[] column;
    static boolean[] diagonal1;
    static boolean[] diagonal2;

    static boolean solve(int row) {

        if (row == N) {
            return true;
        }

        for (int col = 0; col < N; col++) {

            int d1 = row - col + N - 1;
            int d2 = row + col;

            if (!column[col] && !diagonal1[d1] && !diagonal2[d2]) {

                board[row] = col;

                column[col] = true;
                diagonal1[d1] = true;
                diagonal2[d2] = true;

                if (solve(row + 1)) {
                    return true;
                }

                column[col] = false;
                diagonal1[d1] = false;
                diagonal2[d2] = false;

                board[row] = -1;
            }
        }

        return false;
    }

    static void printBoard() {

        for (int i = 0; i < N; i++) {

            for (int j = 0; j < N; j++) {

                if (board[i] == j) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of N: ");
        N = sc.nextInt();

        board = new int[N];

        column = new boolean[N];

        diagonal1 = new boolean[2 * N - 1];
        diagonal2 = new boolean[2 * N - 1];

        for (int i = 0; i < N; i++) {
            board[i] = -1;
        }

        if (solve(0)) {

            System.out.println("Solution found:");

            printBoard();

            System.out.println("Board Array:");

            for (int i = 0; i < N; i++) {
                System.out.print(board[i] + " ");
            }

        } else {
            System.out.println("No solution exists!");
        }
    }
}