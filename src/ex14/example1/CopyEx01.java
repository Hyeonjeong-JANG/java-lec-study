package ex14.example1;

import java.util.ArrayList;
import java.util.List;

public class CopyEx01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // 컬렉션 복사
        List<Integer> newList = new ArrayList<>(list);

        System.out.println(list.size());
        System.out.println(newList.size());
    
        list.add(5);

        System.out.println(list.size());
        System.out.println(newList.size());
        // 값이 다른 이유: list에 새로운 값을 넣더라도 newList에는 추가하지 않겠다. 이런 말
    }
}