package ex04;

class Person {
    int age = 10;
}

public class HelloTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 20;
        System.out.println("p1의 age: " + p1.age);

        Person p2 = new Person();
        System.out.println("p2의 age: " + p2.age);

        p2.age = 30;
        Person p3 = p1;
        System.out.println("p3의 age: " + p3.age);
        p3.age = 50;
        System.out.println("p3의 age 50으로 변경 후 p3의 age: " + p3.age);
        System.out.println("p3의 age 50으로 변경 후 p1의 age: " + p1.age);
    }
}
