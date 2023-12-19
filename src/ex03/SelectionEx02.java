package ex03;

public class SelectionEx02 {
    public static void main(String[] args) {
        int[] arr = {5, 4, 6, 7, 2, 3, 4, 5, 67, 0};
        final int arrSize = arr.length;
        int standardIndex, minIndex;

        for (int j = 0; j < arrSize - 1; j++) {
            standardIndex = j;
            minIndex = standardIndex;

            for (int i = standardIndex; i < arrSize; i++) { // for문을 기준 인덱스부터 배열의 전체 길이 미만으로 돌림
                if (arr[minIndex] > arr[i]) {
                    minIndex = i;
                }
            }

            if (standardIndex != minIndex) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[standardIndex];
                arr[standardIndex] = temp;
            }
        }

        for (int arangedArr : arr) {
            System.out.print(arangedArr + " ");
        }
    }
}
