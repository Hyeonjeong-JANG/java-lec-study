package ex08;

public class ArrayError {
    public static void main(String[] args) {
        int i = 0;
        int[] array = {1, 2, 3, 4, 5};
        try {
            for (i = 0; i < array.length + 1; i++) {
                System.out.println(array[i] + " ");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스 " + i + "는 사용할 수 없네요!");
        }

    }
}
