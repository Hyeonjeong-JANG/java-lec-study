package ex06.selfStudy2;

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] arrayOfShapes; // Shape의 배열을 선언하였고 
        arrayOfShapes = new Shape[3];

        arrayOfShapes[0] = new Rectangle();
        arrayOfShapes[1] = new Triangle();
        arrayOfShapes[2] = new Circle(); // 다형성에 의해 배열에 모든 타입의 객체를 저장할 수 있다.

        for (int i = 0; i < arrayOfShapes.length; i++) {
            arrayOfShapes[i].draw();
        }

        Shape s2 = new Rectangle();
        s2.draw();
    }
}
