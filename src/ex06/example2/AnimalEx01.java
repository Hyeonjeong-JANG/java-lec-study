package ex06.example2;

class Animal {
    void speak() {
        System.out.println("멍멍");
    }

    void run() {
        System.out.println("달린다");
    }
}

class Cat extends Animal {
    //    @Override
    void speak() { // 재정의!!
        System.out.println("야용");
    }
}

// 동적 바인딩:
// 재정의: 
// 오버라이드: 
public class AnimalEx01 {
    public static void main(String[] args) {
        Animal c1 = new Cat(); // [Cat, Animal] 
        // new Cat을 하면 Cat, Animal 두 개가 호출돼, 그러면 타입을 Cat, Animal 중에 선택할 수 있어. 이게 다형성
        c1.speak();
        c1.run();
    }
}
