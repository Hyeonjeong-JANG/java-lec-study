package ex03;

/**
 * 4. 1번 문제의 배열 farray에 저장된 값들의 합계를 계산하여 출력하는 코드를 작성하라.
 */
public class Farray01 {
    public static void main(String[] args) {

        // 1. 10개의 부동소수점 난수를 저장하는 배열 farray를 선언하고 생성하는 코드를 작성하라.
        double[] farray = new double[10];
        for (int i = 0; i < farray.length; i++) {
            double randomNumber = Math.random() * 100;
            farray[i] = randomNumber;
        }

        // 2. 배열의 크기는 어떻게 알 수 있는가?
        System.out.println("배열의 크기: " + farray.length);

        // 3. 1번 문제의 farray를 for-each 구문으로 출력하는 코드를 작성하라.
        for (double d : farray) {
            System.out.print(d + " ");
        }
        System.out.println();
        // 4.
        double sum = 0;
        for (int i = 0; i < farray.length; i++) {
            sum = sum + farray[i];
//            System.out.println(sum);
        }
        System.out.println("배열에 있는 값의 합은:" + sum);
    }
}
