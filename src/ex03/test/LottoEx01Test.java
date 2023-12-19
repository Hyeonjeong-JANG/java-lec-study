package ex03.test;

import java.util.Random;

public class LottoEx01Test {
    public static void main(String[] args) {
        int arr[] = new int[6]; // 아직 값을 알 수 없을 때는 배열의 크기를 정해서 선언만 해 놓는다.
        Random r = new Random();

        int num;

        for (int i = 0; i < arr.length; i++) { // 0 1 2 3 4 5
            if (i == 0) {
                num = r.nextInt(45) + 1; // 0부터 45 이전까지의 수가 나오기 때문에 1~45를 뽑으려면 1을 더해줘야 한다.
                arr[i] = num;
            } else {
                while (true) {
                    // i와 -2, -3, ... 이렇게 비교를 해 줘야 해.i-j가 0이 될 때까지...
                    num = r.nextInt(45) + 1;
                    for (int j = 1; j < arr.length - 1; j++) { //  1 2 3 4
                        // j=1 i=0  j=2 i=1 j=2 i=0
                        if ((arr[j - i] != num) && (j - i > 0)) {
                            arr[i] = num;
                            break;
                        }
                        /**
                         * i-j
                         * 0 1   0 2   0 3   0 4   0 5
                         * 1 1   1 2   1 2   1 4   1 5
                         * 2 1   2 2   2 3   2 4   2 5
                         * 3 1   3 2   3 3   3 4   3 5
                         * 4 1   4 2   4 3   4 4   4 5
                         * 5 1   5 2   5 3   5 4   5 5
                         * j-i
                         *
                         * 1 2 3 4 5
                         * 0 1 2 3 4
                         * -1
                         */
                    }


//                    if (arr[i - 2] != num) {
//                        arr[i] = num;
//                        break;
//                    }
//                    if (arr[i - 3] != num) {
//                        arr[i] = num;
//                        break;
//                    }
//                    if (arr[i - 4] != num) {
//                        arr[i] = num;
//                        break;
//                    }
//                    if (arr[i - 5] != num) {
//                        arr[i] = num;
//                        break;
//                    }
//                    for (int j = ; j <=i ; j++) {
//
//                    }
                } // 이렇게만 돌리면 뭐가 문제냐!! 0에는 들어가고 1과 0을 비교해서 들어가는데
            }
        }
//        System.out.println(Arrays.toString(arr)); // 이렇게 하면 안에 있는 것을 다 보여준다..
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
