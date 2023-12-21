package ex05;

public class PizzaPizza {
    private String toppings;
    private int radius;
    static final double PI = 3.141592;
    static int count = 0;

    public PizzaPizza(String toppings) {
        this.toppings = toppings;
        count++;
    }
}
