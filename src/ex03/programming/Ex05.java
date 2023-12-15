package ex03.programming;

/**
 * 2개의 주사위를 던지는 게임이 있다고 가정하자.
 * 2개 주사위의 합이 6이 되는 경우는 몇 가지나 있을까?
 * 합이 6이 되는 경우의 수를 출력하는 프로그램을 작성해 보자.
 */
public class Ex05 {
    public static void main(String[] args) {
        int dice1 = 1;
        dice1 = (int) (Math.random() * 6);
        int dice2 = 1;
        dice2 = (int) (Math.random() * 6);
//        System.out.println(dice1);
//        System.out.println(dice2);
        int count = 0;
        for (int i = 1; i <= 6; i++) {
            if (dice1 == dice2) {
                count++;
            }
        }
        System.out.println("주사위를 던져서 같은 수가 나올 경우의 수는: " + count + "/" + (6 * 6));// 약분을 해야 하는데. 나중에 해보자
    }


}
