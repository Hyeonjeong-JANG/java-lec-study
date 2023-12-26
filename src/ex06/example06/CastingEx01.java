package ex06.example06;

class Protoss {
//    public void attack() {
//    } // 이렇게 부모가 들고 있으면 오버라이딩 해서 쓸 수 있는데 이게 없다면?
};

class Zealot extends Protoss {
    public void attack() {
        System.out.println("질럿이 공격합니다.");
    }
};

class Dragoon extends Protoss {
    public void attack() {
        System.out.println("드라군이 공격합니다.");
    }
};

public class CastingEx01 {
    public static void start(Protoss p) {
        if (p instanceof Zealot) {
            Zealot u = (Zealot) p; // 부모를 자식에게 대입할 수 없다.
            u.attack();
        }

        if (p instanceof Dragoon) {
            Dragoon u = (Dragoon) p; // p가 u보다 더 큰거라 깎아서 들어가야 해.
            u.attack();
        }
    }

    public static void main(String[] args) {
        start(new Zealot());
        start((new Dragoon()));
    }
};
