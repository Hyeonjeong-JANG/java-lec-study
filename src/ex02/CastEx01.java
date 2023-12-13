package ex02;

public class CastEx01 {
    public static void main(String[] args) {
        int n1 = 1;
        double d1 = 1.5;

        n1 = 2;

        d1 = n1; // 2.0
        // up casting: 작은 것은 큰 곳에 담기 때문에 큰 것의 형태로 바뀐다.
        System.out.println(d1);

        n1 = (int) d1; // 2
        // down casting: 큰 것을 작은 곳으로 담기 때문에 작은 것의 형태로 바뀐다.
        System.out.println(n1);
    }
}
