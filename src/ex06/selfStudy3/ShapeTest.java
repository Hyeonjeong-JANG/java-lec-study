package ex06.selfStudy3;

public class ShapeTest {

//    public static void print(Object obj) { // 모든 객체는 Object 클래스를 상속받는다.
//        System.out.println("x=" + obj.x + ", y=" + obj.y); // 위에서 상속 받은 obj를 어떻게 Object로 써야하나?
//    }

    public static void print(Shape obj) {
        System.out.println("x=" + obj.x + ", y=" + obj.y);
    }

    public static void main(String[] args) {
        Rectangle s1 = new Rectangle();
        Triangle s2 = new Triangle();
        Circle s3 = new Circle();

        print(s1);
        print(s2);
        print(s3);
    }
}
