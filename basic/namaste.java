package basic;

import java.util.Scanner;

public class namaste {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String language = s.next();
        switch (language) {
            case "EN":
                System.out.print("You selected English");
                break;
            case "HI":
                System.out.print("You selected Hindi");
                break;
            case "SP":
                System.out.print("You selected Spanish");
                break;
            default:
                System.out.print("Incorrect Selection");
                break;
        }
    }
}
