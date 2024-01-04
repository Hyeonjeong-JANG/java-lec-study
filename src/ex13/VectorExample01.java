package ex13;

import java.util.Collections;
import java.util.Vector;

public class VectorExample01 {
    public static void main(String[] args) {
        Vector<String> vec = new Vector();
        vec.add("Apple");
        vec.add("Orange");
        vec.add("Mango");

        // 크기
        System.out.println(vec.size());

        // 인덱스 접근
        System.out.println(vec.get(1)); // Orange

        // 정렬
        // 오름차순
        Collections.sort(vec);
        for (String s : vec) {
            System.out.print(s + " ");
        }
        System.out.println();

        // 내림차순
        Collections.sort(vec, Collections.reverseOrder());
        for (String s : vec) {
            System.out.print(s + " ");
        }
        System.out.println();
        // Arrays
//        Arrays.sort(); // 어레이에서는 사용 가능하지만 컬렉션에서는 쓸 수 없어.

        String result = vec.remove(2); // 리버스된 상태에서의 2번 인덱스가 삭제됨.
        System.out.println(result);
        System.out.println(vec.size());

        // 값 찾기
        Boolean remainA = vec.contains("Apple");
        System.out.println("Apple 있니? " + remainA);
        Boolean remainM = vec.contains("Mango");
        System.out.println("Mango 있니? " + remainM);
        Boolean remainm = vec.contains("mango");
        System.out.println("mango 있니? " + remainm);
    }
}
