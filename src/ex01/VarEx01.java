package ex01;

public class VarEx01 {
    // 모든 코드는 main 메서드 내부에 적는다.
    public static void main(String[] args) {
        // 자료형
        int n1 = 1; // 4Byte. 21억까지
        // 1정도는 바이트에 저장하면 공간이 절약되겠지만 변수이기 때문에 값을 바꾸려면 한계가 생겨.

        double d1 = 1.5; // 8Byte. 21억까지. 그런데 소숫점 아래도 표현(실수)되기 때문에 더 큰 공간이 필요해.

        // 21억 이상을 저장하려면
        long big1 = 20000000000L; // 8Byte. 경까지 저장. 범위 안이라도 숫자 뒤에 L을 적어줘야 해. 정수 표현 범위를 넘어서면 오류가 나기 때문에 퉁쳐서 L을 적어줘.

        boolean b1 = true; //true, false
        //true, false 1bit만 사용하지만 외부에서 그 위치를 찾을 수 있게 하려면 1bit여도 1byte를 모두 사용한다.

        char c1 = '가'; // ''를 쓴다. ""이거 말구. 한글, 영어 상관 없이 1글자만 저장됨. 설정하기에 따라 크기가 달라져서 크기를 지금은 몰라도 돼.

        // n1을 적으면 그것에 해당하는 값을 찾아준다. 누가? OS가!
        System.out.println(n1);
        System.out.println(d1);
        System.out.println(big1);
        System.out.println(b1);
        System.out.println(c1);
        // ctrl + d 하면 한 줄 복사

    } // main의 끝. 자바 프로그램 종료됨. 자바프로그램의 생명주기!

}
