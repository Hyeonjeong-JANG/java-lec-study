package ex03;

import java.util.Random;

public class LottoEx01 {
    public static void main(String[] args) {
        int arr[] = new int[6]; // 아직 값을 알 수 없을 때는 배열의 크기를 정해서 선언만 해 놓는다.
        Random r = new Random();

        int num;

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                num = r.nextInt(3) + 1; // 0부터 45 이전까지의 수가 나오기 때문에 1~45를 뽑으려면 1을 더해줘야 한다.
                arr[i] = num;
            } else {
                while (true) {
                    num = r.nextInt(3) + 1;
                    if (arr[i - 1] != num) {
                        arr[i] = num;
                        break;
                    }
                } // 이렇게만 돌리면 뭐가 문제냐!! 0에는 들어가고 1과 0을 비교해서 들어가는데
            }
        }
//        System.out.println(Arrays.toString(arr)); // 이렇게 하면 안에 있는 것을 다 보여준다..
    }
}
