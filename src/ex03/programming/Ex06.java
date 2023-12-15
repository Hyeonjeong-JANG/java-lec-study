package ex03.programming;

/**
 * 1차 방정식 3x+10y=100을 만족하는 모든 해를 구하는 프로그램을 작성해보자.
 * 여기서x와 y는 정수이고 0<=x<=10, 0<=y<=10이라고 가정하자.
 */
public class Ex06 {
    public static void main(String[] args) {
        for (int x = 0; x <= 10; x++) {
            for (int y = 0; y <= 10; y++) {
                if ((3 * x + 10 * y) == 100) {
                    System.out.println("x: " + x + ", y: " + y);
                }
            }
        }

//            if ((x < 0 || x > 10) || (y < 0 || y > 10)) {
//                break;
//            }

    }
}
