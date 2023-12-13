package ch02;

public class AreaTest {
    public static void main(String[] args) {
        final double PI = 3.141592; // 원주율도 상수이기 때문에 final을 쓴다.
        double radius, area;

        radius = 5.0;
        area = PI * radius * radius;
        System.out.println("반지름이 5인 원의 면적은 "+ area);
    }
}
