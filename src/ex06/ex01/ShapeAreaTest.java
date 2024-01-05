package ex06.ex01;

class Shape {
    public double getArea() {
        return 0;
    }

    public Shape() {
        super();
    }
}

class Rectangle extends Shape {
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }
}

class Triangle extends Shape {
    private double base, height;

    public double getArea() {
        return 0.5 * base * height;
    }

    public Triangle(double base, double height) {
        super();// 안 써도 말짱
        this.base = base;
        this.height = height;
    }
}

public class ShapeAreaTest {
    public static void main(String[] args) {
        Shape obj1 = new Rectangle(10.0, 20.0);
        Shape obj2 = new Triangle(10.0, 20.0);

        System.out.println("Rectangle: " + obj1.getArea());
        System.out.println("Triangle: " + obj2.getArea());
    }
}
