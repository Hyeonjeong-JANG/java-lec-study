package ex06.example.example3;

public class Dark {
    String name;

    public Dark(String name) {
        this.name = name;
    }

    public void attack() {
        System.out.println("다크 탬플러가 공격합니다: ." + name);
    }
}
