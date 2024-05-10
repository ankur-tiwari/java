package array;

import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        takeInput();
    }

    public static int arraySum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    public static void takeInput() {
        System.out.println("Enter size of array");
        Scanner s1 = new Scanner(System.in);
        int size = s1.nextInt();
        int[] arrayVal = new int[size];
        for (int i = 0; i < arrayVal.length; i++) {
            arrayVal[i] = s1.nextInt();
        }

        System.out.println("Array sum = " + arraySum(arrayVal));
    }
}
