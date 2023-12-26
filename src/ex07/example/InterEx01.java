package ex07.example;

// interface랑 extends이랑 코드가 속을 까고 보면 똑같은데 뭐가 다르냐?
// interface는 먼저 다 정해 놓고(거시적)
// extends는 아래서부터 만들어서 위로 올라간다.(미시적)
interface Remocon {
    // public abstract void on();// 생략 가능. 보통 다 지워.
    void on();// 생략 가능. 보통 다 지워.

    void off();
};

class SamsungRemocon implements Remocon {

    @Override
    public void on() {
        System.out.println("삼성 리모컨 on");
    }

    @Override
    public void off() {
        System.out.println("삼성 리모컨 off");
    }
};

class LgRemocon implements Remocon {

    @Override
    public void on() {
        System.out.println("엘지 리모컨 on");

    }

    @Override
    public void off() {
        System.out.println("엘지 리모컨 off");
    }
};

/**
 * 작성자: 홍길동
 * 날짜: 2023/12/26
 * 구현체: SamsungRemocon, LgRemocon
 */
class commonRemocon {
    private Remocon r; // 인터페이스 혹은 추상클래스구나 하고 추측 가능

    public commonRemocon(Remocon r) {
        this.r = r;
    }

    public void on() {
        r.on();
    }

    public void off() {
        r.off();
    }
};

public class InterEx01 {

    public static void main(String[] args) {
//        Remocon samsumg = new SamsungRemocon(); // Remocon r2 = new Remocon(); // 안 됨
//        samsumg.on();

        commonRemocon cr = new commonRemocon(new SamsungRemocon());
        cr.on();
    }
};