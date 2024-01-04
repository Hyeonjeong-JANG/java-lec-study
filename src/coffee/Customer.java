package coffee;

// 주문의 책임이 있다.
// 의존적인 관계는 생성자를 통해서 주입받는다(?)
public class Customer {
    private Barista barista;

    public Customer(Barista barista) {
        this.barista = barista;
    }

    public void order(String menuName) {
        // 고객이 바리스타에게 커피를 만들라고 한다 -> 고객은 바리스타에게 의존적이다.
        Coffee coffee = barista.makeCoffee();
        System.out.println(coffee.name + "를 받았습니다.");

    }
}
