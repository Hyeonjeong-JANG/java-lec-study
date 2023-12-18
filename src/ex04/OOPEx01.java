package ex04;

// 가구는 추상적이기 때문에 new할 수 없다. 의자는 구체적이기 때문에 new할 수 있다.
class Person3 {
    int weight = 100;
}

public class OOPEx01 {
    public static void main(String[] args) {
        Person3 p3 = new Person3();
        System.out.println("p3의 몸무게: " + p3.weight);
        p3.weight = 60; // 객체 지향 프로그래밍에서는 있을 수 없는 일!
        // 이렇게 하면 프로그램 관리가 어렵고 협업에 좋지 않다.
        // 객체 지향 프로그래밍에서는 행위를 통해서 변경시켜야 한다.
        System.out.println("p3의 몸무게: " + p3.weight);
    }
}
