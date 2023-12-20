package ex03;

class GugudanUtil { // 이런 것이 라이브러리!
    static void gugudan(int x) { // 매개 변수는 메서드의 스택에 만들어 진다. 외부에서 찾을 수 없고 gugudan이 실행될 때 생긴다.
        for (int i = 1; i <= 9; i++)
            System.out.println(x + " * " + i + " = " + (x * i));
        System.out.println();
    }
}

public class GugudanEx04 {

    public static void main(String[] args) {
        // 구구단을 출력해주는 메서드
        // GugudanUtil 클래스의 gugudan 정적 메서드를 호출하시오.
        // 파라미터로 int 한 개가 필요합니다.
        GugudanUtil.gugudan(17);
    }
}
