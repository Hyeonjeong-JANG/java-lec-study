package ex06.exercise;

class AA {
    public void test() {
//        System.out.println("A test(");
    }
}

class BB extends AA {
    public void test() {
        System.out.println("B test()");
    }
}

public class Ex03 {
    public static void main(String[] args) {
        BB b = new BB();
        b.test();
    }
}
