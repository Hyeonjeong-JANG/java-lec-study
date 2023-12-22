package ex06.selfStudy5;

class Animal {
    void eat() {
        System.out.println("음식을 먹습니다.");
    }
}

public class Dog extends Animal {
    void bark() {
        System.out.println("멍멍");
    }

    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.eat();
        obj.bark();
    }
}
