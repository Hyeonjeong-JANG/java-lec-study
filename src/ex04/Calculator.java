package ex04;

// 메서드는 호출될 때만 열린다.
// 메서드를 호출하면 호출문이 메서드의 리턴값으로 바뀐다.

// 계산기 클래스 = 설계도
public class Calculator {
    public int add(int n1, int n2) { // static이 없으면 절대 메모리에 안 뜨기 때문에 new를 써서 띄워야 한다.
        // static이 붙어 있으면 하나밖에 못 띄워. static 쓰지 말고 new로 불러서 띄우면 여러 개를 띄울 수 있다.
        // 프로그램 시작 전에 띄우고 싶으면 static
        return n1 + n2;
    }

    public int minus(int n1, int n2) {
        return n1 - n2;
    }

    public double divide(double n1, double n2) {
        return n1 / n2;
    }

    public int multi(int n1, int n2) {
        return n1 * n2;
    }
}
