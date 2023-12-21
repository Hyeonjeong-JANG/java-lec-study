package ex05;

class President {
    // 싱글톤 패턴: 객체를 단 한 번만 메모리에 올릴 수 있는 패턴
    // 한 번만 띄우고 싶을 때 그냥 static으로 해도 된다. 다만 싱글톤으로 하면 static이 아니라 heap에도 띄울 수 있다. 둘 중 하나를 선택해서 씀.
    static President instance = new President(); // 메인 실행되기 전에 힙이 떠버린다.

    private President() {
    }
}

public class SingletonEx01 {
    public static void main(String[] args) {
        President p1 = President.instance;
        System.out.println(p1.hashCode());

        President p2 = President.instance;
        System.out.println(p2.hashCode());
    }
}
