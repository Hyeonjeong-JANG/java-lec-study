package ex03.programming;

/**
 * "Hello", "Java" "World"를 가지고 있는 문자열의 배열을 생성해보자. 화면에 배열 요소를 출력하는 프로그램을 작성해본다.
 * 출력 예시
 * Hello
 * Java
 * World
 */
public class Ex11 {
    public static void main(String[] args) {
        final String[] HJW = {"Hello", "Java", "World"};
        for (int i = 0; i < HJW.length; i++) {
            System.out.println(HJW[i]);
        }
    }
}
