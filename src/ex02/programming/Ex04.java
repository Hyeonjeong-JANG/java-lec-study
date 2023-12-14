package ex02.programming;

/**
 * 자바의 기본 논리 연산에 대한 진리표를 다음과 같이 표시하는 프로그램을 작성해보자.
 * p가 true과 q가 true일 때!! 오키오키
 * 출력 형태
 * P        Q       AND     OR      XOR(참이면 폴스)
 * true     true    true    true    false
 * true     false   false   true    true
 * false    true    false   true    true
 * false    false   false   false   false
 */
public class Ex04 {
    public static void main(String[] args) {
        // p가 뭐고 q가 뭐냐를 각각 정의해야 해
        boolean p = true;
        boolean q = true;
        // 이렇게 하면 문제가 항상 트루트루 값이 들어간 상태로만 나와. 그런데 또 아래에서 각각의 값을 구하면 원하는 상태로 나와. 기계에서만 제대로 돌지 않아. 왜일까?


        System.out.println("P\t\tQ\t\tAND\t\tOR\t\tXOR");
        // q와 q가 모두 true
        p = true;
        q = true;
        //기계 만들기
        boolean and = (p == true) && (q == true) ? true : false;
        boolean or = (p == true) || (q == true) ? true : false;
        boolean xor = ((p == true) ^ (q == true)) && ((p == false) ^ (q == false)) ? true : false;
        System.out.println(p + "\t" + q + "\t" + and + "\t" + or + "\t" + xor);


        // p는 true q는 false
        p = true;
        q = false;
        //기계 만들기
        and = (p == true) && (q == true) ? true : false;
        or = (p == true) || (q == true) ? true : false;
        xor = ((p == true) ^ (q == true)) && ((p == false) ^ (q == false)) ? true : false;
        System.out.println(p + "\t" + q + "\t" + and + "\t" + or + "\t" + xor);
//
//        // p는 false q는 true

        p = false;
        q = true;
        //기계 만들기
        and = (p == true) && (q == true) ? true : false;
        or = (p == true) || (q == true) ? true : false;
        xor = ((p == true) ^ (q == true)) && ((p == false) ^ (q == false)) ? true : false;
        System.out.println(p + "\t" + q + "\t" + and + "\t" + or + "\t" + xor);
//
//        // p와 q가 모두 false

        p = false;
        q = false;
        //기계 만들기
        and = (p == true) && (q == true) ? true : false;
        or = (p == true) || (q == true) ? true : false;
        xor = ((p == true) ^ (q == true)) && ((p == false) ^ (q == false)) ? true : false;
        System.out.println(p + "\t" + q + "\t" + and + "\t" + or + "\t" + xor);
    }
}
