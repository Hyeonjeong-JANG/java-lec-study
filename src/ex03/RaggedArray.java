package ex03;

// 이거 잘 모르겠음. 뭐 어떤 말을 하고 싶은 지는 알겠지만 for문 안에 출력된 001012 이게 무슨 뜻인지 모르겠음.
public class RaggedArray {
    public static void main(String[] args) {
        int[][] ragged = new int[3][]; // 0 1 2
        ragged[0] = new int[1]; // 0
        ragged[1] = new int[2]; // 0 1
        ragged[2] = new int[3]; // 0 1 2

//        System.out.println(ragged.length);// 3

        for (int r = 0; r < ragged.length; r++) {
//            System.out.println(r);// 0 1 2
            for (int c = 0; c < ragged[r].length; c++) {
//                System.out.println(c); // 0 0 1 0 1 2
                ragged[r][c] = c;
                System.out.println(ragged[r][c]);
                /**
                 * ragged[0][0] = 0
                 * ragged[1][0] = 0
                 * ragged[1][1] = 1
                 * ragged[2][0] = 0
                 * ragged[2][1] = 1
                 * ragged[2][2] = 2
                 *
                 */
            }
        }
    }
}
