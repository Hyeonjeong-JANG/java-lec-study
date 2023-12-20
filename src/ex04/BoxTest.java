package ex04;

class Box {
    int width, height, depth;

    public Box(int w, int h, int d) {
        width = w;
        height = h;
        depth = d;
    }
}

public class BoxTest {
    public static void main(String[] args) {
        int w = 10;
        int h = 10;
        int d = 10;
        Box b = new Box(w, h, d);
        System.out.println("상자의 너비, 높이, 깊이: (" + b.width + ", " + b.height + ", " + b.depth + ")");
    }
}
