package ex07.programming.ex04;

public class VideoPlayer implements Controllable {

    @Override
    public void play() {
        System.out.println("비디오 시작");
    }

    @Override
    public void stop() {
        System.out.println("비디오 정지");
    }

    public static void main(String[] args) {
        Controllable video = new VideoPlayer();
        video.play();
        video.stop();
    }

}
