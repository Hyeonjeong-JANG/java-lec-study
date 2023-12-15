package ex03.test;

public class BubbleTest05 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3};

        final int N = arr.length;

        int temp;
        // 필요한 변수는 i랑 i+1
        // 배열을 넘어서는 값은 쓸 수 없어. n-1번 비교해야 한다는 것을 잊어선 안 된다.
        // 1회전
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
