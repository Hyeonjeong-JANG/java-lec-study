package ex13;

import java.util.Vector;

public class VectorExample1 {
    public static void main(String[] args) {
        Vector<String> vec = new Vector<>(2); // 2는 초기 용량이다.
        System.out.println(vec.size()); // 초기 용량은 사이즈와 다른 개념이므로 사이즈는 0이 나온다.
    }
}
