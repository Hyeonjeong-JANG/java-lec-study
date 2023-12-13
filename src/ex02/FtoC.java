package ex02;

import java.util.Scanner;

public class FtoC {
    public static void main(String[] args) {
//        1번) 화씨를 입력받아서 섭씨로 변환한 후 나중에 이프문으로 선택하는 방법
//        Scanner sc = new Scanner(System.in);
//        System.out.print("화씨 온도를 입력하시오: ");
//        double f_temp = sc.nextDouble();
//        System.out.println(f_temp);
//        double c_temp = 5.0 / 9.0 * (f_temp - 32.0);
//        System.out.println("섭씨 온도는 " + c_temp);
//
//        System.out.println("섭씨를 원하면 1, 화씨를 원하면 2를 입력해 주세요.");
//        int k = sc.nextInt();
//        if(k == 1){
//            System.out.println("섭씨 " + c_temp);
//        } else if(k == 2){
//            System.out.println("화씨 " + f_temp);
//        } else{
//            System.out.println("섭씨 " + c_temp);
//            System.out.println("화씨 " + f_temp);
//            System.out.println("둘 다 보세요.");
//        }
        
//        2번) 처음에 어떤 온도로 변환할지를 결정하고 그 값을 입력받아 보여주는 방법
        Scanner sc = new Scanner(System.in);
        System.out.println("섭씨를 화씨로 변화하고 싶다면 1, 화씨를 섭씨로 변환하고 싶다면 2를 입력하세요.");
        int k = sc.nextInt();
        if(k == 1){
            System.out.println("섭씨 온도를 입력해 주세요.");
            double c_temp = sc.nextDouble();
            double f_temp = c_temp * 9.0 / 5.0 + 32.0;
            System.out.println("섭씨 "+ c_temp+"도는 화씨로 "+f_temp+"도입니다.");
        } else if(k==2){
            System.out.println("화씨 온도를 입력해 주세요.");
            double f_temp = sc.nextDouble();
            double c_temp = 5.0 / 9.0 * (f_temp - 32.0);
            System.out.println("화씨 "+ f_temp+"도는 섭씨로 "+c_temp+"도입니다.");
        }else{
            System.out.println("정확하게 입력해 주세요.");
        }

    }
}
