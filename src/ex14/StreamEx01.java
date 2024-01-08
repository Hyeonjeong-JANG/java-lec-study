package ex14;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 링크드리스트는 0번지를 찾고 그걸 기준으로 다른 인덱스를 찾고,
// 어레이리스트는 다이렉트로 그 번지를 찾아간다.

public class StreamEx01 {
    public static void main(String[] args) {
        Map<String, Object> data1 = new HashMap<>(); // 맵은 딱 키밸류해서 데이터 타입을 정해야 해. 그러나 클래스는 그러지 않아도 됨.
        data1.put("name", "홍길동");
        data1.put("age", 20);

        Map<String, Object> data2 = new HashMap<>();
        data2.put("name", "장보고");
        data2.put("age", 15);

        Map<String, Object> data3 = new HashMap<>();
        data3.put("name", "이순신");
        data3.put("age", 30);

        List<Map<String, Object>> arr = Arrays.asList(data1, data2, data3);
        List<Map<String, Object>> newArr = arr.stream().map(d -> {
            int newAge = (Integer) d.get("age") - 1;
            d.put("age", newAge);
            return d;
        }).toList();
        // 맵 말고 클래스로 만들 수도 있지만 얘는 메서드를 만들 수 없다.
        // 그냥 자료형으로 쓸 때는 맵으로 만든다.

        // 맵은 오타 가능성이 있어.(키값을 적을 때)

        // 그냥 스트링 정도 되는 데이터를 처리해야 할 때는 쓰는데 잘 안 쓴다.
        // 다른 사람들이 쓰는 라이브러리를 보면 맵으로 만든 경우가 많아.
        // 데이터 클래스가 필요한데 인트 두 개 스트링 하나를 쓸 지 스트링 두 개에 인트 하나를 쓸 지를 모르기 때문에 오브젝트로 받을 수 있도록 맵으로 만들어 놓는다.
        // 제네릭은? 제네릭으로 하면 길이를 못 늘려.

        // 데이터 자료형을 만들려면 class로만 해라.
        newArr.forEach(d -> System.out.println(d.get("age")));
    }
}
