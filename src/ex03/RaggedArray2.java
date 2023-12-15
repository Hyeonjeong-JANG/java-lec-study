package ex03;

// 레그드 배열 생성하기 120쪽 그림을 보자
public class RaggedArray2 {
    public static void main(String[] args) {
        int[][] rarray = new int[3][];
        rarray[0] = new int[]{1, 2, 3};
        rarray[1] = new int[]{4, 5, 6, 7};
        rarray[2] = new int[]{8, 9};

        for (int i = 0; i < rarray.length; i++) {
            for (int j = 0; j < rarray[i].length; j++) {
                System.out.println("rarray[" + i + "][" + j + "]" + rarray[i][j]);
            }
        }
    }
}
