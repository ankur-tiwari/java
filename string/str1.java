package string;

public class str1 {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder();
        s1.append("Hello");
        s1.append('2');
        s1.insert(0, '0');
        s1.reverse();
        System.err.println(s1);
    }
}
