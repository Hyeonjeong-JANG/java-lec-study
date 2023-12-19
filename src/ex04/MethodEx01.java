package ex04;

public class MethodEx01 {

    // 1) 반환할 것이 없는 m1이라는 메서드
    static void m1() {
        System.out.println("m1 출력");
    }

    // 2) 반환할 것이 있는 m2이라는 메서드
    static String m2() {
        System.out.println("m2 출력");
        return "m2"; // 메서드 종료
        // return할 값과 메서드의 자료형을 맞춰줘야해.
    }

    public static void main(String[] args) {
        MethodEx01.m1();// static은 이렇게 부르는 것이 원칙!
        m1(); // 같은 class에 있는 녀석은 class명 생략 가능.
//        m2(); // JVM입장에서는 실행 전에는 static String m2(){}의 중괄호 안은 안 보이고 실행시에 m2메서드가 열림.
//        // 실행이 끝나면 m2()이 return값인 "m2"로 바뀜.(콤퓨타가 그렇게 맞아들임)
//        String result = "m2"; // m2()를 실행하면 이거랑 똑같이 바뀜.
        //-->
        String result = m2();
        System.out.println("result: " + result);
    }
}
