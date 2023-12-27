package ex07.programming.ex06.example7;

public class LotteApp {
    public static void main(String[] args) {
        Burger b1 = new Burger("기본 버거", 1000);
        Burger b2 = new ShrimpBurger("새우 버거", 2000, "새우");
        Coke c1 = new Coke("콜라", 1000);
        System.out.println();
        BurgerSet set1 = new BurgerSet(new Burger("기본 버거", 1000), new Coke("콜라", 1000));
        System.out.println("총 가격은 " + set1.getTotalPrice());
    }
}
