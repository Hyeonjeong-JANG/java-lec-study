package ex03;

import java.util.Arrays;

public class ArrayTest4 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};

        // 배열에서 for-each 사용하기
        for (int value : numbers) { // value에 배열 numbers가 들어가버림?
            System.out.print(value + " ");
        }

        // toString() 메소드를 사용해 배열의 모든 요소의 값을 출력하기
        System.out.print(Arrays.toString(numbers)); // 이건 막 \n을 안 해도 알아서 배열처럼 출력해줌.
    }
}
