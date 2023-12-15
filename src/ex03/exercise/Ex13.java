package ex03.exercise;

// double형 배열 values의 각 요소를 0으로 초기화하는 문장을 작성하라.
public class Ex13 {
    public static void main(String[] args) {
        double[] arr = new double[3];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
        System.out.println((int) arr[0]);
        System.out.println((int) arr[1]);
        System.out.println((int) arr[2]);
    }
}
