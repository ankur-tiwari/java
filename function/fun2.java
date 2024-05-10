package function;

import java.util.Scanner;

public class fun2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.print("Sum of " + a + " number is = " + calculateSumOfNaturalNumber(a));
    }

    public static int calculateSumOfNaturalNumber(int n) {
        int sum = (n * (n + 1)) / 2;
        return sum;
    }
}
