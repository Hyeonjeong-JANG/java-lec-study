package ex03.test;

/**
 * 상자를 나타내는 Box 클래스를 작성하여 보자. Box 클래스는 가로 길이, 세로 길이, 높이를 나타내는 필드를 가지고 상자의 부피를 계산하는 메소드를 가진다.
 * Box 클래스를 정의하고 Box 객체를 하나 생성한다. Box 객체 안의 가로 길이, 세로 길이, 높이를 20, 20, 30으로 설정하여 보자. 상자의 부피를 출력하여 본다.
 * 출력 예시
 * 상자의 가로, 세로, 높이는 20, 20, 30입니다.
 * 상자의 부피는 12000.0입니다.
 */
class Box {
    int width;
    int length;
    int height;

    double GetVolume() {
        return (double) width * height * length;
    }
}

public class BoxTest {

    public static void main(String[] args) {

        Box box = new Box();
        box.width = 20;
        box.length = 30;
        box.height = 20;
        System.out.println("상자의 가로, 세로, 높이는 " + box.width + ", " + box.length + ", " + box.height + "입니다.");
        System.out.println("상자의 부피는: " + box.GetVolume() + "입니다.");

    }
}
