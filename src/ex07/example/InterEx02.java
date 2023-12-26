package ex07.example;

// 라이브러리 판매자가 만듦
interface EventListener {
    void action();
};

// 라이브러리 판매자가 만듦
class MyApp {
    public void click(EventListener l) {
        l.action();
    }
};

public class InterEx02 {
    public static void main(String[] args) {
        MyApp app = new MyApp();
        app.click(() -> {
            System.out.println("회원가입 로직이 실행됩니다.");
        });// 람다 표현식. ctrl+space하면 나옴.
    }
};
