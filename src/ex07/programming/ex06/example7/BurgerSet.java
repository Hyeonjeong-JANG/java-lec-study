package ex07.programming.ex06.example7;

public class BurgerSet { // has Burger, Coke
    private Burger burger; // 컴포지션 결합 코드
    private Coke coke;

    public BurgerSet(Burger burger, Coke coke) {
        this.burger = burger;
        this.coke = coke;
        System.out.println("버거 세트가 만들어졌어요. ");
    }

    public int getTotalPrice() {
        return burger.getPrice() + coke.getPrice();
    }

    public Burger getBurger() {
        return burger;
    }

    public Coke getCoke() {
        return coke;
    }
}
