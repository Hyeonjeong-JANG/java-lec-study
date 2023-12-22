package ex06.exercise.ex04;

class ParentClass {
    private void test() {
        System.out.println("부모 클래스 test()");
    }
}

public class ChildClass extends ParentClass {
    private void test() {
        System.out.println("자식 클래스 test()");
    }

    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.test();
    }
}
