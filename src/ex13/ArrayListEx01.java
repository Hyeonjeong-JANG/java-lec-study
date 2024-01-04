package ex13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx01 {
    // 어레이리스트는 동기화 되지 않고, 벡터는 동기화가 된다.
    // 그렇기 때문에 멀티 스레드를 할 때는 벡터를 쓰는 것이 좋고, 단일 스레드 환경에서는 굳이 벡터를 쓸 필요는 없다.
    public static void main(String[] args) {
//        ArrayList<Integer> arr = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);

        List<Integer> arr2 = Arrays.asList(0, 1);
        // 위의 두 코드는 같다.

    }
}
