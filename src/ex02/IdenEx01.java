package ex02;

/**
 * 여러 줄을 적을 때는 /** + enter 하면 줄을 맞춰줘서 보기에 예뻐.
 * 
 * 변수 작성법
 * 1. 카멜 표기법 사용(_ 쓰지 않아)
 * 2. 숫자를 먼저 사용하지 않는다.
 * 3. 특수문자는 사용하지 않는다.
 */
public class IdenEx01 {
    public static void main(String[] args) {
//        int class; // 키워드는 변수로 쓸 수 없어.
        int user_money; // 되지만 절대 사용하지 않아.
        int userMoney; // 낙타 표기법으로 표기하자
//        int abc#; // 안 됨.
        int method; // 됨
        double abc$$; // 되긴 하지만 특수문자는 그냥 쓰지 말자. 헷갈리자너.
//        int 1stMoney; // 숫자로 시작하는 변수는 사용할 수 없어.

//        var은 문자, 숫자 모두를 받을 수 있다.
        var n1 = 1;
        var n2 = '1';
    }
}
