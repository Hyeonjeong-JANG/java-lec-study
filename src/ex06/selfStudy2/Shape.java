package ex06.selfStudy2;

class Shape {
    protected int x, y;

    public void draw() {
        System.out.println("Shape Draw");
    }
}

class Rectangle extends Shape {
    private int width, height;

    public void draw() {
        System.out.println("Rectangle Draw");
    }
}

class Triangle extends Shape {

    private int base, height;

    public void draw() {
        System.out.println("Triangle Draw");
    }
}

class Circle extends Shape {
    private int base, height;

    public void draw() {
        System.out.println("Circle Draw");
    }
}
