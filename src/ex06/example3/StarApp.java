package ex06.example3;

public class StarApp {

    ////////////////////질럿이 공격
    public static void gameStart(Zealot u1, Dragoon u2) {
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Zealot u1, Zealot u2) {
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Zealot u1, River u2) {
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Zealot u1, Dark u2) {
        u1.attack();
        u2.attack();
    }

    ///////////////// 드라군이 공격
    public static void gameStart(Dragoon u1, Zealot u2) {
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Dragoon u1, River u2) {
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Dragoon u1, Dragoon u2) {
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Dragoon u1, Dark u2) {
        u1.attack();
        u2.attack();
    }

    /////////////// 리버가 공격
    public static void gameStart(River u1, Zealot u2) {
        u1.attack();
        u2.attack();
    }

    public static void gameStart(River u1, River u2) {
        u1.attack();
        u2.attack();
    }

    public static void gameStart(River u1, Dragoon u2) {
        u1.attack();
        u2.attack();
    }

    public static void gameStart(River u1, Dark u2) {
        u1.attack();
        u2.attack();
    }

    ///////////////////// 다크가 공격
    public static void gameStart(Dark u1, Zealot u2) {
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Dark u1, River u2) {
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Dark u1, Dragoon u2) {
        u1.attack();
        u2.attack();
    }

    public static void gameStart(Dark u1, Dark u2) {
        u1.attack();
        u2.attack();
    }

    public static void main(String[] args) {
        Zealot zealot1 = new Zealot("zealot1");
        Zealot zealot2 = new Zealot("zealot2");
        Dragoon dragoon1 = new Dragoon("dragoon1");
        Dragoon dragoon2 = new Dragoon("dragoon2");
        River river1 = new River("river1");
        River river2 = new River("river2");
        Dark dark1 = new Dark("dark1");
        Dark dark2 = new Dark("dark2");

        gameStart(zealot1, dark1);

    }
}
