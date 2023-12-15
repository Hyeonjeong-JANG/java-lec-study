package ex03;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();// 타입은 항상 new 다음과 똑같이 적는다.
        // ArrayList는 남는 공간에 채워 넣으면 되니까 처음부터 크기를 정할 필요가 없다.

        list.add("철수");
        list.add("영희");
        list.add("순신");
        list.add("자영");

        for (String obj : list) {
            System.out.println(obj + " ");
        }

        // 삭제하기
////        System.out.println(list.get(0)); // 이렇게 값을 받아온다. 범위를 넘어서는 번지의 값을 호출할 수 없어.
//        System.out.println(list.get(3));
//        list.remove(3);
//        System.out.println(list.get(3)); // 삭제했으니까 out of bounds
    }
}
