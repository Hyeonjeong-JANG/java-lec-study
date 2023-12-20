package ex04;

class Television {
    private int channel;
    private int volume;
    private boolean onOff;

    Television(int c, int v, boolean o) {
        channel = c;
        volume = v;
        onOff = o;
    }

    // true면 출력되고 false면 출력되지 않아. 뭘 하지 않아도 그러네.
    void print() {
        if (onOff == true) {
            System.out.println("myTv의 현재 채널은 " + channel + "이고 볼륨은 " + volume + "입니다.");
        } else {
            System.out.println("yourTv가 꺼져있습니다.");
        }
    }
}

public class TelevisionTest {
    public static void main(String[] args) {
        Television myTv = new Television(7, 10, true);
        myTv.print();
        Television yourTv = new Television(11, 20, false);
        yourTv.print();
    }
}