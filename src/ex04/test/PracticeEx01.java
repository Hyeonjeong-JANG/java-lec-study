package ex04.test;

/**
 * 1. 자료형
 * 2. 조건문
 * 3. 반복문
 * 4. static, heap, stack
 * 5. 클래스, 메서드
 * 6. 생성자 오버로딩, 메서드 오버로딩
 * 7. 접근 제어자
 */
class Bird { // 얘는 클래스이기도하고, 오브젝트이기도하다.
    // 상태: 무게, 색깔
    double weight;
    String color;

    Bird(double weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public void eat() {
        this.weight++;
    }
}

public class PracticeEx01 {
    public static void main(String[] args) {
        Bird b1 = new Bird(5.5, "red"); // 인스턴스, 오브젝트(객체)
        Bird b2 = new Bird(5.0, "white");

        b1.eat(); // 행위(메서드)
        System.out.println(b1.weight);
        System.out.println(b2.weight);

    }
}
