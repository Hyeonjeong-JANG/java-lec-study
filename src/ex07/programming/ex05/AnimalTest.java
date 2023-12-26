package ex07.programming.ex05;

interface Animal {
    void bark();
};

class Dog implements Animal {

    @Override
    public void bark() {
        System.out.println("개가 짖습니다.");
    }
};

public class AnimalTest {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.bark();
    }
};
