package ex03.exercise;

// 컴파일 하자!
public class Ex14 {
    public static void main(String[] args) {
//        int[] array = new int[10];
//        int i = array[10];

        // 배열이 10칸밖에 없는데 11칸을 불러오면 오류가 난다. 10번째 배열은 arr[9]이다.
        int[] array = new int[10];
        int i = array[9];
        System.out.println(i);
    }
}
