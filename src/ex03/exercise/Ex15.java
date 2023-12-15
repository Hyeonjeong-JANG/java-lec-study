package ex03.exercise;

// 다음 프로그램의 출력을 쓰시오.
// 숫자 형식 오류, finally
public class Ex15 {
    public static void main(String[] args) {
//        try {
//            int n = Integer.parseInt("abc");
//            System.out.println("try");
//        } catch (NumberFormatException e) {
//            System.out.println("숫자 형식 오류");
//        } finally {
//            System.out.println("finally");
//        }

        try {
            String n = ("abc"); // 문자를 숫자로 변환할 수 없기 때문에 생기는 오류이다. 그냥 변환하지 않고 문자열 그대로 받아들이면 됨.
            System.out.println("try\t" + n);
        } catch (NumberFormatException e) {
            System.out.println("숫자 형식 오류");
        } finally {
            System.out.println("finally");
        }
    }
}
