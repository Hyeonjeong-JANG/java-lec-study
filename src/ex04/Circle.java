package ex04;

// 설계도
public class Circle {
    private int radius;
    private String color;

    // 생성자: 생성될 때 무조건 실행되는 메서드, 사람의 몸무게, 키 등 절대 없어서는 안 되는 것
    public Circle(int r) { // 얘는 안 만들면 눈에 안 보여도 자동으로 생성되어 있음
        radius = r;
    }

    public Circle(String c) { // 얘는 안 만들면 눈에 안 보여도 자동으로 생성되어 있음
        color = c;
    }

    public double getArea() {
        return 3.4 * radius * radius;
    }

    public String getColor() {
        return color;
    }


}
