package ex13;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("kim", "1234");
        map.put("park", "pass");
        map.put("lee", "word");

        System.out.println(map.get("lee")); // word 반환

        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println("key=" + key + ", value=" + value);
        }
        map.remove("kim"); //
        //map.put("choi", "password");
        System.out.println(map);

        // for-each 구분과 keySet()을 사용하는 방법
        for (String key : map.keySet()) {
            System.out.println("key=" + key + ", value=" + map.get(key));
        }
    }
}
