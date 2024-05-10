package array;

import java.util.Scanner;

public class array3 {
    public static void main(String[] args) {
        takeInput();
    }

    public static void showArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (var j = 0; j < a[i].length; j++) {
                System.out.print("  " + a[i][j]);
            }
            System.err.println("");
        }
    }

    public static void takeInput() {
        System.out.println("Enter row & column size of 2D array");
        Scanner s1 = new Scanner(System.in);
        int row = s1.nextInt();
        int column = s1.nextInt();
        int[][] arrayVal = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (var j = 0; j < column; j++) {
                arrayVal[i][j] = s1.nextInt();
            }
        }
        showArray(arrayVal);
    }
}
