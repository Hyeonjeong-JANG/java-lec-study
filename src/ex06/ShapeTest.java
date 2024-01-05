package ex06;

class Shape {
    public Shape() {
    }

    public void draw() {
        System.out.println("Shape 중 하나를 그릴 예정입니다.");
    }
}

class Circle extends Shape {
    public Circle() {
        super();
    }

    @Override
    public void draw() {

        super.draw();
        System.out.println("Circle을 그립니다.");
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Circle s = new Circle();
        s.draw();
    }
}
