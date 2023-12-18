package ex04;

// 가구는 추상적이기 때문에 new할 수 없다. 의자는 구체적이기 때문에 new할 수 있다.
class Person4 {
    // 상태 = 변수
    private int weight = 100; // private은 다른 클래스에서 접근을 할 수 없다.

    // private를 쓰면 그 값을 확인할 수 있는 것을 만들어야해.
    public int getWeight() { // 동전을 넣지 않아도 리턴된다. 고깃집의 커피 자판기
        return weight; // weight는 int이기 때문에 리턴과 int로 되어야 한다.
    }

    public void 지방흡입(int money) {
        if (money > 1000000) {
            weight = weight - 30;
        }
    }

    // 행위 = 메서드
    public void exercise() { // public이라고 적혀 있으면 어디서도 접근이 가능하다. 메서드 이름: exercise
        weight = weight - 10;
    }
}

public class OOPEx02 {
    public static void main(String[] args) {
        Person4 p4 = new Person4();
//        p4.weight = 0; // private는 다른 클래스에서 이렇게 고칠 수 없는데 getWeight()를 하면 간접적으로 접근해서 가능해진다.
        System.out.println("p4의 몸무게: " + p4.getWeight());

//        for (int i = 0; i < 10; i++) {
//            p4.exercise();
//        }

//        p4.지방흡입(300);

        System.out.println("p4의 몸무게: " + p4.getWeight());
    }
}
