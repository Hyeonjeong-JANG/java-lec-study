package ex08.example2;

public class TryEx02 {
    public static void main(String[] args) {
        throw new RuntimeException("오류 강제 발생"); // throw를 하면 오류가 안 났지만 강제로 발생시킬 수 있어.
    }
}

// 엄마가 강제성을 부여하고 싶으면(컴파일 시 오류를 발견) Exception을 한다.