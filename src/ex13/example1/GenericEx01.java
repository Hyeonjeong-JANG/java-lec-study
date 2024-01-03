package ex13.example1;

// 데이터의 값의 타입을 정확히 알지 못할 때가 있다.
class Box<T> {
    T data;
}

public class GenericEx01 {
    public static void main(String[] args) {
        // 제네릭에는 static을 쓸 수 없다. GenericEx02에 보면 Object가 있다.
        Box<String> box1 = new Box(); // 제네릭은 new할 때 타입이 결정된다.
        Box<Integer> box2 = new Box();

        box1.data = "1";
        box2.data = 2;

    }
}

