package ex08;

class Account extends Object {
    private String author;
    private int number;
    private int balance;

    public Account(String author, int number, int balance) {
        this.author = author;
        this.number = number;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "author='" + author + '\'' +
                ", number=" + number +
                ", balance=" + balance +
                '}';
    }
}

public class ObEx01 {
    public static void main(String[] args) {
        Account account1 = new Account("홍길동", 1111, 10000);
        Account account2 = new Account("홍길동", 1111, 10000);
        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account1.getClass());
        System.out.println(account1.hashCode());

        // ==
        // 기본 자료형을 비교할 때는 값, 나머지는 주소를 비교함.

        int num = 10;
        int k = 10;
        if (account1.toString() == account2.toString()) {
            System.out.println("같아요.");
        } else {
            System.out.println("달라요.");
        }

        // account -> equals()(오브젝트) -> 주소 비교
        // account1.toString() -> equals() (주소 비교 and 값 비교)
        if (account1.toString().equals(account2.toString())) {
            System.out.println("같아요?");
        }

        String s1 = new String("물");
        String s2 = new String("물");
        System.out.println(s1.equals(s2));

    }
}
