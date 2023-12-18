package ex03.test;

public class SelectionEx01Test {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3};
        final int N = arr.length;

        // 인덱스 숫자를 변수로!!
        // 변경해야될 위치 5 -> rep(replace)
        // 변경해야될 위치 8 -> min
        final int rep = 0;
        int min = rep;

//        if (arr[rep] > arr[rep + 1]) { // 5, 8, 2, 4, 3 비교를 해보고 왼쪽이 더 크면 min값이 바뀌어야 한다.
//            min = rep + 1;
//        }

        for (int i = rep; i < N; i++) {
            if (arr[min] > arr[i]) {
                min = i;
            }
        }

//        i = i + 1; // 1
//        if (arr[min] > arr[i]) { // arr[0]은 rep가 아니라 min이다. rep는 변하지 않아.
//            min = i;
//        }
//
//        i = i + 1; // 2
//        if (arr[min] > arr[i]) {// min+2
//            min = i; // 2
//        }
//
//        i = i + 1; // 3
//        if (arr[min] > arr[i]) {
//            min = i;
//        }
//
//        i = i + 1;
//        if (arr[min] > arr[i]) {
//            min = i;
//        }

        if (rep != min) {
            int temp = arr[min];
            arr[min] = arr[rep];
            arr[rep] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
