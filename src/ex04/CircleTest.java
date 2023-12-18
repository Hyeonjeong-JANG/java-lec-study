package ex04;

public class CircleTest {
    public static void main(String[] args) {
        Circle obj = new Circle(100); // 이렇게 다른 파일에 있는 것도 불러진다.
        // Circle()은 Circle 파일에서는 static이 없기 때문에 떠있지 않지만

        System.out.println(obj.getArea());
    }
}
