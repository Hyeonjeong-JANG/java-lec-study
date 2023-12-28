package ex07.miniProject;

import java.util.ArrayList;

public interface Queue {
    // 배열을 선언해야해.

    ArrayList<String> qArr = new ArrayList<>();
    // int qArrLength = qArr.size();

    default void dequeue() {
        qArr.remove(0);
        System.out.print("현재 큐에는 ");
        if (qArr.size() == 0) {
            System.out.println("아무 것도 없습니다.");
        } else {
            for (String q : qArr) {
                System.out.print(q + " ");
            }
            System.out.println();
        }
    }

    default void enqueue(String item) {
        qArr.add(item);
        System.out.print("현재 큐에는 ");
        for (String q : qArr) {
            System.out.print(q + " ");
        }
        System.out.println();
    }

    default boolean isEmpty() {
        if (qArr.size() == 0) {
            System.out.println("큐가 비어있습니다.");
            return true;
        } else {
            System.out.print("현재 큐에는 ");
            for (String q : qArr) {
                System.out.print(q + " ");
            }
            System.out.println();
            return false;
        }
    }
}
