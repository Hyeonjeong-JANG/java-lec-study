package ch02;

public class Light {
    public static void main(String[] args) {
        final double LIGHT_SPEED = 3e5; // 빛의 속도는 상수이기 때문에 final을 쓴다.
//        LIGHT_SPEED = 5; final로 선언된 것은 상수이기 때문에 그 값을 변경할 수 없다.
        double distance;

        distance = LIGHT_SPEED * 365 * 24 * 60 * 60;
        System.out.println("빛이 1년 동안 가는 거리: " + distance + "km.");
    }
}
