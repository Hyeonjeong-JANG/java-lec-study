package ex06;

//234~245까지

class Shape {
    int x, y;

    public Shape() {
        System.out.println("Shape 생성됨");
    }
}

class Circle extends Shape { // x, y를 물려받을 수 있음.
    int radius; // 반지름

    public Circle(int radius) {

        System.out.println("Circle 생성됨");
        this.radius = radius; // 자기 자신의 radius
        System.out.println("1");
        super.x = 1; // 부모의 x, 자식은 부모에게 접근할 때 super를 쓴다.
        super.y = 2;
    }

    double getArea() {
        return 3.14 * radius * radius;
    }
}

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
//        써클. 겟에어리아 안됨.
    }
}
// 뉴를 하면 부모의 디폴트가 실행된다.