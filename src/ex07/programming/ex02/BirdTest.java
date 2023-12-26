package ex07.programming.ex02;

interface Animal {
    void walk();

    void fly();

    void sing();
}

class Bird implements Animal {

    @Override
    public void walk() {
        System.out.print("걸을 수 있음, ");
    }

    @Override
    public void fly() {
        System.out.print("날 수 있음, ");
    }

    @Override
    public void sing() {
        System.out.print("노래할 수 있음, ");
    }
}

public class BirdTest {
    public static void main(String[] args) {
        Bird bird = new Bird();
        System.out.print("Bird는 ");
        bird.walk();
        bird.fly();
        bird.sing();
    }
}
