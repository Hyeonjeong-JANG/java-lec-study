package ex08.example2;

class Cal2 {
    // RuntimeException = 엄마가 알려주지 않았을 때
    public void devide(int num) throws Exception { // throws 뒤의 익셉션을 잡아줌. 컴파일 시 오류를 잡아줌.
        System.out.println(10 / num);
    }
}

public class TryEx01 {

    public static void main(String[] args) {
        Cal2 cal2 = new Cal2();
        try {
            cal2.devide(0);
        } catch (Exception e) {
            System.out.println("0으로 나눌 수 없어요.");
        }

    }
}

//alt + enter
// 트라이캐치로 하면 예외처리를 픽스하는 것이고
// throws로 하면 위임을 해서 어느 정도 자율권을 주는 것이다.