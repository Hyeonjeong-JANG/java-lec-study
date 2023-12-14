package ex03;

// for를 이용해서 10*5짜리 별을 찍어보자.

public class NestedLoop {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
