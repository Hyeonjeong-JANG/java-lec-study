package ex06;

class Base {
    public Base() {
        System.out.println("Base() 생성자");
    } // 이게 없으면 자식이 super를 명시적으로 쓰지 않았을 경우 오류가 난다.
};

class Derived extends Base {
    public Derived() {
        System.out.println("Derived() 생성자");
    }
};

public class Test {
    public static void main(String[] args) {
        Derived r = new Derived();
    }
};
