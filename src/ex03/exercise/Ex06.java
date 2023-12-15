package ex03.exercise;

// 문장의 오류 찾고 고치기
public class Ex06 {
    public static void main(String[] args) {

        // 문제1)
//        if(0<age<18){
//            System.out.println("청소년");
//        }
/**
 * 위 문장의 오류!!
 * 1. age가 선언되지 않고 사용됨.
 * 2. 한 번의 여러 조건을 만족하는 age를 찾으려면 관계 연산자를 사용해야 한다.
 */
        int age = 15;
        if (0 < age && age < 18) {
            System.out.println("청소년");
        }


        // 문제2)
//        if (x = 0) {
//            System.out.println("x는 0이다.");
//        }
        /**
         * 위 문장의 오류!!
         * 1. x가 선언, 초기화 되지 않고 사용됨.
         * 2. if문 안에는 참, 거짓을 판별하는 문장이 와야 하는데 같다는 표시는 =이 아니라 ==이다.
         */
        int x = 0;
        if (x == 0) {
            System.out.println("x는 0이다.");
        }

    }
}
