package basic;

import java.util.Scanner;

public class loop4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum of natural number up to " + n + " is = " + sum);
        System.out.println("Sum of natural number up to " + n + " is = " + ((n * (n + 1)) / 2));
    }
}
