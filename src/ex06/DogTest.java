package ex06;

class Animal {
    int age;

    void eat() {
        System.out.println("먹고 있음...");
    }
}

class Dog extends Animal { // Animal로부터 상속을 받겠다.
    void bark() {
        System.out.println("짖고 있음...");
    }
}

public class DogTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.eat();
    }
}
