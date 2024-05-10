package basic;

import java.util.Scanner;

public class loop2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int upto = s.nextInt();
        for (int i = 0; i < upto; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
