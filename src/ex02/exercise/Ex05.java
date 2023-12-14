package ex02.exercise;

import java.util.Scanner;

// 각 문장(줄)에서 변수의 값을 알아보자. 사용자는 2 3과 같이 입력한다고 가정한다.
public class Ex05 {
    public static void main(String[] args) {

        int x = 0; //x=0
        System.out.println(x);
        Scanner s = new Scanner(System.in);
        System.out.print("입력하시오: "); // 2입력
        x = s.nextInt(); //x=2
//        System.out.println(x);
        System.out.println("입력하시오: "); // 3입력
        x = s.nextInt(); //x=3
//        System.out.println(x);
        boolean a = true, b = false, c = true; // a = true, b = false, c = true
        a = (b || c) && (a || false); // a= (false ||true)참 && (true||false)참 // 이게 무슨 말이야?ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ
        //a=참

    }
}
