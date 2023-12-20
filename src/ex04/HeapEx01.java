package ex04;

class Cat {
    String name;

    // 디폴트 생성자
    Cat() {
        this.name = "토비";
//        this("토비"); // 이거 잘 안 씀
    } // 이거는 안 쓰는 것이 베스트

    Cat(String name) {
        this.name = name;
    }
}

public class HeapEx01 {
    public static void main(String[] args) {
        Cat c = new Cat();
    }
}
