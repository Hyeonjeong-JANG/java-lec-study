package ex06.example4;

public class StarApp {


    public static void gameStart(Protoss u1, Protoss u2) {
        u1.attack();
        u2.attack();
    }

    public static void main(String[] args) {
        Protoss zealot1 = new Zealot("zealot1"); // [Protoss, Zealot]
        Protoss dragoon1 = new Dragoon("dragoon1"); // [Protoss, Dragoon]
        Protoss river1 = new River("river1"); // [Protoss, River]
        Protoss dark1 = new Dark("dark1"); // [Protoss, Dark]

        gameStart(zealot1, dragoon1);
        gameStart(zealot1, river1);

    }
}
// 상속은 재정의 하기 위해서 하는 것이 아니라 타입을 일치시켜서 동적 바인딩을 하기 위해 하는 것이다.