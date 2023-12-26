package ex07.programming.ex06;

/**
 * 본문에 등장하는 2차원 도형인 원(Circle), 사각형(Rectangle) 클래스가 위의 인터페이스를 구현하도록 수정하라.
 * move() 메소드는 도형을 주어진 거리만큼 이동한다. main()에서 Movable 객체 배열을 생성하고 원이나 사각형 객체를 생성하여 저장한다.
 * 배열에 저장된 각 객체에 대하여 move()를 호출하여 랜덤하게 객체를 이동시키는 프로그램을 작성하라.
 */

public interface Movable {
    void move(int dx, int dy);
}

class Rectagle implements Movable {
    int width, height;

    @Override
    public void move(int dx, int dy) {

    }
}

class Circle implements Movable {
    int radius;

    @Override
    public void move(int dx, int dy) {

    }
}
