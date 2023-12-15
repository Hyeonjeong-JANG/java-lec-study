package ex03;

public class TheaterSeats {
    public static void main(String[] args) {

        int[][] seats = {
                {0, 0, 0, 1, 1, 0, 0, 0, 0, 0}, // 0행
                {0, 0, 1, 1, 0, 0, 0, 0, 0, 0}, // 1행
                {0, 0, 0, 0, 0, 0, 1, 1, 1, 0}, // 2행
                {1, 1, 0, 0, 0, 0, 1, 1, 1, 0},// 3행
                {1, 1, 0, 0, 0, 0, 1, 1, 1, 0}// 4행
        };

        int sum = 0;
        int count = 0;
//        int row = -1;
//        int[] seat1 = seats[0]; // seat1에 seats의 0행을 담는다.
//        System.out.println(seats.length); // 행의 길이
//        System.out.println(seats[0].length); // seats[0] 행의 열의 길이

        for (int row = 0; row < seats.length; row++) {
            count = 0;

            for (int i = 0; i < seats[row].length; i++) {
                count = count + seats[row][i];
            }
            
            System.out.println(row + "번째 행의 관객 수는: " + count);
            sum = sum + count;
        }

        System.out.println("전체 관객 수는: " + sum);


        // -------------------------------이중 for문 풀어 쓴 것 시작
//        row++;
//        count = 0;
//        for (int i = 0; i < seats[row].length; i++) {
////            System.out.println(seat1[i]);
//            count = count + seats[row][i];
//        }
//        System.out.println(row + "번째 행의 관객 수는: " + count);
//        sum = sum + count;
//
//        row++;
//        count = 0;
//        for (int i = 0; i < seats[row].length; i++) {
////            System.out.println(seat2[i]);
//            count = count + seats[row][i];
//        }
//        System.out.println(row + "번째 행의 관객 수는: " + count);
//        sum = sum + count;
//
//        row++;
//        count = 0;
//        for (int i = 0; i < seats[row].length; i++) {
////            System.out.println(seat3[i]);
//            count = count + seats[row][i];
//        }
//        System.out.println(row + "번째 행의 관객 수는: " + count);
//        sum = sum + count;
//
//        row++;
//        count = 0;
//        for (int i = 0; i < seats[row].length; i++) {
////            System.out.println(seat3[i]);
//            count = count + seats[row][i];
//        }
//        System.out.println(row + "번째 행의 관객 수는: " + count);
//        sum = sum + count;
//
//        System.out.println("전체 관객 수는: " + sum);
        // -------------------------------이중 for문 풀어 쓴 것 끝


//        seats[0][7] = 1;
//        seats[0][7] = 0;
        // 값을 바꿔줄 수는 있지만 배열의 행이나 열을 삭제나 추가할 수는 없다(배열 구조 변경 안 됨)
    }
}
