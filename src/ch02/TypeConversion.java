package ch02;public class TypeConversion {
    public static void main(String[] args) {
        int i;
        double f;

        f = 1 / 5; // 1은 정수이고 그것을 정수 5로 나누면 실수로 표현되는 값은 0.2이지만 정수는 소수점 아래의 값을 버리므로 그 값이 0이 된다.
        System.out.println(f);

        f=(double) 1 / 5;
        System.out.println(f); // 1과 5는 정수이지만 double로 형변환이 되었기 때문에 그 둘을 연산한 값은 실수인 0.2가 된다.

        i = (int)1.7 + (int)1.8;
        System.out.println(i); // 1.7과 1.8은 실수이지만 int로 형변환 되었기 때문에 소수점의 값을 버림하여 1과 1이 된다.
    }
}
