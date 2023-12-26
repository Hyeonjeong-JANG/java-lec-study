package ex07.programming.ex07;

/**
 * java.util 패키지에 있는 Iterator 인터페이스를 구현하는 클래스 CardDeck을 작성하라. Iterator 인터페이스는 다음 메소드를 가지고 있다.
 * - boolean hasNext(): 반환할 요소가 있으면 true를 반환한다.
 * - Object next(): 반복의 다음 요소를 반환한다.
 * - void remove(): 이 반복자가 반환한 마지막 요소를 기본 컬렉션에서 제거한다.
 * <p>
 * CardDeck 클래스는 내부에 13장의 카드가 저장된 객체 배열을 가지고 있다.
 * 첫 번째 next() 호출은 카드 2개를 반환하고 이어서 카드 3, 카드 4, ..., 카드 Ace까지를 반환한다.
 * 클래스 CardDeck을 테스트하기 위해 main() 메소드를 작성한다.
 * 출력 예시
 * next()가 반환하는 값: 2
 * next()가 반환하는 값: 3
 */
public class CardDeck {
    public static void main(String[] args) {
        String[] cardArr = new String[13];
    }
}
