package ex07;

interface CalArea {
    void getArea(int length, int breadth);
}

class Rectangle implements CalArea {

    @Override
    public void getArea(int length, int breadth) {
        System.out.println("직사각형의 넓이는 " + length * breadth);
    }
}

public class RectangleTest {
    public static void main(String[] args) {
        CalArea area = new Rectangle();
        area.getArea(10, 20);
    }
}