package ex04;

// 설계도
class People {
    String name; //  여기의 name의 스코프는 heap
    int power;
    int hp;

    // 초기화는 생성자를 만들어서 한다. 꼭꼭꼭!!!
    // 시간이 지나서 변해야 하는 것은 메서드로!!!
    // alt + insert - construct
    // shift + 방향키로 연속 선택 가능
    public People(String name, int power) { // 여기의 name의 스코프는 stack
        this.name = name; // this는 자신의 heap을 말함
        this.power = power;
        this.hp = 100;
    }

    // 행위
    public void upgradePower() {
        this.power++; // this는 heap거
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", hp=" + hp +
                '}';
    }
}

public class PersonEx01 {
    public static void main(String[] args) {
        People p1 = new People("티모", 10);
        System.out.println("태어남");
        System.out.println(p1);

        p1.upgradePower();
        System.out.println("1회 업그레이드");
        System.out.println(p1);
    }
}
