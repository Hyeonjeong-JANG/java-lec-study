package ex03.exercise;

// 코드에서 잘못된 부분을 찾아서 수정하자.
public class Ex11 {
    public static void main(String[] args) {
//        int a[10];
//        a[0]=100;
//        a[1]=1[0];

        int[] a = new int[10];
        a[0] = 100; // a[0]에는 100이 들어가고
        a[1] = a[0]; // a[1]에는 a[0]인 100이 들어간다.
    }
}
