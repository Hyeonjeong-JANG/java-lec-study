package ex02;

public class Pizza {
    public static void main(String[] args) {
        double area1 = 2 * 3.141592 * 20 *20;
        double area2 = 3.141592 * 30 * 30;
        System.out.println("20cm 피자 면적 = " + area1);
        System.out.println("30cm 피자 면적 = " + area2);
        System.out.println((area1 > area2)? "20cm 두 개를 시키는 것이 이득":"30cm 한 개를 시키는 것이 이득");
    }
}
