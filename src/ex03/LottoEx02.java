package ex03;

import java.util.Arrays;
import java.util.Random;

public class LottoEx02 {
    public static void main(String[] args) {
        int arr[] = new int[6];
        Random r = new Random();
        int num;
        boolean isSame;

        // 1. 6바퀴 돌면서 로또 번호를 추첨할 예정
        // 2. 첫 번째 바퀴는 공을 꺼내서 추첨한 번호를 그대로 입력
        // 3. 두 번째 바퀴부터는 공을 꺼내서 이전에 추첨한 모든 번호와 비교(isSame 값 만들기)
        // 4. isSame == true(3번부터 다시 시작)
        // 5. isSame == false(공 집어넣기 - 3번부터 다시 시작)

        // 공 꺼내서 바로 추가하기
        for (int i = 0; i < 6; i++) {
            if (i == 0) {
                num = r.nextInt(45) + 1;
                arr[i] = num;
                continue; // if문을 빠져나가면서 밑에 코드 다 무시하고 다시 for문으로 올라가
            }

            while (true) {
                // 1. 공을 꺼내기
                isSame = false;
                num = r.nextInt(45) + 1; // i == 0 과 비교

                /**
                 * 2. 이전 번호들과 비교
                 * i == 1 (0과 비교)
                 * i == 2 (1, 0과 비교)
                 * i == 3 (2, 1, 0과 비교)
                 * i의 값보다 하나 작은 값부터 하나씩 줄어드는 숫자와 비교한다.
                 */
                for (int j = i - 1; j >= 0; j--) {
                    if (arr[j] == num) {
                        isSame = true;
                        break; // 가장 가까운 for문을 빠져나감.
                    }
                }

                // 3. 동일한 번호가 없을 때 값 추가하기
                if (!isSame) {
                    arr[i] = num;
                    break;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
