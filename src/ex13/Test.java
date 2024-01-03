package ex13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String[] a = new String[]{"A", "B", "C", "D", "E"};
        List<String> list = new ArrayList<>(Arrays.asList(a));
        System.out.println(list);
        list.add("K");
        System.out.println(list);
        String s;
        Iterator e = list.iterator();
        while (e.hasNext()) {
            s = (String) e.next();
            System.out.println(s);
        }
        list.forEach((n) -> {
            System.out.print(n);
        });
        
        for (String n : list) {
            System.out.print(n);
        }
    }
}
