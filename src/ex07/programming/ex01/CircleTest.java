package ex07.programming.ex01;

// 다음의 인터페이스를 Circle 클래스에 구현해보자.
interface getInfo {
    public double perimeter(); // 둘레

    public double area();
}

class Circle implements getInfo {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return (radius * 2 * 3.141592);
    }

    @Override
    public double area() {
        return (radius * radius * 3.1415892);
    }
}

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle.perimeter());
        System.out.println(circle.area());
    }
}
