package ex03;

public class ArrayEx01 {
    public static void main(String[] args) {
        int[] arr = new int[3]; // 배열의 선언 방법
        // 시작 번지가 4라면 4 + 12 = 16 - 1, 4~15번지까지 저장되는 거야.
        // 타입이 없으면 배열을 만들 수 없어. 타입이 있어야 연속된 공간이 확보되기 때문이야.

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        for (int i = 0; i <= 2; i++) {
            System.out.println(arr[i]);
        }
    }
}
