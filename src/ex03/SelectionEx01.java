package ex03;

public class SelectionEx01 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3};
        final int N = arr.length;
        int rep, min;

        for (int j = 0; j < N - 1; j++) {
            rep = j; // min값은 계속 바뀌기 때문에 rep를 따로 변수로 해두는 것이 좋다.
            min = rep;

            for (int i = rep; i < N; i++) {
                if (arr[min] > arr[i]) {
                    min = i;
                }
            }

            if (rep != min) {
                int temp = arr[min];
                arr[min] = arr[rep];
                arr[rep] = temp;
            }
        }

        for (int v : arr) { // for each문 짱 편함
            System.out.print(v + " ");

        }
    }
}
