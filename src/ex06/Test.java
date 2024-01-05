package ex06;

class Base {
    public Base(int x) {
        System.out.println("Base 생성자()");
    }
};

class Derived extends Base {
    public Derived() {
        super(0);
        System.out.println("Derived  생성자()");
    }
};

public class Test {
    public static void main(String[] args) {
        Derived obj = new Derived();
    }
}
