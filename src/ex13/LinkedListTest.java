package ex13;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(); // 링크드리스트의 초기 용량을 설정할 수 없다.
        // addFirst(), getFirst(), removeFirst(), addLast(), getLast(), removeLast()를 쓸 수 있음

        list.add("MILK");
        list.add("BREAD");
        list.add("BUTTER");
        for (String l : list) {
            System.out.print(l + " ");
        }
        System.out.println();
        list.add(1, "APPLE");
        for (String l : list) {
            System.out.print(l + " ");
        }
        System.out.println();

        list.set(2, "GRAPE");
        for (String l : list) {
            System.out.print(l + " ");
        }
        System.out.println();

        list.remove(3);
        for (String l : list) {
            System.out.print(l + " ");
        }
        System.out.println();

    }
}
