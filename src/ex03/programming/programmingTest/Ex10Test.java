package ex03.programming.programmingTest;

// 배열의 최댓값 구하기 버블배열
public class Ex10Test {
    public static void main(String[] args) {
        double[] dArray = {1.0, 2.0, 3.0, 4.0};
        double temp;

        for (int j = 0; j < dArray.length - 1; j++) {
            if (dArray[j] > dArray[j + 1]) {
                temp = dArray[j];
                dArray[j] = dArray[j + 1];
                dArray[j + 1] = temp;

            }
        }

        for (int i = 0; i < dArray.length; i++) {
            System.out.print(dArray[i] + " ");
        }


    }
}
