package ex04;

class CircleEx04 {
    int radius;

    public CircleEx04(int radius) {
        this.radius = radius;
    }

    public CircleEx04() {
        this(0);
    }

    double getArea() {
        return 3.14 * radius * radius;
    }
}

public class CircleEx04Test {
    public static void main(String[] args) {
        CircleEx04 cArea = new CircleEx04(3);
        System.out.println(cArea.getArea());
    }
}
