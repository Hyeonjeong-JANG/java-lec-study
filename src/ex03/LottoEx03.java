package ex03;

import java.util.Arrays;
import java.util.Random;

public class LottoEx03 {
    public static void main(String[] args) {
        int arr[] = new int[6];
        Random r = new Random();
        int num;
        boolean isSame;

        for (int i = 0; i < 6; i++) {

            isSame = false;
            num = r.nextInt(45) + 1;

            arr[i] = num;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] == num) {
                    i--;
                    break;
                }
            }

            if (isSame) {
                i--;// isSame이 true일 때, i를 하나 감소시켜서 다시 현재 위치를 돌린다는 뜻이다.
            } else {
                arr[i] = num;
            }
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
