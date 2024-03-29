package ex08.example2;

class Cal3 {
    void divide(int num) throws Exception {
        System.out.println(10 / num);
    }
}

class Cal4 {
    void divide(int num) {
        try {
            System.out.println(10 / num);
        } catch (Exception e) {
            System.out.println("no no by zero");
        }
    }
}

public class TryEx05 {
    public static void main(String[] args) { // 메인에까지 throws를 하면 안 됨. 그러면 JVM에게 넘어가버려서 예외처리를 할 수 없게 됨.
        Cal3 c3 = new Cal3();
        try {
            c3.divide(0);
        } catch (Exception e) {
            System.out.println("0으로 나누지 마요");
        }

        Cal4 c4 = new Cal4();
        c4.divide(0);

    }
}