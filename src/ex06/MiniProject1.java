package ex06;

import java.util.Arrays;


// 헤헤헤 다시 해보자!!!

/**
 * 카드를 나타내는 Card 클래스를 작성하고 52개의 Card 객체를 가지고 있는 Deck 클래스를 작성한다. 각 클래스의 __str__() 메소드를 구현하여서 덱 안에 들어 있는 카드를 다음과 같이 출력한다.
 * 클럽, 다이아몬드, 하트, 스페이드
 * 에이스, 2, 3, 4, 5, 6, 7, 8, 9, 10, 잭, 퀸, 킹
 */


class Card {
    String name;
    String order;

    public Card() {
        String[] name = {"클럽", "다이아몬드", "하트", "스페이드"};
        String[] order = {"에이스", "2", "3", "4", "5", "6", "7", "8", "9", "10", "잭", "퀸", "킹"};
        String[] cardName = new String[(name.length) * (order.length)];
        for (int i = 0; i < (name.length) * (order.length); i++) {
            for (int j = 0; j < name.length; j++) {
                for (int k = 0; k < order.length; k++) {
                    cardName[i] = name[j] + order[k];
                }
            }
        }
        System.out.println(Arrays.toString(cardName));
    }

    public Card(String name, String order) {
        this.name = name;
        this.order = order;
    }

    @Override
    public String toString() {
        return "Card{" +
                "name='" + name + '\'' +
                ", order='" + order + '\'' +
                '}';
    }
}

class Deck {
    Card c = new Card();

}

public class MiniProject1 {
    public static void main(String[] args) {
        Card c = new Card();
    }
}
