package ex03.test;

public class BubbleTest03 {
    public static void main(String[] args) {
        int[] arr = {4, 3};
        int temp = 0;
        temp = arr[0]; // temp = 4
        arr[0] = arr[1];// arr[1]=4;
        arr[1] = temp;
        System.out.println(arr[0] + "," + arr[1]);


    }
}
