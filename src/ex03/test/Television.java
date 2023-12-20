package ex03.test;

public class Television {
    int channel; // 채널 번호
    int volume; // 볼륨
    String powerOn; // 전원 상태

    public static void main(String[] args) {
        Television myTv = new Television();
        myTv.channel = 7;
        myTv.volume = 10;
        myTv.powerOn = "켜져있습니다.";

        Television yourTv = new Television();
        yourTv.channel = 9;
        yourTv.volume = 12;
        yourTv.powerOn = "켜꺼져있습니다.";

        System.out.println("나의 텔레비전 채널은 " + myTv.channel + ", 볼륨은 " + myTv.volume + ", 전원은 " + myTv.powerOn);
        System.out.println("너의 텔레비전 채널은 " + yourTv.channel + ", 볼륨은 " + yourTv.volume + ", 전원은 " + yourTv.powerOn);
    }
}
