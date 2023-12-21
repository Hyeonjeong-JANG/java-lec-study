package ex05;

public class PizzaPizzaTest {
    public static void main(String[] args) {
        PizzaPizza p1 = new PizzaPizza("Super Supreme");
        PizzaPizza p2 = new PizzaPizza("Cheese");
        PizzaPizza p3 = new PizzaPizza("Pepperoni");

        int n = PizzaPizza.count;
        System.out.println("지금까지 판매된 피자 개수: " + n);
    }
}
