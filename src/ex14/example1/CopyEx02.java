package ex14.example1;

import java.util.Arrays;
import java.util.List;

public class CopyEx02 {
    public static void main(String[] args) {
        /**
         * [광어, 숭어, 숭어, 대방어] 컬렉션이 있다. 
         * 1. stream을 하면 흩뿌려진다.
         * 2. 가공(map, filter)
         * 2-1. map -> 물고기에 초장을 바른다.
         * 3. collect 해보면 초장 묻은 물고기
         *
         * 2-2 filter -> 광어이면 true, 아니면 false
         * 3. collect 해보면 광어만 수집이 됨
         */

        List<Integer> list = Arrays.asList(1, 2, 3, 4);

        // map -> 가공해서 복사
        List<Integer> newList = list.stream().map((i) -> i * 100).toList();

        // forEach
        newList.stream().forEach(i -> System.out.println(i));

        // 컨슈머는 콜렉트를 못함. void여서
    }
}
