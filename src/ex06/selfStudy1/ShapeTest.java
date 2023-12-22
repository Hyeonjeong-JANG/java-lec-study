package ex06.selfStudy1;

public class ShapeTest {
    public static void main(String[] args) {
//        Shape s1, s2;
        Shape s = new Rectangle();
        Rectangle r = new Rectangle();
        s.x = 0;
        s.y = 0;
//        s.width = 100;
//        s.height = 100; // 부모 타입(Shape)으로 자식을 new 했을 때(new Rectangle()), 자식의 필드와 메서드에 접근할 수 없다.
    }
}
