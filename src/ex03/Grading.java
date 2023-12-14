package ex03;

import java.util.Scanner;

// 90이상이면 A, 80 이상이고 90 미만이면 B, 70 이상이고 80 미만이면 C
public class Grading {
    public static void main(String[] args) {
        int grade;
        Scanner sc = new Scanner(System.in);
        System.out.print("성적을 입력하시오: ");
        grade = sc.nextInt();
//        System.out.println(grade);

        if (grade >= 90) {
            System.out.println("A학점");
        } else if (grade >= 80 && grade < 90) {
            System.out.println("B학점");
        } else if (grade >= 70 && grade < 80) {
            System.out.println("C학점");
        } else if (grade >= 60 && grade < 70) {
            System.out.println("D학점");
        } else {
            System.out.println("F학점");
        }
    }
}
