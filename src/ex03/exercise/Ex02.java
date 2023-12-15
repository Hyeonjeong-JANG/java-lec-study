package ex03.exercise;

// 다음 프로그램의 출력은 무엇인가?

public class Ex02 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) { // b
            switch (i) { //
                case 0:
                    break;
                case 1:
                    System.out.println("one");
                case 2:
                    System.out.println("two");
                case 3:
                    System.out.println("three");
            }
        }
        System.out.println("done");
    }
}
