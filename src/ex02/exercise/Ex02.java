package ex02.exercise;

public class Ex02 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "def";
        String s3 = s2;
        s2 = "ghi";
        // 예상해보자
        // abcghidef
        System.out.println(s1 + s2 + s3); // abcghidef
    }
}
