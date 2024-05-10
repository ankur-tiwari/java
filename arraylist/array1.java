package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class array1 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        list.add(2);
        list.add(3);
        list.add(7);
        list.add(7);
        list.add(9);
        list.add(0);
        list.add(564);
        list.add(56);
        list.add(564);
        list.add(5);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
