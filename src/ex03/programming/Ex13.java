package ex03.programming;

/**
 * 카드를 랜덤하게 선택하여 화면에 출력하는 코드를 작서앻보자.
 * {"Clubs", "Diamonds", "Hearts", "Spades"}와
 * {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"}를
 * 가지고 있는 문자열 배열을 생성하고 이것들로부터 5장의 카드를 랜덤하게 선택하는 코드를 작성하라.
 * <p>
 * 출력예시
 * Diamonds의 10
 * Clubs의 8
 * Spades의 9
 * Diamonds의 9
 * Spades의 3
 */
public class Ex13 {
    public static void main(String[] args) {
        final String[] Symbol = {"Clubs", "Diamonds", "Hearts", "Spades"};//4
        final String[] Card = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};//13

        int symRandom = 1;
        int cardRandom = 1;
        for (int k = 0; k < 5; k++) {
            for (int i = 0; i < Symbol.length; i++) {//4
                for (int j = 0; j < Card.length; j++) {//13
                    symRandom = (int) (Math.random() * Symbol.length);
                    cardRandom = (int) (Math.random() * Card.length);
                }
            }
            System.out.println(Symbol[symRandom] + "의 " + Card[cardRandom]);
        }
    }
}
