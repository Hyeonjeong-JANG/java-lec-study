package ex04;

public class OverloadEx01 {

    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(1.0);
        System.out.println("1");
        System.out.println();
        // 위의 println() 메소드들은 이름이 모두 같다.
        // 하지만 매개변수의 형태가 모두 다르기 때문에 메소드 이름이 같아도 상관 없다.
        // 이것을 메소드 오버로딩이라고 한다.
    }
}
