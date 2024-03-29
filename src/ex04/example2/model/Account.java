package ex04.example2.model;

// 객체의 상태를 변경, 객체의 상태를 확인
public class Account {
    private final int id; // 계좌 번호(제약 조건: 숫자 4자리로 만들어져 있다.) 지금은 4자리니까 int로 했다. 계좌 번호는 번호지만 그 길이가 길기 때문에 String으로 만든다. 연산할 일이 없으니까.
    // final을 하려면 반드시 그 값이 초기화 되어야 한다. 그렇지 않으면 오류가 난다.
    private long balance; // 추후에 계좌 잔액 정보가 변경되기 때문에 메서드가 필요하다.
    private int userId;

    public boolean 잔액부족하니(long amount) { // 정상인 결과는 true, 내가 원하는 결과는 false를 받을 수 있게 긍정문으로 하는 것이 좋아. 무조건이야!!
        // 그렇지만 지금은 부정문으로 하겠다. 걸러낼 수 있게.
        if (balance < amount) {
            return true;
        }
        return false;
    }

    // 이체라는 메서드를 만든다면 그 안에 많은 일이 들어있기 때문에 어디서 잘못된 것인지 알 수가 없다. -> 그렇게는 만들지 마라.
    public void 출금(long amount) { // 메서드를 만들 때는 하나의 일만 시킨다. 출금만 한다. 계좌번호 확인은 불필요.
        this.balance = this.balance - amount;
    }

    public void 입금(long amount) {
        this.balance = this.balance + amount;
    }

    // 생성자
    public Account(int id, long balance, int userId) {
        this.id = id;
        this.balance = balance;
        this.userId = userId;
    }

    @Override
    public String toString() { // 객체 내부의 값을 출력할 때 toString을 만들어 두면 편함
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", userId=" + userId +
                '}';
    }
}
