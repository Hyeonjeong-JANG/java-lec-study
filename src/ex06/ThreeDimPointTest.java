package ex06;

class TwoDimPoint {
    int x, y;

    public TwoDimPoint() {
        x = y = 0;
    }

    public TwoDimPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class ThreeDimPoint extends TwoDimPoint {
    int z;

    public ThreeDimPoint(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
}

public class ThreeDimPointTest {
    public static void main(String[] args) {

    }
}
