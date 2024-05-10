package basic;

public class loop3 {
    public static void main(String[] args) {
        int f1 = 0;
        int f2 = 1;

        for (int i = 0; i < 10; i++) {
            int next = f1 + f2;
            f1 = f2;
            f2 = next;
            System.out.print(next + " ");
        }
    }
}
