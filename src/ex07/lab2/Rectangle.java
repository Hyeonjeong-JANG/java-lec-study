package ex07.lab2;

public class Rectangle implements Comparable {
    public int width = 0;
    public int height = 0;

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        System.out.println(this); // this의 의미: 이 메서드의 상태값 그 자체. 메서드를 호출하면 직사각형의 정보를 보여준다.
    }

    public int getArea() {
        return width * height;
    }

    @Override
    public int compareTo(Object other) {
        Rectangle otherRect = (Rectangle) other;
        if (this.getArea() < otherRect.getArea()) {
            return -1;
        } else if (this.getArea() > otherRect.getArea()) {
            return 1;
        } else {
            return 0;
        }
    }
}
