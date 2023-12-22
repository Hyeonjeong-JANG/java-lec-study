package ex06;

class Animal2 {
    public static void A2() {
        System.out.println("static method in Animal2");
    }
}

public class Dog2 extends Animal2 {
    public static void A2() {
        System.out.println("static method in Dog2");
    }

    public static void main(String[] args) {
        Dog2 dog2 = new Dog2();
        Animal2 a2 = dog2;
        a2.A2(); // a2는 dog2를 참조하고 있지만 Animal2의 A2가 불러진다.
        dog2.A2(); // 이건 dog2의 A2가 불러진다.
    }
}




