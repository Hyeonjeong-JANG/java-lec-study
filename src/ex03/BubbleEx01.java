package ex03;

public class BubbleEx01 {

    ///////////////----------------- 버블 메서드 시작 ----------------------//////////////////
    // 메서드(행위)는 메인 위에 만들자
    static void bubble(int[] arr) { // static을 호출할 때는 class 이름으로 찾는다.

        final int N = arr.length;

        int temp;

        for (int loop = 1; loop < N; loop++) {

            for (int i = 0; i < N - loop; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }

            System.out.print(loop + "회전");
            for (int i = 0; i < N; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
    ///////////////----------------- 버블 메서드 끝 ----------------------//////////////////


    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3};
        BubbleEx01.bubble(arr); // class이름.메서드 이름으로 호출하는 것이 원칙인데
//        bubble(arr); // 같은 클래스 안에 있는 메서드 이름만으로 불러올 수 있다.
        System.out.println();
        int[] arr2 = {5, 3000, 8, 100, 2, 4, 3, 700};
        BubbleEx01.bubble(arr2);
    }
}
