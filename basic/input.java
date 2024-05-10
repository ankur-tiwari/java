package basic;

import java.util.Scanner;

public class Input {
    public static void main(String arg[]) {
        Scanner s1 = new Scanner(System.in);
        int a = s1.nextInt();

        if (a % 2 == 0) {
            System.out.print("Even");
        } else {
            System.out.print("Odd");
        }
    }
}