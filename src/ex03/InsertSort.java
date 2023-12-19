package ex03;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {9, 5, 3, 6, 8};

        int firstTurn = 0, temp = 0, indexCheck = 0;
        int i;
        // 이건 아예 그때그때 자리를 바꿔줘야 한다.
        // 1번과 0번을 비교하고
        // 두 값을 각각 바꿔준 후
        // 그 값을 배열에 알맞은 순서로 넣어줌

        /////////////////1)

        i = 0;
        if (arr[i + 1] < arr[i]) {//i+1 i
            temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }

        System.out.print("1차: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();

/////////////////2)
        i = i + 1;
        if (arr[i + 1] < arr[i]) {//2 1
            temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }

        i = i - 1;
        if (arr[i + 1] < arr[i]) { //1 0
            temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }

        System.out.print("2차: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();

        ////////////////////////////////3)
        if (arr[3] < arr[2]) { //3 2
            temp = arr[2];
            arr[2] = arr[3];
            arr[3] = temp;
        }

        if (arr[2] < arr[1]) { //2 1
            temp = arr[1];
            arr[1] = arr[2];
            arr[2] = temp;
        }

        if (arr[1] < arr[0]) { //1 0
            temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }

        System.out.print("3차: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();

        // 4)
        if (arr[4] < arr[3]) { //i+3
            temp = arr[3];
            arr[3] = arr[4];
            arr[4] = temp;
        }

        if (arr[3] < arr[2]) { //3 2
            temp = arr[2];
            arr[2] = arr[3];
            arr[3] = temp;
        }

        if (arr[2] < arr[1]) { //2 1
            temp = arr[1];
            arr[1] = arr[2];
            arr[2] = temp;
        }

        if (arr[1] < arr[0]) { //1 0
            temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }

        System.out.print("4차: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
    }
}