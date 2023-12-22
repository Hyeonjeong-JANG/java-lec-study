package ex06;

class ShapeParent {
    public void draw() {
        System.out.println("Shape 중 하나를 그릴 예정입니다.");
    }
}

class CircleShape extends ShapeParent {
    @Override
    public void draw() {
        System.out.println("Circle을 그립니다.");
    }
}

class RectangleShape extends ShapeParent {
    @Override
    public void draw() {
        System.out.println("Rectangle을 그립니다.");
    }
}

class TriangleShape extends ShapeParent {
    @Override
    public void draw() {
        System.out.println("Triangle을 그립니다.");
    }
}

public class ShapeOverridingTest {
    public static void main(String[] args) {
        RectangleShape s = new RectangleShape();
        s.draw();
    }
}
