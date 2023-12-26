package ex06.programming.ex01;

class Circle {
    protected int radius;

    public Circle(int r) {
        radius = r;
    }

};

public class Pizza extends Circle {

    public Pizza(int r) {
        super(r);
    }

    public Pizza(String kind, int size) {
        super(10);
        System.out.println("피자의 종류: " + kind + ", 피자의 크기: " + size);
    }

    public static void main(String[] args) {
        Pizza obj = new Pizza("Pepperoni", 20);
    }
};
