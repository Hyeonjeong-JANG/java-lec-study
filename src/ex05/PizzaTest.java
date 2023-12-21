package ex05;

/**
 * 20cm 피자 2개를 주문하는 게 나을지, 아니면 30cm피자 1개를 주문하는 것이 나을지를 결정해주는 메소드를 작성해 보자.
 */

class Pizza {
    int radius;

    Pizza(int r) {
        radius = r;
    }

    Pizza whosLargest(Pizza p1, Pizza p2) {
        if ((p1.radius * p1.radius * 2) > (p2.radius * p2.radius)) {
            return p1;
        } else {
            return p2;
        }
    }
}

public class PizzaTest {
    public static void main(String[] args) {
        Pizza obj1 = new Pizza(20);
        Pizza obj2 = new Pizza(30);

        Pizza largest = obj1.whosLargest(obj1, obj2);
        System.out.println(largest.radius + "인치 피자를 사는 것이 낫다.");
    }
}
