package ex03;

// 프로그램에서는 이 방식을 이용한다.
// 이 방식으로 찾으면 데이터 1개 찾을 때 5, 2개 찾을 때 10,... 5n이 되자너. 풀스캔으로 찾으려면 n이야. 여러 개의 데이터를 찾으려면 풀스캔이 나을 수도 있어.
// 풀스캔의 성능이 이진 트리의 성능을 앞설 때도 있다.
public class BinarySearch {
    public static void main(String[] args) {
        // N = 21
        // 시간복잡도 log2(N) -> log2(21) -> 4.xxx (최대 5번이면 끝남)
        // 이진 검색 => 반드시 정렬이 되어 있어야 한다.
        // 21 / 2*2*2*2*2 -> logn -> log21
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int N = arr.length;
        final int target = 2;
        int start = 0;
        int end = N - 1; // 21 - 1
        int mid;

        int round = 1;
        while (true) {
            // 1 회전
            mid = start + ((end - start) / 2);
            System.out.println("mid: " + mid);
            if (arr[mid] == target) {
                System.out.println(round + "회전 : " + target + "값은 " + mid + "번지에 있습니다");
                break;
            }

            if (arr[mid] < target) { // 기대값 start 5, end 8
                start = mid + 1;
            }

            if (arr[mid] > target) {
                end = mid - 1;
            }

            System.out.println(round + "회전 start : " + start);
            System.out.println(round + "회전 end : " + end);

            round++;
        }

        System.out.println("시간복잡도 : " + (Math.log(N) / Math.log(2))); // 이것보다 최악은 없다는 뜻이야.
    }
}
