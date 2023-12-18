package ex03.test;

public class BinaryTest02 {
    public static void main(String[] args) {
        // target을 찾고 몇 번만에 찾았는지, 그 배열이 위치하는 곳이 어디인지 찾기!
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // mid=start+()
        final int N = arr.length;
        int mid = N;
        int searchEnd = 0, searchStart = 0;
        final int target = 6;
        int count = 0;

        while (true) {
///////////////////// 같을 경우
            if (target == arr[mid / 2]) {
                count++;
                System.out.println("타겟은 arr[" + mid / 2 + "]에 위치해 있습니다.");
                System.out.println(count + "번 만에 타겟을 찾았습니다.");
                break;
            }

/////////////////////// 중간값이 타겟보다 더 클 경우
            if (target < arr[mid / 2]) { // 이게 문제임.
                count++;
                mid = mid / 2;
                searchStart = (searchEnd - N) / 2;// 이게 0이 오면 안 됨. 처음에는 0, 두 번째는
                searchEnd = mid - 1;
//                System.out.println(midStart);
            }

/////////////////////// 중간값이 타겟보다 더 작을 경우
            if (target > arr[mid / 2]) {
                count++;
                mid = mid / 2;
                searchStart = mid + 1;
                searchEnd = N - 1;
            }
        }
        System.out.println("시간복잡도: " + Math.log(N) / Math.log(2));
    }
}
